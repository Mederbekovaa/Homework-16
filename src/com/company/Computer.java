package com.company;

public class Computer {
    private double ram;
    private String user;

    public Computer(double ram) {
        this.ram = ram;
    }


    public Computer(String user) {
        this.user = user;
    }

    public String getUser(){ return user; }
    public void setUser(String user){ this.user = user;}


    public double getRam() {
        return ram;
    }

    public void setRam(double ram) {
        this.ram = ram;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private String color;

    public Computer(double v, String abc){
    }

    @Override
    public String toString(){
        return ram + " " + color + " " + user;
    }
}
