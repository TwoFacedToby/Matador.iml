package com.example.matador.gui.fields;

public class Tax {
    private int taxPercentage; //if this is 0 you just pay the price
    private int price;
    private int position;
    private String text;

    public Tax(int position, int price, int taxPercentage, String text){
        this.position = position;
        this.price = price;
        this.taxPercentage = taxPercentage;
        this.text = text;
    }


}
