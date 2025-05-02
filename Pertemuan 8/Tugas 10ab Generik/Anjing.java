/*  Nama File   : Anjing.java
 *  Deskripsi   : Kelas Anjing yang merupakan turunan atau extends dari Anabul
 *  Pembuat     : Rajwaa Muflihul Aufaa
 *  NIM         : 24060123140189
 *  Tanggal     : 1 Mei 2025
 */

public class Anjing extends Anabul {
    public Anjing(String nama) {
        super(nama);
    }
    
    @Override
    public void bergerak() {
        System.out.println(getNama() + " bergerak dengan berjalan");
    }
    
    @Override
    public void bersuara() {
        System.out.println(getNama() + " bersuara guk guk");
    }
}