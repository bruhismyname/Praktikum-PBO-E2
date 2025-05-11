/*  Nama File   : App.java
 *  Deskripsi   : Program kelas App merupakan kelas utama untuk menjalankan program
 *  Pembuat     : Rajwaa Muflihul Aufaa
 *  NIM         : 24060123140189
 *  Tanggal     : 8 Mei 2025
 */

import java.util.Random;

public class App {
    public static void main(String[] args) {
        System.out.println("\n/******************* APP KOLEKSI ANABUL KARAKTER *******************/");
        
        System.out.println("\n/******************* MENAMBAHKAN 10 KARAKTER ANABUL *******************/");
        KoleksiAnabul koleksiAnabul = new KoleksiAnabul();
        
        String[] namaKucing = {"Kitty", "Milo", "Whiskers", "Simba"};
        String[] namaAnjing = {"Buddy", "Max", "Rocky", "Cooper"};
        String[] namaBurung = {"Tweety", "Polly", "Rio", "Blue"};
        
        Random random = new Random();
        
        for (int i = 0; i < 10; i++) {
            int tipe = random.nextInt(3);
            
            Anabul anabul;
            
            switch (tipe) {
                case 0: // Kucing
                    String namaK = namaKucing[random.nextInt(namaKucing.length)];
                    anabul = new Kucing(namaK);
                    break;
                case 1: // Anjing
                    String namaA = namaAnjing[random.nextInt(namaAnjing.length)];
                    anabul = new Anjing(namaA);
                    break;
                default: // Burung
                    String namaB = namaBurung[random.nextInt(namaBurung.length)];
                    anabul = new Burung(namaB);
                    break;
            }
            
            koleksiAnabul.add(anabul);
            System.out.println("Menambahkan " + anabul.getNama() + " ke koleksi");
        }
        
        System.out.println("");
        koleksiAnabul.showAll();
    }
}