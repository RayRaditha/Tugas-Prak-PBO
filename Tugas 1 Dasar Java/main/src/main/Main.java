/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.Scanner;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama,nim;
        int pilih, usia;
        double uts,uas;
        
        System.out.println("Input data=========");
        System.out.print("Nama   : "); nama = input.nextLine();
        System.out.print("NIM    : "); nim = input.nextLine();
        System.out.print("Usia   : "); usia = input.nextInt();
        System.out.print("UTS    : "); uts = input.nextDouble();
        System.out.print("UAS    : "); uas = input.nextDouble();
        
        Mahasiswa mhs = new Mahasiswa(nama, nim, usia, uts, uas);
        
        do {
            System.out.println(" ");
            System.out.println("Opsi ===========");
            System.out.println("1. Tampilkan data");
            System.out.println("2. Edit data");
            System.out.println("3. Exit");
            System.out.print("Pilih : "); pilih = input.nextInt();
            
            if (pilih==1){
                System.out.println(" ");
                System.out.println("Perkenalkan nama saya " + mhs.nama + ", nim " + mhs.nim + ",");
                System.out.println("Usia        : " + mhs.usia);
                System.out.println("Nilai akhir : " + mhs.hitungNilai());
            } else if (pilih==2) {
                System.out.println(" ");
                System.out.println("Input data=========");
                input = new Scanner(System.in);
                System.out.print("Nama   : "); mhs.nama = input.nextLine();
                System.out.print("NIM    : "); mhs.nim = input.nextLine();
                System.out.print("Usia   : "); mhs.usia = input.nextInt();
                System.out.print("UTS    : "); mhs.uts = input.nextDouble();
                System.out.print("UAS    : "); mhs.uas = input.nextDouble();
            } else {
                System.out.println(" ");
            }
            
        } while (pilih!=3);
    }
    
}
