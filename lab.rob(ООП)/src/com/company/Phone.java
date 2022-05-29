package com.company;

public class Phone {
    private String firm;
    private String complement;
    private int price;
    private int memory;

    public Phone(String firm, String complement, int price, int memory) {
        this.firm = firm;
        this.complement = complement;
        this.price = price;
        this.memory = memory;
    }

    void gift(int budget) {
        if (price >= 25000) {
            System.out.println("Навушники у подарунок");
        } else {
            System.out.println("Навушники йдуть по додатковій оплаті");
        }
    }

    String autoSelection(String firm) {
        System.out.println("The best choice" + firm);
        return firm;
    }

    public String getFirm() {return firm;
    }

    public void setFirm(String firm) {this.firm = firm;
    }

    public String getComplement() {return complement;
    }

    public void setComplement(String complement) {this.complement = complement;
    }

    public int getPrice() {return price;
    }

    public void setPrice(int price) {this.price = price;
    }

    public int getMemory() {return memory;
    }

    public void setMemory(int memory) {this.memory = memory;
    }
}







