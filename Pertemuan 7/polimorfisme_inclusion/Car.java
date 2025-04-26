/*  Nama File   : Car.java
 *  Deskripsi   : Kelas car sebagai subclass dari vehicle.
 *  Pembuat     : Rajwaa Muflihul Aufaa
 *  NIM         : 24060123140189
 *  Tanggal     : 24 April 2025
 */

public class Car extends Vehicle {
  @Override
  void calRent(int jarak, float harga) {
    float fare = jarak * harga;
    fare = fare - 100.0f; 
    System.out.println("harga sewa mobil = " + fare);
  }
}