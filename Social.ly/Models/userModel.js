import mongoose from "mongoose"

const userSchema=new mongoose.Schema({
    name:{
        type : String,
        required : [true,"Please add a first name"],
        minlength : [3,"First name must be at least 3 characters"]
    },
    middleName:{
        type : String
    },
    lastName:{
        type : String,
        required: true,
    },
    email:{
        type : String,
        required : [true,"Plese add an emial"],
        unique : true,
    },
    password:{
        type : String,
        required : true,
        select : false,
        minlength:[8,"Password must be atleast 8 characters"],
    },
    dob:{
        type : Date,
        required : [true,"Please add Date of Birth"],
        default : Date.now
    },
    mobile:{
        type : Number,
        required : true,
        minlength : [10,"Mobile number must be atleast 10 digits"],
        maxlength : [10,"Mobile number must be at Max 10 digits"],
        unique : true,
    },
    username:{
        type : String,
        required : [true,"Please enter username"],
        unique : true,
    },
    bio:{
        type : String,
        default : " ",
        maxlength : [200,"Bio must be atmost 200 characters"] 
    },
    gender:{
        type : String,
        required: true,
        enum :['male','female','other'],
        default : male
    },
    avatar:{
        public_id:{
            type : String,
            default:'', 
        },
        url:{
            type:String,
                default:'',
            }
    },
    followers:[
        {
            type : mongoose.Schema.Types.ObjectId,
            ref:'User'
        }
    ],
    following:[
        {
            type:mongoose.Schema.Types.ObjectId,
            ref:'User'
        }
    ],
})