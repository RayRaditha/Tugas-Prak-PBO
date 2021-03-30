/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;


public class Mahasiswa {
    String nama, nim;
    int usia;
    double uts,uas;

    public Mahasiswa(String nama, String nim, int usia, double uts, double uas) {
        this.nama = nama;
        this.nim = nim;
        this.usia = usia;
        this.uts = uts;
        this.uas = uas;
    }
    
    double hitungNilai() {
        return (uts+uas)/2;
    }
}
