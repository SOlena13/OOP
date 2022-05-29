package com.company;

public class ComputerShop {

    public static void main(String[] args) {

        Laptop lp = new Laptop("Apple Macbook", "white", 60000);
        Laptop lp1 = new Laptop("ASUS", "black", 45000);

        Phone ph = new Phone("Samsung", "charger", 25000, 256);
        Phone ph1 = new Phone("IPhone", "nothing", 35500, 1);

        LoundSpeakers ls = new LoundSpeakers("JBL", "grey", 14600, 1, 24,5.1);

        Buyer br = new Buyer(58500, 38, 15000);

        System.out.println("Ваш бюджет: "+br.getBudget());
        System.out.println("Ваш вік: "+br.getAge());
        System.out.println("-------------");

        System.out.println("Фірма: "+lp.getFirm());
        System.out.println("Колір: "+ lp.getColor());
        System.out.println(lp.getPrice() + "UAH");
        lp.buy();
        System.out.println("-------------");

        System.out.println("Фірма: "+lp1.getFirm());
        System.out.println("Колір: "+lp1.getColor());
        System.out.println(lp1.getPrice() + "UAH");
        System.out.println("-------------");

        System.out.println("Марка: "+ph.getFirm());
        System.out.println("В комплекті: " +ph.getComplement());
        System.out.println(ph.getPrice() + "UAH");
        System.out.println(ph.getMemory() + "GB");
        ph.gift(25000);
        System.out.println("-------------");

        System.out.println("Марка: "+ph1.getFirm());
        System.out.println(ph1.getPrice() + "UAH");
        System.out.println(ph1.getMemory() + "TB");
        System.out.println(ph1.autoSelection (""));
        System.out.println("-------------");

        System.out.println("Марка: "+ls.getFirm());
        System.out.println("Колір: "+ls.getColor());
        System.out.println(ls.getPrice() + "UAH");
        System.out.println(ls.getWarranty() + "year");
        System.out.println(ls.getTime() + "hours");
        System.out.println("Версія: " +ls.getBluetooth());
        System.out.println("Гучність динаміка " +ls.loundness(6679) + "%");
        System.out.println("-------------");


    }


}