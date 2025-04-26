/*  Nama File   : Programmer.java
 *  Deskripsi   : Kelas programmer sebagai subclass dari kelas pegawai.
 *  Pembuat     : Rajwaa Muflihul Aufaa
 *  NIM         : 24060123140189
 *  Tanggal     : 24 April 2025
 */

public class Programmer extends Pegawai {
  private int bonus = 450_000;

  public Programmer(String nama) {
    super(nama);
  }

  @Override
  public void tampilData() {
    super.tampilData();
    System.out.println("Bonus     : " + bonus);
  }
}