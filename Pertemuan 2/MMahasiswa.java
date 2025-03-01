/*  Nama File   : MMahasiswa.java
 *  Deskripsi   : berisi atribut dan method dalam class MMahasiswa
 *  Pembuat     : Rajwaa Muflihul Aufaa
 *  NIM         : 24060123140189
 *  Tanggal     : 27 Februari 2025
 */

public class MMahasiswa{
    public static void main(String[] args){
    System.out.println("*****************************************************");
    System.out.println("*   Praktikum Pemrograman Berorientasi Objek E2     *");
    System.out.println("*          Oleh: Rajwaa Muflihul Aufaa              *");
    System.out.println("*       INITIALIZATION PROGRAM MAHASISWA            *");
    System.out.println("*****************************************************\n");
    MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berorientasi Objek", 3);
    MataKuliah MBD = new MataKuliah("MBD", "Manajemen Basis Data", 3);
    MataKuliah Jarkom = new MataKuliah("Jarkom","Jaringan Komputer", 3);
    MataKuliah ASA = new MataKuliah("ASA", "Analisis Strategi Algoritma", 3);
    MataKuliah Siscer = new MataKuliah("Siscer", "Sistem Cerdas", 3);
    Mahasiswa M1 = new Mahasiswa("24060123140189", "Rajwaa Muflihul Aufaa", "Informatika");
    Dosen D1 = new Dosen("D001", "Eko Adi Sarwoko", "Informatika");
    Kendaraan K1 = new Kendaraan("K 8298 K", "Motor");
    M1.setDosenWali(D1);
    M1.setKendaraan(K1);
    M1.tambahMatkul(ASA);
    M1.tambahMatkul(PBO);
    M1.tambahMatkul(Siscer);
    M1.tambahMatkul(MBD);
    M1.tambahMatkul(Jarkom);
    M1.printDetailMhs();
    System.out.println("\n/******************* END PROGRAM MAHASISWA *******************/");
    }
}