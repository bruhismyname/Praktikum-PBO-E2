/*  Nama File   : Anabul.java
 *  Deskripsi   : Program untuk mendefinisikan kelas abstrak Anabul
 *  Pembuat     : Rajwaa Muflihul Aufaa
 *  NIM         : 24060123140189
 *  Tanggal     : 8 Mei 2025
 */

public abstract class Anabul {
    protected String nama;
    
    public Anabul(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    // Method abstract yang akan diimplementasikan oleh kelas anak
    public abstract void Gerak();
    public abstract void Bersuara();
}