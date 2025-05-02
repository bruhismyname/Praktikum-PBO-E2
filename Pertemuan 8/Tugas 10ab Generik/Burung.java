/*  Nama File   : Burung.java
 *  Deskripsi   : Kelas Burung yang merupakan turunan atau extends dari Anabul
 *  Pembuat     : Rajwaa Muflihul Aufaa
 *  NIM         : 24060123140189
 *  Tanggal     : 1 Mei 2025
 */

public class Burung extends Anabul {
    public Burung(String nama) {
        super(nama);
    }
    
    @Override
    public void bergerak() {
        System.out.println(getNama() + " bergerak dengan terbang");
    }
    
    @Override
    public void bersuara() {
        System.out.println(getNama() + " bersuara cuit");
    }
}