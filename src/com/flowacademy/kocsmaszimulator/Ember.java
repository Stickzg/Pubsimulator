package com.flowacademy.kocsmaszimulator;

public class Ember {
    private String nev;
    private int kor;
    private boolean nem;
    private int penz;
    private int reszegseg = 0;
    private boolean isInKocsma = false;
    private static int Darab = 0;
    public static final int MAX_RESZEGSEG = 50;

    public Ember(String nev, int kor, boolean nem, int penz, int reszegseg, boolean kocsmabanVan) {
        this.nev = nev;
        this.kor = kor;
        this.nem = nem;
        this.penz = penz;
        this.reszegseg = reszegseg;
        this.isInKocsma = kocsmabanVan;
        this.Darab ++;
    }


    public void kiír() {
        System.out.println("Szia az én nevem " + nev + ". " + kor + " éves vagyok és " +
                ((nem == true) ? "ferfi" : "no") + " vagyok");
    }

    public void iszik(Kocsmáros kocsmaros) {
        if ( isInKocsma = true ) {
            this.penz -= 1;
            this.reszegseg +=1;
            kocsmaros.setKoszospohar(+1);
            kocsmaros.setPenz(+1);
            if (this.reszegseg >= MAX_RESZEGSEG ) this.alszik();
        } else {
            System.out.println(this.nev + " nincs a kocsámban.");
        }
    }

    public void iszik(Kocsmáros kocsmáros, Ital ital) {
        System.out.println(this.nev + " iszik egy " + ital.getNev() + "-t.");
        reszegseg += ital.getAlkoholTartalom();
        penz -= ital.getÁr();
    kocsmáros.setPenz(+ital.getÁr());
        kocsmáros.setKoszospohar(kocsmáros.getKoszospohar()+1);
        if (reszegseg >= MAX_RESZEGSEG ) this.alszik();
    }

    public void alszik() {
        this.reszegseg = 0;
        System.out.println(this.nev + " elaludt.");
    }

    public void hazamegy() {
        this.isInKocsma = false;
        System.out.println(this.nev + " hazament a kocsmából.");
    }

    public void jon() {
        this.isInKocsma = true;
        System.out.println(this.nev + " megérkezett a kocsmába.");
    }

    public static int getDarab() {
        return Darab;
    }

    public int getKor() {
        return  kor;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public boolean isNem() {
        return nem;
    }

    public void setNem(boolean nem) {
        this.nem = nem;
    }

    public int getPenz() {
        return penz;
    }

    public void setPenz(int penz) {
        this.penz = penz;
    }

    public int getReszegseg() {
        return reszegseg;
    }

    public void setReszegseg(int reszegseg) {
        this.reszegseg = reszegseg;
    }

    public boolean isInKocsma() {
        return isInKocsma;
    }

    public void setInKocsma(boolean inKocsma) {
        this.isInKocsma = inKocsma;
    }

    @Override
    public String toString() {
        return "Ember{" +
                "nev='" + nev + '\'' +
                ", kor=" + kor +
                ", nem=" + nem +
                ", penz=" + penz +
                ", reszegseg=" + reszegseg +
                ", isInKocsma=" + isInKocsma +
                '}';
    }
}
