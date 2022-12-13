package com.example.matador.gui.fields;

import com.example.matador.gui.GUI;

public class Fields {
    private GUI gui;
    private int total;

    public Fields(GUI gui) {
        this.gui = gui;
    }

    public void MakeFields(){
        //Instantiate all the fields.
        Bus[] busses = new Bus[4];
        ChanceCard[] chanceCards = new ChanceCard[6];
        Factory[] factories = new Factory[2];
        FreeParking freeParking;
        GoToPrison goToPrison;
        Prison prison;
        Property[] properties = new Property[22];
        Start start;
        Tax[] taxes = new Tax[2];
        total = 40;

        //Beneath here choose information for the Fields.
        start = new Start(0, 4000);
        properties[0] = new Property(1, "Rødovrevej", 1200, 0,0,0,0,0,0,0,0);
        chanceCards[0] = new ChanceCard(2);
        properties[1] = new Property(3, "Hvidovrevej", 1200, 0,0,0,0,0,0,0,0);
        taxes[0] = new Tax(4, 4000, 10, "Betal indkomstskat: " + 10 + "% eller kr. " + 4.000);
        busses[0] = new Bus(5, 4000 , 500, "Bus 1", 0, 2);
        properties[2] = new Property(6, "Roskildevej", 2000, 0,0,0,0,0,0,0,0);
        chanceCards[1] = new ChanceCard(7);
        properties[3] = new Property(8, "Valby Langgade", 2000, 0,0,0,0,0,0,0,0);
        properties[4] = new Property(9, "Allégade", 2400, 0,0,0,0,0,0,0,0);
        prison = new Prison(10);
        properties[5] = new Property(11, "Frederiksberg Allé", 2800, 0,0,0,0,0,0,0,0);
        factories[0] = new Factory(12, 3000,100, "Squash Factory");
        properties[6] = new Property(13, "Bülowsvej", 2800, 0,0,0,0,0,0,0,0);
        properties[7] = new Property(14, "Gl. Kongevej", 3200, 0,0,0,0,0,0,0,0);
        busses[1] = new Bus(15, 4000 , 500, "Bus 2", 0, 2);
        properties[8] = new Property(16, "Bernstorffsvej", 3600, 0,0,0,0,0,0,0,0);
        chanceCards[2] = new ChanceCard(17);
        properties[9] = new Property(18, "Hellerupvej", 3600, 0,0,0,0,0,0,0,0);
        properties[10] = new Property(19, "Strandvejen", 4000, 0,0,0,0,0,0,0,0);
        freeParking = new FreeParking(20);
        properties[11] = new Property(21, "Trianglen", 4400, 0,0,0,0,0,0,0,0);
        chanceCards[3] = new ChanceCard(22);
        properties[12] = new Property(23, "Østerbrogade", 4400, 0,0,0,0,0,0,0,0);
        properties[13] = new Property(24, "Grønningen", 4800, 0,0,0,0,0,0,0,0);
        busses[2] = new Bus(25, 4000 , 500, "Bus 3", 0, 2);
        properties[14] = new Property(26, "Bredgade", 5200, 0,0,0,0,0,0,0,0);
        properties[15] = new Property(27, "Kgs. Nytorv", 5200, 0,0,0,0,0,0,0,0);
        factories[0] = new Factory(28, 3000,100, "Cola Factory");
        properties[16] = new Property(29, "Østergade", 5600, 0,0,0,0,0,0,0,0);
        goToPrison = new GoToPrison(30);
        properties[17] = new Property(31, "Amagertorv", 6000, 0,0,0,0,0,0,0,0);
        properties[18] = new Property(32, "Vimmelskaftet", 6000, 0,0,0,0,0,0,0,0);
        chanceCards[4] = new ChanceCard(33);
        properties[19] = new Property(34, "Nygade", 6400, 0,0,0,0,0,0,0,0);
        busses[3] = new Bus(35, 4000 , 500, "Bus 4", 0, 2);
        chanceCards[4] = new ChanceCard(36);
        properties[20] = new Property(37, "Frederiksberggade", 7000, 0,0,0,0,0,0,0,0);
        taxes[1] = new Tax(38, 2000, 0, "Ekstraordinær statsskat: Betal kr. " + 2000);
        properties[21] = new Property(39, "Rådhuspladsen", 8000, 0,0,0,0,0,0,0,0);


    }


}
