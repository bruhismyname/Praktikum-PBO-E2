/*  Nama File   : AplikasiDatum.java
 *  Deskripsi   : Main class AplikasiDatum
 *  Pembuat     : Rajwaa Muflihul Aufaa
 *  NIM         : 24060123140189
 *  Tanggal     : 1 Mei 2025
 */

public class AplikasiDatum {
    public static void main(String[] args) {
        Datum<Kucing> datumKucing = new Datum<>(new Kucing("Kitty"));
        System.out.println("\n/******************* OBJEK DATUM TIPE KUCING *******************/");
        datumKucing.getIsi().bersuara();
        datumKucing.getIsi().bergerak();
        
        Datum<Anjing> datumAnjing = new Datum<>(new Anjing("Bobby"));
        System.out.println("\n/******************* OBJEK DATUM TIPE ANJING *******************/");
        datumAnjing.getIsi().bersuara();
        datumAnjing.getIsi().bergerak();
        
        Datum<Burung> datumBurung = new Datum<>(new Burung("Tweety"));
        System.out.println("\n/******************* OBJEK DATUM TIPE BURUNG *******************/");
        datumBurung.getIsi().bersuara();
        datumBurung.getIsi().bergerak();
        
        System.out.println("\n/******************* MENGUBAH NAMA HEWAN *******************/");
        datumKucing.getIsi().setNama("Meong");
        datumAnjing.getIsi().setNama("Rex");
        datumBurung.getIsi().setNama("Birdie");
        
        System.out.println("Kucing dengan nama baru: " + datumKucing.getIsi().getNama());
        datumKucing.getIsi().bersuara();
        
        System.out.println("Anjing dengan nama baru: " + datumAnjing.getIsi().getNama());
        datumAnjing.getIsi().bersuara();
        
        System.out.println("Burung dengan nama baru: " + datumBurung.getIsi().getNama());
        datumBurung.getIsi().bersuara();
    }
}