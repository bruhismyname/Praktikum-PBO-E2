/*  Nama File   : NonComputerLab.java
 *  Deskripsi   : Kelas NonComputerLab merupakan kelas turunan dari kelas Laboratory yang merepresentasikan laboratorium non-komputer.
 *  Pembuat     : Rajwaa Muflihul Aufaa
 *  NIM         : 24060123140189
 *  Tanggal     : 27 Maret 2025
 */

import java.util.ArrayList;
import java.util.List;

public class NonComputerLab extends Laboratory {
    private List<String> daftarMataKuliah;
    private String kategori; 
    
    // konstruktor default
    public NonComputerLab() {
        super();
        this.daftarMataKuliah = new ArrayList<>();
        this.kategori = "";
    }
    
    // parameter konstruktor
    public NonComputerLab(String kode, double panjang, double lebar, double tinggi, int kapasitas,
                         String namaLaboratorium, double hargaSewa, Faculty faculty, 
                         String kategori, List<String> daftarMataKuliah) {
        super(kode, panjang, lebar, tinggi, kapasitas, namaLaboratorium, hargaSewa, faculty);
        this.kategori = kategori;
        this.daftarMataKuliah = daftarMataKuliah;
    }
    
    // override method untuk menampilkan informasi ruangan
    @Override
    public void tampilkanInfoRuangan() {
        super.tampilkanInfoRuangan();
        System.out.println("Jenis Laboratorium: Laboratorium Non-Komputer");
        System.out.println("Kategori: " + kategori);
        System.out.println("Daftar Mata Kuliah:");
        for (String mataKuliah : daftarMataKuliah) {
            System.out.println("- " + mataKuliah);
        }
    }
    
    // getter dan setter
    public List<String> getDaftarMataKuliah() {
        return daftarMataKuliah;
    }
    
    public void setDaftarMataKuliah(List<String> daftarMataKuliah) {
        this.daftarMataKuliah = daftarMataKuliah;
    }
    
    public String getKategori() {
        return kategori;
    }
    
    public void setKategori(String kategori) {
        this.kategori = kategori;
    }
    
    // Add a course to the list
    public void tambahMataKuliah(String mataKuliah) {
        daftarMataKuliah.add(mataKuliah);
    }
}