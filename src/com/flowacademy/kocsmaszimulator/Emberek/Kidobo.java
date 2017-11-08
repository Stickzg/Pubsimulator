package com.flowacademy.kocsmaszimulator.Emberek;
import com.flowacademy.kocsmaszimulator.Italok.Ital;

public class Kidobo extends Ember {
    private boolean dolgozik;
    private static int aktivKidobok = 0;


    public Kidobo(String nev, int kor, boolean nem, int penz) {
        super(nev, kor, nem, penz);
        this.dolgozik = true;
        aktivKidobok++;
    }


    public void szolgalatbaAll(){
        if(dolgozik == false) {
            dolgozik = true;
            aktivKidobok++;
            System.out.println(getNev() + " elkezdett újra dolgozni.");
        } else {
            System.out.println(getNev() + " már dolgozik!");
        }
    }

    public void szolgalatbolKilep(){
        if(dolgozik == true) {
            dolgozik = false;
            aktivKidobok--;
            System.out.println(getNev() + " leadta a műszakot.");
        } else {
            System.out.println(getNev() + " eddig se dolgozott.");
        }
    }



    public boolean isDolgozik() {
        return dolgozik;
    }

    public void setDolgozik(boolean dolgozik) {
        this.dolgozik = dolgozik;
    }

    public static int getAktivKidobok() {
        return aktivKidobok;
    }

    public static void setAktivKidobok(int aktivKidobok) {
        Kidobo.aktivKidobok = aktivKidobok;
    }


    @Override

    public void iszik(Kocsmáros kocsmáros, Ital ital) {
        if ( dolgozik == true ) {
            System.out.println(super.getNev() + " szolgálatban van," +
                    " csak alkohol menteset iszik.");
        } else super.iszik(kocsmáros, ital);
    }


    @Override
    public String toString() {
        return  "nev= " + getNev() +
                ", kor=" + getKor() +
                ", nem=" + isNem() +
                ", penz=" + getPenz() +
                ", reszegseg=" + getReszegseg() +
                ", isInKocsma=" + isInKocsma() +
                "Jelenleg dolgozik= " + dolgozik +
                ", aktív kidobók száma= " + aktivKidobok;

    }
}



