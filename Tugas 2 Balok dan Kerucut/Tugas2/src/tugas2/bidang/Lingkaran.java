/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2.bidang;

/**
 *
 * @author Raditha
 */
public class Lingkaran implements MenghitungBidang {
    public double jari;

    public Lingkaran(double jari) {
        this.jari = jari;
    }

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }
    
    
    @Override
    public double luas() {
       return ((double) 22/7)*this.jari*this.jari;
    }

    @Override
    public double keliling() {
       return 2*((double) 22/7)*this.jari;
    }
    
    
    
    
}
