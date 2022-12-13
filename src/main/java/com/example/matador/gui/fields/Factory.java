package com.example.matador.gui.fields;

public class Factory {
    private int position;
    private int price;
    private int moneyPrEye;
    private String name;

    public Factory(int position, int price, int moneyPrEye, String name){
        this.position = position;
        this.price = price;
        this.moneyPrEye = moneyPrEye;
        this.name = name;
    }
}
