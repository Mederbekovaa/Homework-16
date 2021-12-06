package com.company;

public class Main {

    public static void main(String[] args) {
        Computer computer = new Computer(12.6,"abc");
        System.out.println();
        HarDisk harDisk = new HarDisk(12,4);
        System.out.println(harDisk);
        Display display = new Display(15,"Hewlett-Packard");
        System.out.println(display);
        Klavishi klavishi = new Klavishi(12,true,false);
        System.out.println(klavishi);
        Ram ram = new Ram(16,"China");
        System.out.println(ram);
        UsbPort usbPort = new UsbPort("hsb","gdj");
        System.out.println(usbPort);
        User user = new User("Aleks",123,19, "abc", true);
        System.out.println(user);


    }

}


// Перегрузка методов - это  методы с одним и тем же именем, но с разными типами или кол-во параметрами.
// Object - это базовый класс в Java.
