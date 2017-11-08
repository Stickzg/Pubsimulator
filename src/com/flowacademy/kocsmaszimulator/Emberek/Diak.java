package com.flowacademy.kocsmaszimulator.Emberek;

public class Diak extends Ember {
    private int osztondij;

    public Diak(String nev, int kor, boolean nem, int penz, int reszegseg, boolean kocsmabanVan, int osztondij) {
        super(nev, kor, nem, penz);
        osztondij = osztondij;
    }

    public void tanul(int mennyit) {
        setPenz(getPenz() + (osztondij * mennyit));
    }

    ;

    @Override
    public String toString() {
        return "nev= " + super.getNev() +
                ", kor=" + super.getKor() +
                ", nem=" + super.isNem() +
                ", penz=" + super.getPenz() +
                ", reszegseg=" + super.getReszegseg() +
                ", isInKocsma=" + super.isInKocsma() +
                ", ösztöndíja= " + osztondij;
    }
}
