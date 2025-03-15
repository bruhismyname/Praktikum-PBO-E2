/*  Nama File   : PegawaiMain.java
 *  Deskripsi   : Main class untuk menguji sistem pegawai
 *  Pembuat     : Rajwaa Muflihul Aufaa
 *  NIM         : 24060123140189
 *  Tanggal     : 15 Maret 2025
 */

import java.time.LocalDate;

public class PegawaiMain {
    public static void main(String[] args) {
        // Tanggal sekarang: 15 Maret 2025
        System.out.println("*****************************************************");
        System.out.println("*   Praktikum Pemrograman Berorientasi Objek E2     *");
        System.out.println("*          Oleh: Rajwaa Muflihul Aufaa              *");
        System.out.println("*        INITIALIZATION PROGRAM PEGAWAI             *");
        System.out.println("*****************************************************\n");
        DosenTetap dosenTetap = new DosenTetap(
            "9545647548", 
            "78647324", 
            "Rajwaa", 
            LocalDate.of(1990, 5, 5), 
            LocalDate.of(2015, 1, 1),
            5000000.0, 
            "Fakultas Sains dan Matematika"
        );
        
        DosenTamu dosenTamu = new DosenTamu(
            "9545647549", 
            "92541367", 
            "Muflihul", 
            LocalDate.of(1985, 7, 15), 
            LocalDate.of(2020, 3, 1), 
            4500000.0, 
            "Fakultas Teknik",
            LocalDate.of(2026, 9, 1) 
        );
        
        Tendik tendik = new Tendik(
            "9545647550", 
            "Aufaa", 
            LocalDate.of(1992, 11, 10), 
            LocalDate.of(2018, 6, 1), 
            3500000.0, 
            "Akademik"
        );
        
        System.out.println("/******************* INFORMASI DOSEN TETAP *******************/");
        dosenTetap.printInfo();
        
        System.out.println("\n/******************* INFORMASI DOSEN TAMU *******************/");
        dosenTamu.printInfo();
        
        System.out.println("\n/******************* INFORMASI TENDIK *******************/");
        tendik.printInfo();

        System.out.println("\n/******************* END PROGRAM PEGAWAI *******************/");
    }
}