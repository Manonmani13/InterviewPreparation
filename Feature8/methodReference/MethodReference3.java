package com.methodReference;

public class MethodReference3 {
    public static void main(String[] args) {
        IUser iuser=User :: new ;
        User user=iuser.getUser("Mano");
        System.out.println(user.getName());
    }
}

class User
{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        super();
        this.name = name;
    }
}


