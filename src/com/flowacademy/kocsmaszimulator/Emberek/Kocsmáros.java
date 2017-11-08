package com.flowacademy.kocsmaszimulator.Emberek;

public class Kocsmáros extends Ember {
    private static int koszospohar;

    public Kocsmáros(String nev, int kor, boolean nem, int penz, int reszegseg, boolean kocsmabanVan) {
        super(nev, kor, nem, penz);
    }

    public static int getKoszospohar() {
        return koszospohar;
    }

    public static void setKoszospohar(int koszospohar) {
        Kocsmáros.koszospohar = koszospohar;
    }


    public void setKoszospohar () {
        this.koszospohar += 1;
    }
    public void elmos() {
        if ( koszospohar == 0 ) System.out.println("Nincs koszos pohár");
        else koszospohar -= 1;
    }



    @Override
    public String toString() {
        return  "nev= " + getNev() +
                    ", kor= " + getKor() +
                    ", nem= " + isNem() +
                    ", penz= " + getPenz() +
                    ", reszegseg= " + getReszegseg() +
                    ", isInKocsma= " + isInKocsma();
    }
}
