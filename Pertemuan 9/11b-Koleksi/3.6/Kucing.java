/*  Nama File   : Kucing.java
 *  Deskripsi   : Program untuk mendefinisikan kelas Kucing yang merupakan turunan dari kelas Anabul
 *  Pembuat     : Rajwaa Muflihul Aufaa
 *  NIM         : 24060123140189
 *  Tanggal     : 8 Mei 2025
 */

public class Kucing extends Anabul {
    
    public Kucing(String nama) {
        super(nama);
    }
    
    @Override
    public void Gerak() {
        System.out.println(nama + " bergerak dengan melata");
    }
    
    @Override
    public void Bersuara() {
        System.out.println(nama + " berbunyi meong");
    }
}