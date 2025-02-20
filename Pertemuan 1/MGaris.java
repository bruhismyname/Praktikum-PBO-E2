/*  Nama File   : MGaris.java
 *  Deskripsi   : berisi atribut dan method dalam class Titik
 *  Pembuat     : Rajwaa Muflihul Aufaa
 *  NIM         : 24060123140189
 *  Tanggal     : 21 Februari 2025
 */

public class MGaris {
    public static void main(String[] args) {
        System.out.println("*****************************************************");
        System.out.println("*   Praktikum Pemrograman Berorientasi Objek E2     *");
        System.out.println("*          Oleh: Rajwaa Muflihul Aufaa              *");
        System.out.println("*          INITIALIZATION PROGRAM GARIS             *");
        System.out.println("*****************************************************");
        System.out.println("\n/******************* GARIS *******************/");
        Titik A = new Titik(-2,0);
        Titik B = new Titik(0,4);

        Garis garis1 = new Garis(); // Konstruktor default
        System.out.println("Garis 1: ");
        garis1.printGaris();
        
        Garis garis2 = new Garis(A,B);
        System.out.println("Garis 2: ");
        garis2.printGaris();

        Garis garis3 = new Garis(new Titik(0,0), new Titik(3,4));
        System.out.println("Garis 3: ");
        garis3.printGaris();

        System.out.println("\n/******************* COUNTER GARIS *******************/");
        System.out.println("Jumlah objek Garis yang telah dibuat: " + Garis.getCounterGaris());

        System.out.println("\n/******************* PANJANG GARIS *******************/");
        System.out.println("Panjang Garis 2: " + garis2.getPanjang());

        System.out.println("\n/******************* GRADIEN GARIS *******************/");
        System.out.println("Gradien Garis 2: " + garis2.getGradien());

        System.out.println("\n/******************* TITIK TENGAH *******************/");
        Titik titikTengah = garis2.getTitikTengah();
        System.out.println("Titik tengah Garis 2: (" + titikTengah.getAbsis() + ", " + titikTengah.getOrdinat() + ")");

        System.out.println("\n/******************* IS SEJAJAR *******************/");
        System.out.println("Apakah Garis 2 sejajar dengan Garis 3? " + garis2.isSejajar(garis3));

        System.out.println("\n/******************* IS TEGAK LURUS *******************/");
        System.out.println("Apakah Garis 2 tegak lurus dengan Garis 3? " + garis2.isTegakLurus(garis3));

        System.out.println("\n/******************* PERSAMAAN GARIS *******************/");
        System.out.println("Persamaan Garis dari Titik (-2,0) ke (0,4): ");
        System.out.println(garis2.getPersamaanGaris());

        System.out.println("\n/******************* END PROGRAM GARIS *******************/");
    }
}
