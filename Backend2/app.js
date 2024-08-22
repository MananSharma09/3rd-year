import express from 'express'

import { creatUser, deleteUser, getUser, getUsers, loginUser, updateUser } 
from './controllers/userController.js';
import { router } from './routes/userRoute.js';

const app = express();
app.use(express.urlencoded({extended:true}));
app.use(express.json())

app.use("/api", router)
export default app;