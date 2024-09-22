export default class Car{
    drive()
    {
        console.log("driving")
    }
}
export function fillGas()
{
    console.log('filling gas')
}
export function repair()
{
console.log('Reparing ')
}
//this is one option
// export default Car
// export {fillGas,repair}

console.log('hello')
function Sync()
{
    console.log('step 1')
    console.log('step 2')
    console.log('step 3')

}
Sync()
let a=100
let b=20
let c=a+b
setTimeout(()=>console.log('step1'),4000)
setTimeout(()=>console.log('step2'),2000)
setTimeout(()=>console.log('step3'),3000)
console.log('bye')