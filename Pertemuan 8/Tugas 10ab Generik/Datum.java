/*  Nama File   : Datum.java
 *  Deskripsi   : Kelas Datum yang merupakan kelas generik
 *  Pembuat     : Rajwaa Muflihul Aufaa
 *  NIM         : 24060123140189
 *  Tanggal     : 1 Mei 2025
 */

public class Datum<T> {
    private T isi;
    
    public Datum(T isi) {
        this.isi = isi;
    }
    
    public T getIsi() {
        return isi;
    }
    
    public void setIsi(T isi) {
        this.isi = isi;
    }
}