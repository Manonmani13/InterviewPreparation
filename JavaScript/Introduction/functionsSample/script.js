function isPostive(num) {
    return num > 0;
}
console.log(isPostive(-2));

function sayHello() {
    console.log('hello');
}

function findProduct(a, b) {
    return a * b;
}
console.log(findProduct(4, 7));

function greet(name = 'there') {
    console.log('hi', name);
}
greet('mano');

function factorial(n) {
    if (n === 1) return 1;
    return n * factorial(n - 1);
}
console.log(factorial(5));

let a = 100;
let isEven = function(n) {
    return n % 2 === 0;
};
console.log(isEven(4));

let arr = [2, 3, 4, 5, 6, 7];
let findSum = function(arr) {
    let sum = 0;
    for (let l of arr) {
        sum += l;
    }
    return sum;
};
console.log(findSum(arr));

let volume = function(l, b, m) {
    return l * b * m;
};

let area = r => Math.PI * r * r;
console.log(area(5));

let prod = function(...args) {
    let result = 1;
    for (let val of args) {
        result *= val;
    }
    return result;
};
console.log(prod(5, 3, 3, 1, 2));

let prod2 = function() {
    let result = 1;
    for (let i = 0; i < arguments.length; i++) {
        result *= arguments[i];
    }
    return result;
};

function* indexGenerator() {
    let index = 1;
    while (true) {
        yield index++;
    }
}
const gen = indexGenerator();
console.log(gen.next().value);

function greetConsole(name) {
    console.log('hello', name);
}

function greetHeading(name) {
    const heading = document.querySelector('h1');
    heading.innerHTML = 'hello ' + name;
}

// function greet(callback) {
//     callback('mano'); // Call the callback function
// }
greet(greetConsole);

arr = ['deepa', 'suresh', 'ramya'];
arr.forEach(print);
function print(val) {
    console.log(val);
}

arr.forEach(val => console.log(val));

arr.forEach((val, index, arr) => {
    arr[index] = val.toUpperCase();
});
console.log(arr);

con = ['ECE', 'IT', 'CSC', 'EEE'];
con.forEach(val => {
    const opt = document.createElement('option');
    opt.textContent = val;
    opt.value = val;
    // document.getElementById('branch').appendChild(opt); // Uncomment to append
});

console.clear();

let priceUSD = [20, 35, 13];
let priceINR = priceUSD.map(x => x * 83);
console.log(priceINR);

function convert(val) {
    return val * 83;
}

const input = [
    { name: 'john', age: 15 },
    { name: 'Radha', age: 45 },
    { name: 'Kaushik', age: 12 },
    { name: 'Anu', age: 21 }
];
let age = input.map(x => x.age);
console.log(age);

let cost = [12, 234, 13, 43, 34, 55];
let lessThan100 = cost.filter(x => x <= 100);
console.log(lessThan100);

let carTotal = cost.reduce((total, el) => total + el, 0);
console.log(carTotal);

let arr2d = [
    ["a", "b", "c"],
    ["c", "d", "f"],
    ["d", "f", "g"]
];

// Flatten and reduce to count occurrences
let count = arr2d.flat().reduce((accumulator, currentVal) => {
    if (accumulator[currentVal]) {
        accumulator[currentVal]++;
    } else {
        accumulator[currentVal] = 1;
    }
    return accumulator;
}, {});

console.log(count);

//remove duplicates
array=[1,2,3,2,1]
let unique=[]
for( let a of array)
{
   if(!unique.includes(a))
   {
    unique.push(a)
   }
}
console.log("unique "+unique)

//uppercase
Name="Robert Geroge"
uniqueupper="";
for(let a of Name)
{
    if(a==a.toUpperCase()&& a!=' ')
    {
        uniqueupper+=a;
    }
}
console.log(uniqueupper)

//sum of positive
n=[1,2,-1.2,4]
sum=0
for( let no of n)
{
    if(no>0)
    {
        sum+=no;
    }
}
console.log(sum)
function outer() {
    let outerVariable = "Bread";
    function inner() {
        let innerVariable = 'Butter';
        console.log('inner variable:', innerVariable);
        console.log('outer variable:', outerVariable);
    }
    return inner; // Return the inner function
}

let call1 = outer(); // Now this will call outer and assign the inner function to call1
call1();
function makeAdder(x)
{
    return function(y)
    {
        return x+y
    }
}
let add5=makeAdder(5)
 console.log(add5(10))
//memory management
let bigNum=9007199254740991n
const bigNum2=BigInt(9007199254740991)
let b=100
b=200
let obj1={name:'Danya',age:24}
let ob2=obj1
obj1.age=25
ob2.name='ramya'
console.log('obj1',obj1)
console.log('obj2',ob2)

//set
let a1=[1,2,3,2,1];
let myset1=new Set(a1)
console.log(a1)
console.log(myset1)
let myset2=new Set()
myset2.add(4)
myset2.add(5)
myset2.add('pqr')
myset2.add({'a':1,'b':2})
myset2.add(4)
console.log(myset2)
console.log(myset1.has('2'))
console.log(myset1.delete(3))

let map1=new Map()
map1.set('a',1);
map1.set('b',2);
map1.set('a',3);
console.log(map1)
console.log(map1.size)
console.log(map1.has('c'))
console.log(map1.delete('a'))
map1.set('d',2)
map1.set('e',3)
for(let i of map1)
{
    console.log(i)
}
for(let [k,v] of map1)
    {
        console.log(v)
    }
    for(let k of map1.keys())
    {
        console.log(k)
    }
    map1.forEach((v,k)=>{
        console.log('key',k,'value',v)
    })
