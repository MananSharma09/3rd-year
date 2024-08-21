import express from 'express'

import { creatUser, getUser, getUsers } from './controllers/userController.js';

const app = express();
app.use(express.urlencoded({extended:true}));

app.post("/api/user", creatUser)

app.get("/api/user",getUsers)

app.get("/api/get/user/:id",getUser)

export default app;