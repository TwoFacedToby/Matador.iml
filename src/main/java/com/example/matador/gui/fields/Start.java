package com.example.matador.gui.fields;

public class Start {

    private int position;
    private int moneyOverStart;
    public Start(int position, int moneyOverStart){
        this.moneyOverStart = moneyOverStart;
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getMoneyOverStart() {
        return moneyOverStart;
    }

    public void setMoneyOverStart(int moneyOverStart) {
        this.moneyOverStart = moneyOverStart;
    }
}
