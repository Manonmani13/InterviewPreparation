let item={
    name:'phone',
    price:25000,
    quantity:1,
    dimensions:{
        length:7,
        breadth:3.5,
        height:.5
    }
}
let item2=new Object();
item2.name="charger"
item2.price=700
item2.quantity=1
console.log(item2)
console.log(item.price)
item.price=26000
console.log(item['price'])
for(let i=1;i<=5;i++)
{
    console.log("hello")
}
let i;
for(i=10;i>=1;i--)
{
    console.log(i)
}
i=10;
while(i>=1)
{
    console.log(i)
    i--;
}
console.log('outside loop',i)
console.log('do while loop')
do{
    console.log(i)
    i--;
}while(i>=1)

while(true)
    {
        let num=Number(prompt('enter a number'))
        if(!isNaN(num))
        {
        break;

        }
    } 
let arr=['apple','orange','graphes']   
for(let a of arr)
    console.log(a)

let item={
    name:'phone',
    price:25000,
    quantity:1
}
for(let key of item)
{
    console.log(key)
}