// let i=1;
// let a = setInterval(()=>{
//     console.log(i*i);
//     i++;
//     if(i==7)
//     {
//         console.log("Thank You");
//         clearInterval(a);
//     }
// },2000);



let cnt=0;
function handle()
{
    cnt++;
    console.log(cnt*cnt);

    if(cnt==6){
        console.log("Thank You");
        clearInterval(id);
    }
}

let id = setInterval(handle,2000);
