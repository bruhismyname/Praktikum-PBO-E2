/*  Nama File   : BangunDatarMain.java
 *  Deskripsi   : Berisi atribut dan method dalam class BangunDatarMain
 *  Pembuat     : Rajwaa Muflihul Aufaa
 *  NIM         : 24060123140189
 *  Tanggal     : 13 Maret 2025
 */

public class BangunDatarMain {
    public static void main(String[] args) {
        System.out.println("*****************************************************");
        System.out.println("*   Praktikum Pemrograman Berorientasi Objek E2     *");
        System.out.println("*          Oleh: Rajwaa Muflihul Aufaa              *");
        System.out.println("*      INITIALIZATION PROGRAM BANGUN DATAR          *");
        System.out.println("*****************************************************\n");
        
        System.out.println("/******************* PERSEGI *******************/");
        Persegi persegi = new Persegi(5, "Merah", "Putih");
        System.out.println("Luas Persegi: " + persegi.getLuas());
        System.out.println("Keliling Persegi: " + persegi.getKeliling());
        System.out.println("Diagonal Persegi: " + persegi.getDiagonal());
        persegi.printInfo();

        System.out.println("\n/******************* LINGKARAN *******************/");
        Lingkaran lingkaran = new Lingkaran(0, "Biru", "Hitam");
        lingkaran.setJariJari(7);
        System.out.println("Luas Lingkaran: " + lingkaran.getLuas());
        System.out.println("Keliling Lingkaran: " + lingkaran.getKeliling());
        System.out.println("Jari-jari Lingkaran: " + lingkaran.getJariJari());
        lingkaran.printInfo();

        System.out.println("\n/******************* JUMLAH BANGUN DATAR *******************/");
        BangunDatar.printCounterBangunDatar();
        
        System.out.println("\n/******************* END PROGRAM BANGUN DATAR *******************/");
    }
}
