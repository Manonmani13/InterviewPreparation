
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
    message()
    {
        console.log("you have 100GB Free ")
    }
}
let paidUser1=new PaidUser();
paidUser1.message()
