package com.example.matador.gui.fields;

public class Property {
    private int price;
    private String name;
    private int housePrice;
    private int[] rent = new int[6];
    private int pledgeValue;
    private int position;
    private int houses;

    public Property(int position, String name, int price, int housePrice, int pledgeValue, int rent0, int rent1, int rent2, int rent3, int rent4, int rent5){
        this.name = name;
        this.price = price;
        this.housePrice = housePrice;
        this.pledgeValue = pledgeValue;
        rent[0] = rent0;
        rent[1] = rent1;
        rent[2] = rent2;
        rent[3] = rent3;
        rent[4] = rent4;
        rent[5] = rent5;
        this.position = position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void setHouses(int houses) {
        this.houses = houses;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public int getHousePrice() {
        return housePrice;
    }

    public int[] getRent() {
        return rent;
    }

    public int getPledgeValue() {
        return pledgeValue;
    }

    public int getPosition() {
        return position;
    }

    public int getHouses() {
        return houses;
    }
}
