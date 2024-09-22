//Exception Handling

try{
    num = prompt("Enter a number")
    if(num==='')
        throw 'Cannot be empty'
    if(isNaN(num))
        throw "Enter a valid Number"
    console.log(num**2)
}
catch(error){
    console.log(error)
}
finally{
    console.log('bye')
}
async function fn()
{
    return 'helo'
}
console.log(fn())
fn().then((msg)=>console.log(msg))
async function asyncstatus() {
    console.log('hi ..')
    res=await reachA 
    console.log(res)
    console.log('bye')

}
asyncstatus()