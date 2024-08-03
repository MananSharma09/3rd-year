// import {add1,sub1,add} from "./module1.js"
// const fs=require('fs');
// const {sub,add}=require('./module1');

// import fs from 'fs';


// console.log(fs);
// console.log(add(2,3));
// console.log(add1(2,3));
// console.log(sub1(2,3));
// console.log(sub(2,3));

//! Reading File
// import { error } from "console";
// import fs from "fs"
// try{
//     const data=fs.readFileSync('package.json','utf-8');
//     console.log("Data: ",data);
// }
// catch(error){
//     console.error("Error: ",error);
// }

//!Writing File
// //*   Asynchronopusly
// import fs from 'fs';
// fs.writeFile('example.txt','Hello World!',err=>{
//     if(err){
//         console.error('Error writing file :',err);
//         return ;
//     }
//     console.log('File Written successfully');
// });

//! Append File
// try{
//     fs.appendFileSync('example.txt','Hello Again !');
//     console.log('File appended successfully');
// }
// catch(err)
// {
//     console.log('Error appending to file : ',err);
// }


//!Deleting File
// try{
//     fs.unlinkSync('example.txt');
//     console.log('File deleted successfully');
// }catch(err){
//     console.error('Error deleting file :',err);
// }

//!Working with directories
// try{
//     fs.mkdirSync('example');
//     console.log('Folder created successully');
// }catch(err){
//     console.error('Error making folder: ',err);
// }


// let i=1;
// const x=setInterval(()=>{
//     try{
//         fs.writeFileSync(`file${i}.txt`,`This is file ${i}`)
//         console.log(`File${i} created`);
//         i++;
//         if(i>5)
//             clearInterval(x);
//     }catch(err)
//     {
//         console.error('Error creating file :',err);
//     }
// },2000);


// let j=1;
// const y=setInterval(()=>{
//     try{
//         fs.unlinkSync(`file${j}.txt`)
//         console.log(`File${j} deleted`);
//         j++;
//         if(j>5)
//             clearInterval(y);
//     }catch(err)
//     {
//         console.error('Error creating file :',err);
//     }
// },2000);



// import http from "http"
// import url from "url"
import express from 'express'

const app = express();

app.get("/",(req,res)=>{
    console.log(req.query);
    req.query.name ? res.send(`My name is ${req.query.name} \n`) : res.send("Home Page");
})

app.get("/about",(req,res)=>{
    res.send("About Page");
})

// const server = http.createServer(app)

const PORT = 4000;
app.listen(PORT, () => {
    console.log(`Server is running on http://localhost:${PORT}`);
})


// function handleFunction(req,res){
//     const URL = url.parse(req.url, true);
//     console.log(URL);

//     if (req.method === "GET") {
//         if (URL.pathname === "/") {
//             URL.query.name ? res.write(`My name is ${URL.query.name}`) :
//                 res.write("Home Page \n")
//         } else if (URL.pathname === "/about") {
//             URL.query.name ? res.write(`My name is ${URL.query.name} and 
//                 I'm a ${URL.query.title} \n`) :
//                 res.write("About Page \n");
//         } else {
//             res.write("Page Not Found \n");
//         }
//     } else {
//         res.write("GET Request \n")
//     }

//     res.write("Home Page \n");
//     res.end("Working...");
// }
