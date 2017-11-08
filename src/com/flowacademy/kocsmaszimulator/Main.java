package com.flowacademy.kocsmaszimulator;

import com.flowacademy.kocsmaszimulator.Emberek.Diak;
import com.flowacademy.kocsmaszimulator.Emberek.Ember;
import com.flowacademy.kocsmaszimulator.Emberek.Kidobo;
import com.flowacademy.kocsmaszimulator.Emberek.Kocsmáros;
import com.flowacademy.kocsmaszimulator.Italok.Bor;
import com.flowacademy.kocsmaszimulator.Italok.Ital;
import com.flowacademy.kocsmaszimulator.Italok.Kevert;
import com.flowacademy.kocsmaszimulator.Italok.Sör;

public class Main {
    public static void main(String[] args) {
        Ember Jozsi = new Ember("Józsi", 25, true, 10);
        Ember Karoly = new Ember("Karcsika", 30, true, 20);
        Ember Tibi = new Ember("Tibi", 35, true, 30);
        Ember Jolan = new Ember("Jolán", 28, false, 22);

        Ember[] emberek = new Ember[4];
        emberek[0] = Jozsi;
        emberek[1] = Karoly;
        emberek[2] = Tibi;
        emberek[3] = Jolan;

        Ital whiskey = new Ital("whiskey", 5, 15);
        Ital vodka = new Ital("vodka", 4, 20);
        Sör sör = new Sör("sör", 1, 2);
        Bor bor = new Bor("bor", 3, 4, 2000);
        Kevert kevert = new Kevert(bor, sör);
        Kevert veszely = new Kevert(whiskey, vodka, bor);

        Ital[] italok = new Ital[6];
        italok[0] = whiskey;
        italok[1] = vodka;
        italok[2] = sör;
        italok[3] = bor;
        italok[4] = kevert;
        italok[5] = veszely;

        Kocsmáros pista = new Kocsmáros("Pista", 30, true,
                20, 0, true);
        Kocsmáros marcsi = new Kocsmáros("Marcsi", 20, false,
                20, 0, true);

        Kocsmáros[] kocsmárosok = new Kocsmáros[2];
        kocsmárosok[0] = pista;
        kocsmárosok[1] = marcsi;

        Diak tomi = new Diak("Tomi", 20, true,
                5, 0, false, 5);

        Diak timi = new Diak("Timi", 22, false,
                10, 0, false, 8);

        Kidobo bela = new Kidobo("Béla", 40, true,
                5);
        Kidobo tibi = new Kidobo("Tibi", 35, true,
                20);


        for (int i = 0; i < emberek.length; i++) {
            System.out.println("Emberek száma: " + emberek[i]);
        }
        float sum = 0;
        for (int i = 0; i < emberek.length; i++) {
            sum += emberek[i].getKor();
        }
        //    System.out.println("Az átlag életkor: " + sum / emberek.length);
        System.out.println("Emberek száma " + Ember.getDarab());

        Tibi.jon();
        Jozsi.jon();
        Karoly.jon();
        Jolan.jon();

        Tibi.iszik(pista, vodka);
        Jozsi.iszik(marcsi, whiskey);

        System.out.println(marcsi);
        System.out.println(pista);

        Tibi.iszik(marcsi, vodka);

        System.out.println(pista.getKoszospohar());
        pista.elmos();
        System.out.println(pista.getKoszospohar());

        Karoly.kotozkodik(Jozsi);
        tomi.jon();
        timi.jon();

        timi.iszik(pista, vodka);
        tomi.iszik(marcsi, whiskey);
        tomi.iszik(marcsi, vodka);
        tomi.iszik(pista, vodka);

        bela.iszik(pista, vodka);
        bela.szolgalatbolKilep();
        bela.iszik(pista, vodka);

        timi.iszik(pista, veszely);
    }
}