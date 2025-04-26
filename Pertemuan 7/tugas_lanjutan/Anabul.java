/*  Nama File   : Anabul.java
 *  Deskripsi   : Kelas abstrak anabul yang menjadi superclass untuk kucing, anjing, dan burung.
 *  Pembuat     : Rajwaa Muflihul Aufaa
 *  NIM         : 24060123140189
 *  Tanggal     : 24 April 2025
 */

public abstract class Anabul {
  protected String nama;

  public Anabul(String nama) {
    this.nama = nama;
  }

  public abstract void gerak();

  public abstract void bersuara();

  public String getNama() {
    return nama;
  }
}