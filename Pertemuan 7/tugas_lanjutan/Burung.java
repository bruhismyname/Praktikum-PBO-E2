/*  Nama File   : Burung.java
 *  Deskripsi   : Kelas burung yang merupakan subclass dari anabul.
 *  Pembuat     : Rajwaa Muflihul Aufaa
 *  NIM         : 24060123140189
 *  Tanggal     : 24 April 2025
 */

public class Burung extends Anabul {

  public Burung(String nama) {
    super(nama);
  }

  @Override
  public void gerak() {
    System.out.println(nama + " bergerak dengan terbang.");
  }

  @Override
  public void bersuara() {
    System.out.println(nama + " berbunyi: cuit.");
  }
}