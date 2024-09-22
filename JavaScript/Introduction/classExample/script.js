
class User
{
    static numberOfuser=0
    constructor(name,age)
    {
        //instance variable
        this.name=name;
        this.age=age;
        numberOfuser++;
    }
    login()
    {
        console.log('hi',this.name)
        console.log('you are logged in')

    }
    logout()
    {
        console.log("you are logged out")
    }
    static displaytotalUser()
    {
        console.log("toal user number is "+this.numberOfuser)
    }
}
let userOne=new User('vidtya',23)
userOne.login()
userOne.logout()
//static

//inheritance
class PaidUser extends User{
    constructor(name,age)
    {
        super(name,age)
        storage=100
    }
    message()
    {
        console.log("you have 100GB Free ")
    }
    //overriding
    login()
    {
        console.log("Thank you for login")
        return this;
    }
}
let paidUser1=new PaidUser('Mano',23);
paidUser1.message()
//method chaining
paidUser1.login().message()

function User(name,age)
{
        this.name=name;
        this.age=age;
        // this.loginu=function()
        // {
        //     console.log("you are logged in")
        // }

}
User.prototype.loginu=function()
{
    console.log('hi',this.name)
    console.log("you are logged in")
}
let user1=new User('Mano',23)
user1.loginu()

//get and set
class Temperature
{
    constructor( temp  )
    {
        this.temp=temp
    }
    get temp()
    {
        return this.temp
    }
    set temp(temp)
    {
        if(temp>100)
            temp=100
        this.temp=temp
    }
}
let  temp1=new Temperature(25)
temp1.temp=140
console.log(temp1.temp)