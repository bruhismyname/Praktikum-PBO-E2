/*  Nama File   : ArrayListTest.java
 *  Deskripsi   : Program penggunaan objek ArrayList sebagai Collection class
 *  Pembuat     : Rajwaa Muflihul Aufaa
 *  NIM         : 24060123140189
 *  Tanggal     : 8 Mei 2025
 */

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        // Inisialisasi ArrayList yang hanya dapat berisi String
        ArrayList<String> strings = new ArrayList<String>();
        // Menambahkan elemen ke dalam ArrayList
        strings.add("Praktikum");
        strings.add("Collection");
        strings.add("dan Generics");
        // Menghapus elemen
        strings.remove("Praktikum");
        // Iterasi pada ArrayList
        for (String s : strings) {
            System.out.println(s+" ");
        }
    }
}