import mongoose from "mongoose";
import { User } from "../models/userModel.js";

export const creatUser=async(req,res)=>{
    try{
        const {name,email,password,username,mobile}=req.body
        if(!name || !email || !password || !username || !mobile){
            return res.status(400).json({
                success:false,
                message: "Please enter all fields..."
            })
        }
        const user=await User.create({
            name,
            email,
            password,
            username,
            mobile
        })

        //! Sending response
        res.status(201).json({
            success:true,
            message: "User created successfully"
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

export const getUsers =async(req,res)=>{
    try{
        const users =await User.find()

        if(!users){
            return res.status(400).json({
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
        
    }
    catch(error){
        res.status(500).json({
            success: false,
            message: error.message
        })
    }
}