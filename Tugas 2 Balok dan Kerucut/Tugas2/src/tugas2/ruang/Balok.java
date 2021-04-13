/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2.ruang;

import tugas2.bidang.PersegiPanjang;

/**
 *
 * @author Raditha
 */
public class Balok extends PersegiPanjang implements MenghitungRuang {
    
    private int tinggi;

    public Balok(int panjang, int lebar, int tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    
    
    @Override
    public double volume() {
        return this.luas()*this.tinggi;
    }

    @Override
    public double luaspermukaan() {
        return 2*((this.panjang*this.lebar) + (this.panjang*this.tinggi) + (this.lebar*this.tinggi)) ;
    }
    
}
