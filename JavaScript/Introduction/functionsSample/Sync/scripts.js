const tatkalBook=new Promise((resolve,reject)=>{
    let bookingSuccess=true;
    if(bookingSuccess)
        resolve()
    else
    reject()
})
tatkalBook.then(success).catch(failure)
function success()
{
    console.log("Thanks buddy ! I will transfer the amt")
}
function failure()
{
    console.log("Thanks for trying ! I will book a bus")
}