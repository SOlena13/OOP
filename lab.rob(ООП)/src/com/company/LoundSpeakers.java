package com.company;

public class LoundSpeakers {

    private String firm;
    private String color;
    private int price;
    private int warranty;
    private int time;
    private double bluetooth;

    public LoundSpeakers(String firm, String color, int price, int warranty, int time, double bluetooth) {
        this.firm = firm;
        this.color = color;
        this.price = price;
        this.warranty = warranty;
        this.time = time;
        this.bluetooth = bluetooth;
    }

    int loundness(int budget){
    int dynamic;
        if (price > 15000){
            dynamic = 100;
        }
        else {
            dynamic = 80;
        }
        return dynamic;
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

    public int getWarranty() {return warranty;
    }

    public void setWarranty(int warranty) {this.warranty = warranty;
    }

    public int getTime() {return time;
    }

    public void setTime(int time) {this.time = time;
    }

    public double getBluetooth() {return bluetooth;
    }

    public void setBluetooth(double bluetooth) {this.bluetooth = bluetooth;
    }
}


