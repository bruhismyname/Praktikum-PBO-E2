/*  Nama File   : BangunDatarGenericTest.java
 *  Deskripsi   : Main class untuk generic bangunDatar
 *  Pembuat     : Rajwaa Muflihul Aufaa
 *  NIM         : 24060123140189
 *  Tanggal     : 1 Mei 2025
 */

public class BangunDatarGenericTest {
    public static void main (String[] args) {
        Lingkaran l = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<Lingkaran>();
        bdg.set(l);
        System.out.println("Keliling Lingkaran: "+bdg.hitungKeliling());
        System.out.println("Tipe Generic: "+bdg.get().getClass().getName());
    }
}