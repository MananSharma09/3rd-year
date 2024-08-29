import e from "express";
import bcrypt from "bcrypt"
import mongoose from "mongoose";
import jwt from "jsonwebtoken"
const userSchema = new mongoose.Schema({
    name: {
        type: String,
        required: true
    },
    username: {
        type: String,
        required: true
    },
    email: {
        type: String,
        required: true,
        unique:true
    },
    password: {
        type: String,
        required: true,
        select:false
    },
    mobile:{
        type: Number,
        required: true
    }
})

userSchema.pre("save",async function(next){
    if(!this.isModified("password")){
        next()
    }
    // const salt=await bcrypt.genSalt(10)
    this.password=await bcrypt.hash(this.password,10);
})

userSchema.methods.comparePassword = async function(candiatePassword){
    const isMatch =await bcrypt.compare(candiatePassword,this.password)
    return isMatch;
}

userSchema.methods.generateToken = async function(){
    return jwt.sign({_id:this._id},process.env.JWT_SECRET,{
        expiresIn: process.env.JWT_EXPIRE
    })
}

export const User = mongoose.model("User",userSchema);