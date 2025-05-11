/*  Nama File   : BangunDatarGeneric.java
 *  Deskripsi   : Program untuk mendefinisikan kelas abstrak BangunDatarGeneric
 *  Pembuat     : Rajwaa Muflihul Aufaa
 *  NIM         : 24060123140189
 *  Tanggal     : 8 Mei 2025
 */

public abstract class BangunDatarGeneric<T extends Number> {
    public abstract double hitungLuas();
    
    public abstract double hitungKeliling();
    
    public void display() {
        System.out.println("Luas: " + hitungLuas());
        System.out.println("Keliling: " + hitungKeliling());
    }
}