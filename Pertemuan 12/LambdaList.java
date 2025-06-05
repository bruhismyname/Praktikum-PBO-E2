/*  Nama File   : LambdaList.java
 *  Deskripsi   : Implementasi lambda pada List, digunakan sebagai parameter pada method
 *  Pembuat     : Rajwaa Muflihul Aufaa
 *  NIM         : 24060123140189
 *  Tanggal     : 6 Juni 2025
 */

import java.util.ArrayList;

public class LambdaList {
    public static void main(String[] args) {
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Rajwaa");
        mahasiswaList.add("Rafi");
        mahasiswaList.add("Rayhan");
    
        mahasiswaList.forEach((nama) -> System.out.println(nama));
    }
}