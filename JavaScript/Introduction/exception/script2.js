let json1="Dave"
let json2=4
let json3=true
let json4=[4,5,6,7]
let json6=`[
    {
        "Stock":"TCS",
        "Price":3500
    },
    {
        "Stock":"HUL",
        "Price":2500
    },
    {
        "Stock":"SBI",
        "Price":550
    }
]`;
let parsed=JSON.parse(json6)
console.log(parsed[1].Price)
console.log(JSON.stringify(parsed))
fetch('https://en.wikipedia.org/wiki/HTML')
.then(res=res.json())
.then(msg=>console.log(msg.line1,msg.line2,msg.line3,msg.tam_exp))
.catch(err=>console.log( err))