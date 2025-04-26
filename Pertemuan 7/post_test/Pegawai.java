/*  Nama File   : Pegaawai.java
 *  Deskripsi   : Kelas pegawai sebagai superclass dari kelas manajer dan programmer.
 *  Pembuat     : Rajwaa Muflihul Aufaa
 *  NIM         : 24060123140189
 *  Tanggal     : 24 April 2025
 */

public class Pegawai {
  protected String nama;
  protected int gajiPokok = 5_000_000;

  public Pegawai(String nama) {
    this.nama = nama;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public void tampilData() {
    System.out.println("Nama    : " + nama + ", Gaji pokok : " + gajiPokok);
  }
}