package com.flowacademy.kocsmaszimulator;

public class Kocsmáros {
    private int penz;
    private static int koszospohar;

    public Kocsmáros(int penz) {
        this.penz = penz;
    }

    public void getPénz(){
        this.penz += 1;
    }
    public void setKoszospohar () {
        this.koszospohar += 1;
    }
    public void elmos() {
        if ( koszospohar == 0 ) System.out.println("Nincs koszos pohár");
        else koszospohar -= 1;
    }

    public int getPenz() {
        return penz;
    }

    public void setPenz(int penz) {
        this.penz = penz;
    }

    public static int getKoszospohar() {
        return koszospohar;
    }

    public static void setKoszospohar(int koszospohar) {
        Kocsmáros.koszospohar = koszospohar;
    }

    @Override
    public String toString() {
        return "Kocsmáros{" +
                "penz=" + penz +
                '}';
    }
}
