/*  Nama File   : App.java
 *  Deskripsi   : Program untuk mendemonstrasikan penggunaan kelas generik
 *  Pembuat     : Rajwaa Muflihul Aufaa
 *  NIM         : 24060123140189
 *  Tanggal     : 8 Mei 2025
 */

public class App {
    public static void main(String[] args) {
        System.out.println("\n/******************* BANGUN DATAR GENERIC *******************/");
        Persegi<Double> persegi = new Persegi<>(5.0);
        PersegiPanjang<Double> persegiPanjang = new PersegiPanjang<>(6.0, 4.0);
        Segitiga<Double> segitiga = new Segitiga<>(5.0, 4.0, 5.0, 4.0, 3.0);
        
        persegi.display();
        System.out.println();
        
        persegiPanjang.display();
        System.out.println();
        
        segitiga.display();
        
        System.out.println("\n/******************* CONTOH HASIL INTEGER *******************/");
        Persegi<Integer> persegiInt = new Persegi<>(4);
        persegiInt.display();
    }
}