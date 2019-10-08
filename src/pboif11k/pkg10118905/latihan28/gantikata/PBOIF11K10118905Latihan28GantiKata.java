/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif11k.pkg10118905.latihan28.gantikata;

import java.util.Scanner;
/**
 *
 * @author Fitri
 * Nama     : Anindira Dina FItriani
 * Kelas    : IF11-K
 * Nim      : 10118905
 * Deskripsi: Ganti kata
 */
public class PBOIF11K10118905Latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        System.out.println("======Program Mengganti kata======");
        System.out.println("masukkan kalimat :");
        String kalimat =sc.nextLine();
        System.out.println("Ganti kata");
        String cari = sc.next();
        System.out.println("Menjadi kata :");
        String ganti = sc.next();
        String hasil =kalimat.replace(cari, ganti);
        System.out.println("======Hasil Formating=====");
        System.out.println("Kalimat awal :"+kalimat);
        System.out.println("Kalimat baru :"+hasil);
    }
    
}
