/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar2;

/**
 *
 * @author TOSHIBA
 */
public class Segitiga {
    static double pythagoras(double alas, double tinggi){
        double a = Math.sqrt(Math.pow(alas,2)+Math.pow(tinggi,2));
        return a;
    }
    static double hitungLuas(double alas, double tinggi){
        double hasil = 0.5 * alas * tinggi;
        return hasil;
    }
    static double hitungLuas(int alas, int tinggi){
        double hasil = 0.5 * alas * tinggi;
        return hasil;
    }
    static double hitungLuas(double alas, int tinggi){
        double hasil = 0.5 * alas * tinggi;
        return hasil;
    }
    static double hitungLuas(int alas, double tinggi){
        double hasil = 0.5 * alas * tinggi;
        return hasil;
    }
    static double hitungKeliling(double alas, double tinggi){
        double a = pythagoras(alas,tinggi);
        double hasil = alas + tinggi + a;
        return hasil;
    }
    static double hitungKeliling(int alas, int tinggi){
        double a = pythagoras(alas,tinggi);
        double hasil = alas + tinggi + a;
        return hasil;
    }
    static double hitungKeliling(double alas, int tinggi){
        double a = pythagoras(alas,tinggi);
        double hasil = alas + tinggi + a;
        return hasil;
    }
    static double hitungKeliling(int alas, double tinggi){
        double a = pythagoras(alas,tinggi);
        double hasil = alas + tinggi + a;
        return hasil;
    }
}
