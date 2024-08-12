const express=require("express");
const users=require('./data.json')
const fs=require('fs')
const app=express();
app.use(express.urlencoded({extended:false}));

app.get('/api/users',(req,res)=>{
    res.send(users);
})

app.post('/api/create/user',async(req,res)=>{
    try{
        const body=req.body;
        console.log(body);
        users.push({...body,id:users.length+1})
        fs.writeFileSync('data1.json',JSON.stringify(users));
        res.send("User Added successfully");
    }
    catch(error){
        console.error(error);
    }
})

app.put("/api/users/:id",(req,res)=>{
    const id=req.params.id;
    const body=req.body;
    console.log(body);
    users.map(user=>{
        if(user.id==id)
            user.first_name=body.first_name;
    })
})

app.delete('/api/users/:id',(req,res)=>{
    const id=req.params.id;
    users.splice(id-1,1);
    res.send("User deleted successfuly");
})




const PORT=2000;
app.listen(2000,()=>{
    console.log(`Server is running on http://localhost:${PORT}`);
})