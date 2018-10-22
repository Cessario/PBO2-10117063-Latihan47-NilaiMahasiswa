/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117063.latihan47.nilaimahasiswa;

/*
    Nama : Cessario Shevs Lakita Purwa Adidjaya
    Kelas : IF-2
    Nim : 10117063
    Definisi Program : Mahasiswa
 */
public class Mahasiswa {
    private double nAkhir;
    private char index;

    public double hitungNilaiAkhir(double Quiz, double UTS, double UAS) {
        nAkhir = (0.20 * Quiz) + (0.30 * UTS) + (0.50 * UAS);
        return nAkhir;
    }

    public char hitungNilaiIndex(double nkhir) {
        if (80 <= nkhir && nkhir <= 100) {
            index = 'A';
            return index;
        } else if (68 <= nkhir && nkhir < 80) {
            index = 'B';
            return index;
        } else if (56 <= nkhir && nkhir < 68) {
            index = 'C';
            return index;
        } else if (45 <= nkhir && nkhir < 56) {
            index = 'D';
            return index;
        } else {
            index = 'E';
            return index;
        }
    }

    public String keterangan(char indeks) {
        String ket;
        switch (indeks) {
            case 'A':
                ket = "Sangat Baik";
                break;
            case 'B':
                ket = "Baik";
                break;
            case 'C':
                ket = "Cukup";
                break;
            case 'D':
                ket = "Kurang";
                break;
            default:
                ket = "Sangat Kurang";
                break;
        }
        return ket;
    
}
}

