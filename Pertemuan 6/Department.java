/*  Nama File   : Department.java
 *  Deskripsi   : Kelas Department merupakan kelas yang merepresentasikan departemen yang memiliki tarif biaya kebersihan.
 *  Pembuat     : Rajwaa Muflihul Aufaa
 *  NIM         : 24060123140189
 *  Tanggal     : 27 Maret 2025
 */

public class Department {
    private String namaDepartemen;
    private String ketuaDepartemen;
    private double tarifBiayaKebersihan;
    
    // konsktruktor default
    public Department() {
        this.namaDepartemen = "";
        this.ketuaDepartemen = "";
        this.tarifBiayaKebersihan = 0.0;
    }
    
    // parameter konstruktor
    public Department(String namaDepartemen, String ketuaDepartemen, double tarifBiayaKebersihan) {
        this.namaDepartemen = namaDepartemen;
        this.ketuaDepartemen = ketuaDepartemen;
        this.tarifBiayaKebersihan = tarifBiayaKebersihan;
    }
    
    // getter dan setter
    public String getNamaDepartemen() {
        return namaDepartemen;
    }
    
    public void setNamaDepartemen(String namaDepartemen) {
        this.namaDepartemen = namaDepartemen;
    }
    
    public String getKetuaDepartemen() {
        return ketuaDepartemen;
    }
    
    public void setKetuaDepartemen(String ketuaDepartemen) {
        this.ketuaDepartemen = ketuaDepartemen;
    }
    
    public double getTarifBiayaKebersihan() {
        return tarifBiayaKebersihan;
    }
    
    public void setTarifBiayaKebersihan(double tarifBiayaKebersihan) {
        this.tarifBiayaKebersihan = tarifBiayaKebersihan;
    }
}