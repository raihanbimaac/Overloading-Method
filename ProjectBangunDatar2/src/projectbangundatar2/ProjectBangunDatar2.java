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
public class ProjectBangunDatar2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersegiPanjang pp = new PersegiPanjang();
        System.out.println("Luas persegi panjang yang panjang 10 dan lebar 5 adalah : " + pp.hitungLuas(10, 5));
        System.out.println("Luas persegi panjang yang panjang 3.6 dan lebar 8 adalah : " + pp.hitungLuas(3.6, 8));
        System.out.println("Luas persegi panjang yang panjang 6 dan lebar 8.3 adalah : " + pp.hitungLuas(6, 8.3));
        System.out.println("Luas persegi panjang yang panjang 5.6 dan lebar 8.8 adalah : " + pp.hitungLuas(5.6, 8.8));
        System.out.println("\n===================================================================================\n");
        
        System.out.println("Keliling persegi panjang yang panjang 10 dan lebar 5 adalah : " + pp.hitungKeliling(10, 5));
        System.out.println("Keliling persegi panjang yang panjang 3.6 dan lebar 8 adalah : " + pp.hitungKeliling(3.6, 8));
        System.out.println("Keliling persegi panjang yang panjang 6 dan lebar 8.3 adalah : " + pp.hitungKeliling(6, 8.3));
        System.out.println("Keliling persegi panjang yang panjang 5.6 dan lebar 8.8 adalah : " + pp.hitungKeliling(5.6, 8.8));
        System.out.println("\n===================================================================================\n");
        
        Persegi p = new Persegi();
        System.out.println("Luas persegi yang panjang sisi 4.5 adalah : " + p.hitungLuas(4.5));
        System.out.println("Luas persegi yang panjang sisi 7 adalah : " + p.hitungLuas(7));
        System.out.println("\n===================================================================================\n");
        
        System.out.println("Keliling persegi yang panjang sisi 4.5 adalah : " + p.hitungKeliling(4.5));
        System.out.println("Keliling persegi yang panjang sisi 7 adalah : " + p.hitungKeliling(7));
        System.out.println("\n===================================================================================\n");
        
        Lingkaran l = new Lingkaran();
        System.out.println("Luas lingkaran yang panjang jari - jari 5 adalah : " + l.hitungLuas(5));
        System.out.println("Luas lingkaran yang panjang jari - jari 7.4 adalah : " + l.hitungLuas(7.4));
        System.out.println("\n===================================================================================\n");
        
        System.out.println("Keliling lingkaran yang panjang jari - jari 5 adalah : " + l.hitungKeliling(5));
        System.out.println("Keliling lingkaran yang panjang jari - jari 7.4 adalah : " + l.hitungKeliling(7.4));
        System.out.println("\n===================================================================================\n");
        
        Segitiga s = new Segitiga();
        System.out.println("Luas segitiga yang panjang alas 8 dan tinggi 10 adalah : " + s.hitungLuas(8, 10));
        System.out.println("Luas segitiga yang panjang alas 8 dan tinggi 11.5 adalah : " + s.hitungLuas(8, 11.5));
        System.out.println("Luas segitiga yang panjang alas 12.2 dan tinggi 9 adalah : " + s.hitungLuas(12.2, 9));
        System.out.println("Luas segitiga yang panjang alas 13.9 dan tinggi 20.7 adalah : " + s.hitungLuas(13.9, 20.7));
        System.out.println("\n===================================================================================\n");
        
        System.out.println("Keliling segitiga yang panjang alas 8 dan tinggi 10 adalah : " + s.hitungKeliling(8, 10));
        System.out.println("Keliling segitiga yang panjang alas 8 dan tinggi 11.5 adalah : " + s.hitungKeliling(8, 11.5));
        System.out.println("Keliling segitiga yang panjang alas 12.2 dan tinggi 9 adalah : " + s.hitungKeliling(12.2, 9));
        System.out.println("Keliling segitiga yang panjang alas 13.9 dan tinggi 20.7 adalah : " + s.hitungKeliling(13.9, 20.7));
        System.out.println("\n===================================================================================\n");
    }
    
}
