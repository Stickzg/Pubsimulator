package com.flowacademy.kocsmaszimulator.Italok;

public class Kevert extends Ital {

    private int alkoholtaralom;

    public Kevert(Ital ital1, Ital ital2) {
        super( "Kevert",10,(ital1.getAlkoholTartalom() + ital2.getAlkoholTartalom() ) / 2 );
    }

    public Kevert(Ital ital1, Ital ital2, Ital ital3) {
        super( "Kevert",15,(ital1.getAlkoholTartalom()
                + ital2.getAlkoholTartalom() + ital3.getAlkoholTartalom() ) / 2 );
    }

    public Kevert(Ital ital1, Ital ital2, Ital ital3, Ital ital4) {
        super( "Kevert",20,(ital1.getAlkoholTartalom() +
                ital2.getAlkoholTartalom() +ital3.getAlkoholTartalom() +
                ital4.getAlkoholTartalom() ) / 2 );
    }



    public int getAlkoholtaralom() {
        return alkoholtaralom;
    }

    public void setAlkoholtaralom(int alkoholtaralom) {
        this.alkoholtaralom = alkoholtaralom;
    }

}
