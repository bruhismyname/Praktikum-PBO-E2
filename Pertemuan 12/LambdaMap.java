/*  Nama File   : LambdaMap.java
 *  Deskripsi   : Implementasi lambda pada Map, digunakan untuk menampilkan data mahasiswa
 *  Pembuat     : Rajwaa Muflihul Aufaa
 *  NIM         : 24060123140189
 *  Tanggal     : 6 Juni 2025
 */

import java.util.HashMap;
import java.util.Map;

public class LambdaMap {
    public static void main(String[] args) {
        Map<String,String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24060123140189", "Rajwaa Muflihul Aufaa");
        mahasiswaMap.put("24060123140109", "Rayhan Septian Wijaya");
        mahasiswaMap.put("24060123140154", "Rafi Althaf Hendyansyah");

        mahasiswaMap.forEach((key, value) -> System.out.println("NIM: " + key + ", Nama: " + value));
    }    
}