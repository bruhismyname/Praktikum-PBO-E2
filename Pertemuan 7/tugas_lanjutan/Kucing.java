/*  Nama File   : Kucing.java
 *  Deskripsi   : Kelas kucing yang merupakan subclass dari anabul.
 *  Pembuat     : Rajwaa Muflihul Aufaa
 *  NIM         : 24060123140189
 *  Tanggal     : 24 April 2025
 */

public class Kucing extends Anabul {

  public Kucing(String nama) {
    super(nama);
  }

  @Override
  public void gerak() {
    System.out.println(nama + " bergerak dengan melata.");
  }

  @Override
  public void bersuara() {
    System.out.println(nama + " berbunyi: meong.");
  }
}