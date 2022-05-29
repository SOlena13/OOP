package com.company;

public class Laptop {

    // змінні екземпляру класу
    private String firm;
    private String color;
    private int price;

    public Laptop(String firm, String color, int price) {
        this.firm = firm;
        this.color = color;
        this.price = price;
    }

    void buy(int budget){
        if (price >= 60000) {
            System.out.println("Вітаю, ви можете придбати цей Macbook!");
        }
        else {
            System.out.println("На жаль, ви не можете купити цей Macbook");
        }
    }

    void present(int fishka){
        if (price >= 70000) {
            System.out.println("На наступну покупку у вас знижка -50%");
        }
        else {
            System.out.println("Робіть покупки у нашому магазині частіше");
        }

    }

    public String getFirm() {return firm;
    }

    public void setFirm(String firm) {this.firm = firm;
    }

    public String getColor() {return color;
    }

    public void setColor(String color) {this.color = color;
    }

    public int getPrice() {return price;
    }

    public void setPrice(int price) {this.price = price;
    }

    public void buy() {
    }
}


