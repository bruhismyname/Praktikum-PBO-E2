/*  Nama File   : Lingkaran.java
 *  Deskripsi   : Implementasi kelas Lingkaran sebagai bangunDatar
 *  Pembuat     : Rajwaa Muflihul Aufaa
 *  NIM         : 24060123140189
 *  Tanggal     : 1 Mei 2025
 */

public class Lingkaran extends BangunDatar {
    private double jejari;

    public Lingkaran(double jejari) {
        this.jejari = jejari;
    }

    public double hitungKeliling() {
        return 2*jejari*3.14;
    }
}