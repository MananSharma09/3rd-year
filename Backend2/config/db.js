import mongoose from "mongoose"
export const connectDB=()=>{
    mongoose.connect(process.env.DB_URL)
    .then((data)=>{
        console.log(`MongoDB Connected: ${data.connection.host}`);
    })
    .catch((error)=>{
        console.error(error);
    })
}

export const connectDatabase=async()=>{
    try{
        const data =await mongoose.connect(process.env.DB_URL)
        console.log(`MongoDB Connected:${(await data).Connection.host}`);
    }
    catch(error){
        console.error(error);
    }
}