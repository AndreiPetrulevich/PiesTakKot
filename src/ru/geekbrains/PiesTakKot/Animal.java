package ru.geekbrains.PiesTakKot;

public abstract class Animal {
    private int toRun;
    private int toSwim;

    public Animal(int toRun, int toSwim) {
        this.toRun = toRun;
        this.toSwim = toSwim;
    }

    public int getToRun() {
        return toRun;
    }

    public int getToSwim() {
        return toSwim;
    }

    public abstract void run(int toRun);

    public abstract void swim(int toSwim);
}
