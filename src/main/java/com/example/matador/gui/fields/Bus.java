package com.example.matador.gui.fields;

public class Bus {
    private int position;
    private int price;
    private int cost;
    private String name;
    private int pledgeValue;
    private int multi;
    public Bus(int position, int price, int cost, String name, int pledgeValue, int multi){
        this.position = position;
        this.price = price;
        this.cost = cost;
        this.name = name;
        this.pledgeValue = pledgeValue;
        this.multi = multi;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
