import express from "express";
import users from './data.json' assert {type:'json'};
import {home,about} from "./Controller/userController.js"
// const express=require("express")
// const users=require('./data.json')
const app = express();


app.use(express.urlencoded({extended:false}));

// app.use((req,rea,next)=>{
//     console.log(`Server is running at ${req.protocol}://${req.hostname}:${PORT}/${req.path}`);
//     next();
// })


app.get("/", home)


app.get("/about",about)




app.get("/contact",(req,res)=>{
    req.query.name && req.query.email && req.query.phone ? res.send(`My is name is ${req.query.name},
        email is ${req.query.email} and phon is ${req.query.phone}`):
    res.send("Contact Page");    
})

app.get("/search",(req,res)=>{
    req.query.q && req.query.encode ? res.send(`Q is : ${req.query.q} and  encode is ${req.query.encode}`):
    res.send("Search");
})

app.get("/users",(req,res)=>{
    res.send(users);
})

app.get("/api/users",(req,res)=>{
    const html=`
    <ul>
        ${users.map(users=>`<li>${users.first_name}</li>`).join('')}
    </ul>`
    res.send(html);
})

app.get("/users/:id",(req,res)=>{
    const id = req.params.id                            //!handling dynamic path
    const user = users.find(user=>user.id==id)              
    res.send(user);
})

app.post('/api/users',(req,res)=>{
    const body=req.body;
    console.log(body);
    users.push({...body,id:users.length+1})
    res.send("User Added Successfully")
})

app.put("/api/users/:id",(req,res)=>{
    const id=req.params.id;
    const body=req.body
    console.log(body);
    users.map(user=>{
        if(user.id==id)
            user.first_name=body.first_name
    })
    // users[id]=body
    res.send("User Added successfully")
})

app.delete("/api/users/:id",(req,res)=>{
    const id=req.params.id;
    users.splice(id-1,1);

    res.send("User Deleted successfully")
})




export default app;