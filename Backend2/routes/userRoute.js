import express from "express";
import { creatUser, deleteUser, getUser, getUsers, loginUser, updateUser } from "../controllers/userController.js";

export const router = express.Router();

router.post("/user", creatUser)

router.get("/user",getUsers)

router.get("/get/user/:id",getUser)

router.put("/get/user/:id", updateUser)

router.delete("/get/user/:id",deleteUser)

router.post("/user/login",loginUser)

