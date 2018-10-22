/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117063.latihan47.nilaimahasiswa;

import java.util.Scanner;

/*
    Nama : Cessario Shevs Lakita Purwa Adidjaya
    Kelas : IF-2
    Nim : 10117063
    Definisi Program : Nilai Mahasiswa
 */
public class PBO210117063Latihan47NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        Mahasiswa mhs = new Mahasiswa();
        
        System.out.print("Masukkan nilai Quiz : ");
        double Quiz = scn.nextDouble();
        System.out.print("Masukkan nilai UTS : ");
        double UTS = scn.nextDouble();
        System.out.print("Masukkan nilai UAS : ");
        double UAS = scn.nextDouble();
        System.out.println();
        
        double nkhir = mhs.hitungNilaiAkhir(Quiz, UTS, UAS);
        char indeks = mhs.hitungNilaiIndex(nkhir);
        String ket = mhs.keterangan(indeks);
        
        System.out.println("Nilai Akhir = " + nkhir);
        System.out.println();
        
        System.out.println("Index = " + indeks);
        System.out.println("Keterangan = " + ket);
    
    }
    
}
