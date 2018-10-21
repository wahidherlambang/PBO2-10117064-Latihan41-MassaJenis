/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117064.latihan41.massajenis;

import java.util.Scanner;

/**
 *
 * @author WAHID HERLAMBANG
 * NAMA     : Wahid Herlambang Suroso
 * KELAS    : PBO2
 * NIM      : 10117064
 * Deskripsi Program : Program ini berisi program untuk menghitung 
 * massa jenis kubus.
 */
public class PBO210117064Latihan41MassaJenis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        Kubus kbs = new Kubus ();
        
        System.out.println("======Massa Jenis Kubus======");
        System.out.print("Sisi : ");
        kbs.setSisi(sc.nextInt());
        System.out.print("Massa : ");
        kbs.setMassa(sc.nextInt());
        
        System.out.println("\n"+"======Hasil Perhitungan======");
        System.out.println("Volume : " + kbs.hitungVolume(kbs.getSisi()));
        System.out.println("Massa Jenis : " + kbs.hitungMassaJenis(kbs.getMassa(),kbs.hitungVolume(kbs.getSisi())));
    }
    
}
