package com.company;

public class Main {

    public static void main(String[] args) {
    Computer computer = new Computer();
    Computer computer1 = new Computer("gray");
        System.out.println("Computer");
        System.out.println(computer1.getColor());
    }
}
//    Конструктор - это специальный метод, который вызывается при создании нового объекта.
// Дефолтный конструктор по умолчанию - это конструктор который не имеет параметров.
//  Конструктор нужен для автоматической инициализации переменных.
// Целью конструктора является создание объекта, когда каждый раз мы пользуемся оператором "new"
// вызываем конструктор и создается новый объект.
// this - это для того чтобы вызвать конструктор одного типа из другого.


