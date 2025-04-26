/*  Nama File   : Main.java
 *  Deskripsi   : Kelas main untuk menguji kelas anabul dan subclass-nya.
 *  Pembuat     : Rajwaa Muflihul Aufaa
 *  NIM         : 24060123140189
 *  Tanggal     : 24 April 2025
 */

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

    Anabul anabul1 = new Kucing("Molly");
    Anabul anabul2 = new Anjing("Bobby");
    Anabul anabul3 = new Burung("Coco");

    ArrayList<Anabul> koleksi = new ArrayList<>();
    koleksi.add(anabul1);
    koleksi.add(anabul2);
    koleksi.add(anabul3);

    for (Anabul a : koleksi) {
      System.out.println("=== " + a.getNama() + " ===");
      a.gerak();
      a.bersuara();
      System.out.println();
    }
  }
}