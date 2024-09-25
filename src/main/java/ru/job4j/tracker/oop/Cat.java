package ru.job4j.tracker.oop;

public class Cat {
    private String name;
    private String food;

    public void show() {
        System.out.println("Name : " + this.name);
        System.out.println("Food : " + this.food);
    }

    public void giveName(String nik) {
        this.name = nik;
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public static void main(String[] args) {
        System.out.println("There is gav's food");
        Cat gav = new Cat();
        gav.giveName("gav");
        gav.eat("cutlet");
        gav.show();
        System.out.println("There is black,s food");
        Cat black = new Cat();
        black.giveName("black");
        black.eat("fish");
        black.show();
    }
}
