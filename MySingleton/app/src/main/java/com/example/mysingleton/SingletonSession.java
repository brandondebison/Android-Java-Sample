package com.example.mysingleton;


public class SingletonSession {

    private static SingletonSession instance;
    private String username;
    //no outer class can initialize this class's object
    private SingletonSession() {}

    public static SingletonSession Instance()
    {
        //if no instance is initialized yet then create new instance
        //else return stored instance
        if (instance == null)
        {
            instance = new SingletonSession();
        }
        return instance;
    }

    //Creating the Getter

    public String getUsername() {
        return username;
    }

    //Creating the Setter

    public void setUsername(String username) {
        this.username = username;
    }
}