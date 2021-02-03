package ru.geekbrains.PiesTakKot;

public class Cat extends Animal{
    static int catCount;
    static int catCanRun = 200;
    static int catCanSwim = 0;

    public Cat () {
        super(catCanRun, catCanSwim);
        catCount++;
    }

    @Override
    public void run (int toRun) {
        if (toRun >= 0 && toRun <= catCanRun) {
            catCanRun -= toRun;
            System.out.println("Котэ пробежал " + toRun + " м., осталось " + catCanRun + " м.");
        } else {
            System.out.println("Котэ столько не пробежит!");
        }

    }

    @Override
    public void swim (int toSwim) {
        if (toSwim >= catCanSwim) {
            System.out.println("Котэ не умеет плавать");
        }
    }

}
