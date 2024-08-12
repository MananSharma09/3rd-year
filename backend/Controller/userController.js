

export const home = (req,res)=>{
    res.send("Home Page");
}

export const about=(req,res)=>{
    (req.query.name) && (req.query.title) ? res.send(`My name is ${req.query.name} \n  My title is ${req.query.title}`):
    res.send("Home Page")
}