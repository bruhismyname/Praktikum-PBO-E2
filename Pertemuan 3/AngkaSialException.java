/*  Nama File   : AngkaSialException.java
 *  Deskripsi   : Eksepsi buatan sendiri, menolak masukan angka 13!
 *  Pembuat     : Rajwaa Muflihul Aufaa
 *  NIM         : 24060123140189
 *  Tanggal     : 6 Maret 2025
 */

public class AngkaSialException extends Exception {
    public AngkaSialException() {
        super("Jangan masukkan angka 13!");
    }
}