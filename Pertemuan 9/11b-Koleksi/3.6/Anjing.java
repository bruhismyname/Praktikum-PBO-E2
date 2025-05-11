/*  Nama File   : Anjing.java
 *  Deskripsi   : Program untuk mendefinisikan kelas Anjing yang merupakan turunan dari kelas Anabul
 *  Pembuat     : Rajwaa Muflihul Aufaa
 *  NIM         : 24060123140189
 *  Tanggal     : 8 Mei 2025
 */

public class Anjing extends Anabul {
    
    public Anjing(String nama) {
        super(nama);
    }
    
    @Override
    public void Gerak() {
        System.out.println(nama + " bergerak dengan melata");
    }
    
    @Override
    public void Bersuara() {
        System.out.println(nama + " bersuara guk-guk");
    }
}