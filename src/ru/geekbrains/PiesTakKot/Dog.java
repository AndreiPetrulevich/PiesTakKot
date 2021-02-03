package ru.geekbrains.PiesTakKot;

public class Dog extends Animal{
    static int dogCount;
    static int dogCanRun = 500;
    static int dogCanSwim = 10;


    public Dog () {
        super(dogCanRun, dogCanSwim);
        dogCount++;
    }



    @Override
    public void run (int toRun) {
        if (toRun >= 0 && toRun <= dogCanRun) {
            dogCanRun -= toRun;
            System.out.println("Пэс пробежал " + toRun + " м., осталось " + dogCanRun + " м.");
        } else {
            System.out.println("Пэс столько не пробежит!");
        }

    }

    @Override
    public void swim (int toSwim) {
        if (toSwim >= 0 && toSwim <= dogCanSwim) {
            dogCanSwim -= toSwim;
            System.out.println("Пэс проплыл " + toSwim + " м., осталось " + dogCanRun + " м.");
        } else {
            System.out.println("Пэс столько не проплывет");
        }
    }
}
