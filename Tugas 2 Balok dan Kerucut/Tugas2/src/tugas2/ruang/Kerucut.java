/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2.ruang;

import tugas2.bidang.Lingkaran;

/**
 *
 * @author Raditha
 */
public class Kerucut extends Lingkaran implements MenghitungRuang {

    private int tinggi;

    public Kerucut(double jari, int tinggi) {
        super(jari);
        this.tinggi = tinggi;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public double getJari() {
        return jari;
    }

    @Override
    public void setJari(double jari) {
        this.jari = jari;
    }
    
    @Override
    public double volume() {
        return ((double)1/3)*this.luas()*this.tinggi;
    }

    @Override
    public double luaspermukaan() {
        //s = garis apotema
        double s = Math.sqrt((this.jari*this.jari)+(this.tinggi*this.tinggi));
        return ((double) 22/7)*this.jari*(this.jari + s);
    }
    
}
