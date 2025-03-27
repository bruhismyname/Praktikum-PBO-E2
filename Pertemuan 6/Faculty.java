/*  Nama File   : Faculty.java
 *  Deskripsi   : Kelas Faculty merepresentasikan fakultas yang memiliki daftar ruangan.
 *  Pembuat     : Rajwaa Muflihul Aufaa
 *  NIM         : 24060123140189
 *  Tanggal     : 27 Maret 2025
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Faculty {
    private String namaFakultas;
    private List<Room> daftarRuang;
    private double tarifBiayaKebersihanStandar;
    
    // konstruktor default
    public Faculty() {
        this.namaFakultas = "";
        this.daftarRuang = new ArrayList<>();
        this.tarifBiayaKebersihanStandar = 0.0;
    }
    
    // parameter konstruktor
    public Faculty(String namaFakultas, double tarifBiayaKebersihanStandar) {
        this.namaFakultas = namaFakultas;
        this.daftarRuang = new ArrayList<>();
        this.tarifBiayaKebersihanStandar = tarifBiayaKebersihanStandar;
    }
    
    // tambah ruangan ke daftar ruangan
    public void tambahRuang(Room ruang) {
        daftarRuang.add(ruang);
    }
    
    // hitung total biaya kebersihan
    public double hitungTotalBiayaKebersihan() {
        double total = 0.0;
        for (Room ruang : daftarRuang) {
            total += ruang.hitungBiayaKebersihan();
        }
        return total;
    }
    
    // ambil informasi daftar ruangan
    public List<Room> getDaftarRuang() {
        return daftarRuang;
    }
    
    // ambil total ruang per jenis
    public Map<String, Integer> getTotalRuangPerJenis() {
        Map<String, Integer> totalRuangPerJenis = new HashMap<>();
        
        for (Room ruang : daftarRuang) {
            String jenisRuang = ruang.getClass().getSimpleName();
            totalRuangPerJenis.put(jenisRuang, totalRuangPerJenis.getOrDefault(jenisRuang, 0) + 1);
        }
        
        return totalRuangPerJenis;
    }
    
    // getter dan setter
    public String getNamaFakultas() {
        return namaFakultas;
    }
    
    public void setNamaFakultas(String namaFakultas) {
        this.namaFakultas = namaFakultas;
    }
    
    public double getTarifBiayaKebersihanStandar() {
        return tarifBiayaKebersihanStandar;
    }
    
    public void setTarifBiayaKebersihanStandar(double tarifBiayaKebersihanStandar) {
        this.tarifBiayaKebersihanStandar = tarifBiayaKebersihanStandar;
    }
}