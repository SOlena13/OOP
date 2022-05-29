package com.company;

public class Buyer {
    private int budget;
    private int age;
    private int fishka;

    public Buyer(int budget, int age, int fishka) {
        this.budget = budget;
        this.age = age;
        this.fishka = fishka;
    }

    void permission(){
        if (age >= 18);
        System.out.println("Ви можете здійснювати покупки у цьому магазині");
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public int getAge() {
        return age;
    }

    public void setAge() {
        this.age = age;
    }

    public int getFishka() {
        return fishka;
    }

    public void setFishka(int fishka) {
        this.fishka = fishka;
    }
}


