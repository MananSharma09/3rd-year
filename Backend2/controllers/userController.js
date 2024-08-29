import mongoose from "mongoose";
import { User } from "../models/userModel.js";
import bcrypt from "bcrypt"
import jwt from "jsonwebtoken"

export const creatUser=async(req,res)=>{
    try{
        const {name,email,password,username,mobile}=req.body

        if(!name || !email || !password || !username || !mobile){
            return res.status(400).json({
                success:false,
                message: "Please enter all fields..."
            })
        }

        let user=await User.findOne({email})
        if(user){
            return res.status(400).json({
                success: 400,
                message: "User already Exists"
            })
        }
        
        user=await User.create({
            name,
            email,
            password,
            username,
            mobile
        })

        const token=await user.generateToken();

        const options = {
            expires : new Date(Date.now()+process.env.
            COOKIE_EXPIRE *24*60*60*1000),
            httpOnly: true,
            sameSite: "none",
            secure: true
        }

        res.cookie("token", token, options).status(201).json({
            success:true,
            message: "User created successfully",
            user,
            token
        })

        // res.status(200).json({
        //     success: true,
        //     message:"User created successfully"
        // })
    }
    catch(error){
        res.status(500).json({
            success:false,
            message: error.message
        })
    }
}

// export const creatUser=async(req,res)=>{
//     try{
//         const {name,email,password,username,mobile}=req.body
//         console.log(req.body);
        
//         if(!name || !email || !password || !username || !mobile){
//             return res.status(400).json({
//                 success:false,
//                 message: "Please enter all fields..."
//             })
//         }

        
//         const user=await User.create({
//             name,
//             email,
//             password,
//             username,
//             mobile
//         })

//         //! Sending response
//         res.status(201).json({
//             success:true,
//             message: "User created successfully"
//         })
//     }
//     catch(error)
//     {
//         res.status(500).json({
//             success: false,
//             message: error.message
//         })
//     }
// }

export const getUsers =async(req,res)=>{
    try{
        const users =await User.find()

        if(!users){
            return res.status(404).json({
                success: false,
                message: "No user found"
            })
        }
        res.status(200).json({
            success: true,
            users
        })
    }
    catch(error){
        res.status(500).json({
            success: false,
            message: error.message
        })
    }
}

export const getUser=async(req,res)=>{
    try{
        const id=req.params.id
        const user=await User.findById(id);
        if(!user){
            return res.status(404).json({
                success: false,
                message: "No user Found"
            })
        }
        res.status(200).json({
            success: true,
            user
        })
    }
    catch(error){
        res.status(500).json({
            success: false,
            message: error.message
        })
    }
}

export const updateUser=async(req,res)=>{
    try{
        const {name,username,email,password,mobile}=req.body
        const id=req.params.id

        if(!name && !email && !password && !username && !mobile){
            return res.status(400).json({
                success:false,
                message: "Please enter all fields..."
            })
        }
        const user=await User.findById(id);
        if(!user)
        {
            return res.status(404).json({
                success: false,
                message: "No user Found"
            })
        }
        user.name=name || user.name;
        user.username=username || user.username;
        user.email=email || user.email;
        user.password=password || user.password;
        user.mobile=mobile || user.mobile;

        await user.save();

        res.status(200).json({
            success: true,
            message: "User updated successfully"
        })
    }
    catch(error){
        res.status(500).json({
            success: false,
            message: error.message
        })
    }
}

export const deleteUser=async(req,res)=>{
    try{
        const id=req.params.id;

        const user=await User.findById(id);

        if(!user){
             return res.status(404).json({
                success: false,
                message: "No user Found"
            })
        }
        
        await User.findByIdAndDelete(id); 

        res.status(200).json({
            success: true,
            message: "User deleted successfully"
        })
    }
    catch(error)
    {
        res.status(500).json({
            success: false,
            message: error.message
        })
    }
}

// export const loginUser=async(req,res)=>{
    // try{
    //     const{email,password}=req.body;
    //     if(!email || !password)
    //     {
    //         return res.status(404).json({
    //             success: false,
    //             message: "Please enter email and password fields"
    //         })
    //     }
    //     const user=await User.findOne({email}).select("+password");
    //     if(!user){
    //         return res.status(404).json({
    //            success: false,
    //            message: "No user Found"
    //        })
    //    }

    //     if(user.password!=password)
    //     {
    //         res.status(404).json({
    //             success: false,
    //             message: "Incorrect password"
    //         })
    //     }
    //     res.status(200).json({
    //         success: true,
    //         message: "User logged in successfully"
    //     })
        
    // }catch(error){
    //     res.status(500).json({
    //         success: false,
    //         message: error.message
    //     })
    // }
// }

export const loginUser=async(req,res)=>{
    try{
        const {email,password}=req.body

        if(!email || !password)
        {
            return res.status(400).json({
                success:false,
                message:"Please enter all fields"
            })
        }

        const user=await User.findOne({email}).select("+password");

        if(!user){
            return res.status(404).json({
                success: false,
                message: "User not found"
            })
        }

        const isMatch=user.comparePassword(password);
        if(!isMatch)
        {
            return res.status(401).json({
                success:false,
                message: "Invalid credentials"
            })
        }

        const token=await user.generateToken();

        const options={
            expires: new Date(Date.now()+process.env.
            COOKIE_EXPIRE*24*60*60*1000),
            secure: true,
            httpOnly:true,
            sameSite:"none"
        }

        res.cookie("token",token,options).status(200).json({
            success:true,
            message:"User logged in successfully",
            user,
            token
        })
    }
    catch(error){
        res.status(500).json({
            success: false,
            message: error.message
        })
    }
}