/*  Nama File   : Coercion.java
 *  Deskripsi   : Konversi otomatis tipe data, seperti dari kecil ke besar (widening) atau besar ke kecil (narrowing).
 *  Pembuat     : Rajwaa Muflihul Aufaa
 *  NIM         : 24060123140189
 *  Tanggal     : 24 April 2025
 */

public class Coercion {
  public static void main(String[] args) {
    int output1 = 'a';
    System.out.println("1. output1 = 'a'  -> " + output1);
  
    int y = 25;
    double output3 = y;
    System.out.println("3. output3 = y    -> " + output3);

    int z = 78;
    char output4 = (char) z;
    System.out.println("4. output4 = (char)z -> " + output4);

    char a = 'a';
    double output5 = a;
    System.out.println("5. output5 = a    -> " + output5);
  }
}