package com.company;

public class User {
    String name;
    double login;
    int age;
    String password;

    public User(String name, double login, int age, String password, boolean blocked) {
        this.name = name;
        this.login = login;
        this.age = age;
        this.password = password;
        this.blocked = blocked;
    }

    public String getName() { return name;}
    public void setName(String name) { this.name = name; }

    public double getLogin() { return login; }

    public void setLogin(double login) { this.login = login; }

    public int getAge() { return age; }

    public void setAge(int age) {
        if (age<0){
            this.age=10;
        }else {
            this.age = age;
        }
         }

    public String getPassword() { return password; }

    public void setPassword(String password) { this.password = password; }

    public boolean isBlocked() { return blocked; }

    public void setBlocked(boolean blocked) { this.blocked = blocked; }

    boolean blocked;

    @Override
    public String toString(){
        return name + " " + login + " " + age + " " + password;
    }
}
