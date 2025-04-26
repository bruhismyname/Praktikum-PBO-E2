/*  Nama File   : Vehicle.java
 *  Deskripsi   : Kelas vehicle sebagai superclass dari car dan bus
 *  Pembuat     : Rajwaa Muflihul Aufaa
 *  NIM         : 24060123140189
 *  Tanggal     : 24 April 2025
 */

public class Vehicle {
  void calRent(int distance, float price) {
    float fare = distance * price;
    System.out.println("vehicle price = " + fare);
  }
}