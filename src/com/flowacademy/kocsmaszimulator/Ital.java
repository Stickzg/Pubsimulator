package com.flowacademy.kocsmaszimulator;

public class Ital {
    private String nev;
    private int ár;
    private int alkoholTartalom;

    public Ital(String nev, int ár, int alkoholTartalom) {
        this.nev = nev;
        this.ár = ár;
        this.alkoholTartalom = alkoholTartalom;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }


    public int getÁr() {
        return ár;
    }

    public void setÁr(int ár) {
        this.ár = ár;
    }

    public int getAlkoholTartalom() {
        return alkoholTartalom;
    }

    public void setAlkoholTartalom(int alkoholTartalom) {
        this.alkoholTartalom = alkoholTartalom;
    }

    @Override
    public String toString() {
        return "Ital{" +
                "nev='" + nev + '\'' +
                ", ár=" + ár +
                ", alkoholTartalom=" + alkoholTartalom +
                '}';
    }
}
