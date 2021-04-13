/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

import java.util.Scanner;
import tugas2.ruang.Balok;
import tugas2.ruang.Kerucut;
/**
 *
 * @author Raditha
 */
public class Tugas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner pilih = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        int menu;
        boolean y = false;
        
        do {
            System.out.println("\nINPUT");
            System.out.println("1. BALOK");
            System.out.println("2. KERUCUT");
            System.out.println("3. EXIT");
            System.out.print("PILIH : "); menu = pilih.nextInt();
            
            switch (menu){
                case 1 -> balok(input);
                case 2 -> kerucut(input);
                case 3 -> y = true;
            }
            
        } while (y == false);
    }
    
    public static void balok(Scanner input){
        int panjang, lebar, tinggi;
        
        System.out.print("\nPANJANG  = "); panjang = input.nextInt();
        System.out.print("LEBAR    = "); lebar = input.nextInt();
        System.out.print("TINGGI   = "); tinggi = input.nextInt();
        
        Balok balok = new Balok(panjang, lebar, tinggi);
        
        System.out.println("_________OUTPUT_________");
        System.out.println("LUAS PERSEGI         : " + balok.luas());
        System.out.println("KELILING PERSEGI     : " + balok.keliling());
        System.out.println("VOLUME BALOK         : " + balok.volume());
        System.out.println("LUAS PERMUKAAN BALOK : " + balok.luaspermukaan());
    }
    
    public static void kerucut(Scanner input){
        double jari;
        int tinggi;
        
        System.out.print("\nJARI-JARI   = "); jari = input.nextDouble();
        System.out.print("TINGGI      = "); tinggi = input.nextInt();
        
        Kerucut kerucut = new Kerucut(jari, tinggi);
        
        System.out.println("_________OUTPUT_________");
        System.out.println("LUAS LINGKARAN         : " + kerucut.luas());
        System.out.println("KELILING LINGKARAN     : " + kerucut.keliling());
        System.out.println("VOLUME KERUCUT         : " + kerucut.volume());
        System.out.println("LUAS PERMUKAAN KERUCUT : " + kerucut.luaspermukaan());
    }
}
