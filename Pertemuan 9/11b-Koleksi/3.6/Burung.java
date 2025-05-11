/*  Nama File   : App.java
 *  Deskripsi   : Program untuk mendefinisikan kelas Burung yang merupakan turunan dari kelas Anabul
 *  Pembuat     : Rajwaa Muflihul Aufaa
 *  NIM         : 24060123140189
 *  Tanggal     : 8 Mei 2025
 */

public class Burung extends Anabul {
    
    public Burung(String nama) {
        super(nama);
    }
    
    @Override
    public void Gerak() {
        System.out.println(nama + " bergerak dengan terbang");
    }
    
    @Override
    public void Bersuara() {
        System.out.println(nama + " berbunyi cuit");
    }
}