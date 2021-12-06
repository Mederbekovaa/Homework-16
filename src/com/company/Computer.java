package com.company;

public class Computer {
    public Computer(double ram) {
        this.ram = ram;
    }

    public Computer(String color) {
        this.color = color;
    }
    public Computer(char user) {
        this.user = user;
    }

    public char getUser(){ return user; }
    public void setUser(char user){ this.user = user;}
    private char user;

    public double getRam() {
        return ram;
    }

    public void setRam(double ram) {
        this.ram = ram;
    }

    private double ram;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private String color;


    public Computer(){

    }
}
