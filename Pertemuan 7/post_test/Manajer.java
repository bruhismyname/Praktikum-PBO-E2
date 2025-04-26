/*  Nama File   : Manajer.java
 *  Deskripsi   : Kelas manajer sebagai subclass dari kelas pegawai.
 *  Pembuat     : Rajwaa Muflihul Aufaa
 *  NIM         : 24060123140189
 *  Tanggal     : 24 April 2025
 */

public class Manajer extends Pegawai {
  private int tunjangan = 700_000;

  public Manajer(String nama) {
    super(nama);
  }

  @Override
  public void tampilData() {
    super.tampilData();
    System.out.println("Tunjangan : " + tunjangan);
  }
}