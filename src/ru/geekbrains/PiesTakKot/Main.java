package ru.geekbrains.PiesTakKot;

public class Main {

    public static void main(String[] args) {
        Dog sharic = new Dog();
        Dog tuzic = new Dog();
        Dog bimka = new Dog();

        Cat murzic = new Cat();

        int dogCount = Dog.dogCount;
        System.out.println("У нас есть " + dogCount + " пса.");

        sharic.run(100);
        sharic.run(200);
        sharic.run(200);

        murzic.swim(0);
    }
}
