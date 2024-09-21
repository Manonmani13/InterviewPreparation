function isPostive(num)
{
    return num>0
}
console.log(isPostive(-2))
function sayHello()
{
    console.log('hello')
}
function findProduct(a,b)
{
    return a*b;
}
console.log(findProduct(4,7))
function greet(name='there')
{
    console.log('hi',name)
}
greet('mano')
function factorial(n)
{
    if(n==1)
        return 1;
    return n*factorial(n-1)
}
console.log( factorial(5))
let a=100
let isEven =function(n)
{
    return n%2==0
}
console.log(isEven(4))
let arr=[2,3,4,5,6,7]
let findSum=function(arr)
{
    let sum=0
    for(let l of arr)
    {
        sum+=l
    }
    return sum;
}
console.log(findSum(arr))
let volume=function(l,b,m)
{
    return l*b*m;
}
let area=r=>Math.PI*r*r
console.log(area(5))

let prod=function(...args)
{
    let result=1;
    for(let val of args)
    {
        result*=val
    }
        return result;
}
console.log(prod(5,3,3,1,2))
let prod2=function()
{
    let result=1;
    for(i=0;i<arguments.length;i++)
    {
        result*=arguments[i]
    }
    return result;
}
function*   indexGenerator(){
    let index=1
    while(true)
    {
        yield index++;
    }
}
const gen=indexGenerator()
console.log(gen.next().value)
function greetConsole(name)
{
    console.log('hello',name)
}
function greetHeading(name)
{
    const heading=document.querySelector('h1')
    heading.innerHTML='hello'+name
}
function greet(callback)
{
    callback('mano')
}
greet(greetConsole)