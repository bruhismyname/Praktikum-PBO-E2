/*  Nama File   : ClassRoom.java
 *  Deskripsi   : Kelas ClassRoom merupakan kelas turunan dari kelas Room yang merepresentasikan ruangan kelas.
 *  Pembuat     : Rajwaa Muflihul Aufaa
 *  NIM         : 24060123140189
 *  Tanggal     : 27 Maret 2025
 */

public class ClassRoom extends Room {
    private int jumlahKursiTersedia;
    private int jumlahKursiRusak;
    private Faculty faculty;
    
    // Default constructor
    public ClassRoom() {
        super();
        this.jumlahKursiTersedia = 0;
        this.jumlahKursiRusak = 0;
    }
    
    // Parameterized constructor
    public ClassRoom(String kode, double panjang, double lebar, double tinggi, int kapasitas,
                    int jumlahKursiTersedia, int jumlahKursiRusak, Faculty faculty) {
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.jumlahKursiTersedia = jumlahKursiTersedia;
        this.jumlahKursiRusak = jumlahKursiRusak;
        this.faculty = faculty;
    }
    
    // Override method to calculate cleaning cost
    @Override
    public double hitungBiayaKebersihan() {
        return hitungLuasRuangan() * faculty.getTarifBiayaKebersihanStandar();
    }
    
    // Get total chairs
    public int getTotalKursi() {
        return jumlahKursiTersedia + jumlahKursiRusak;
    }
    
    // Get chair status
    public String getStatusKursi() {
        double persentaseRusak = ((double) jumlahKursiRusak / getTotalKursi()) * 100;
        if (persentaseRusak < 5) {
            return "Sangat Baik";
        } else if (persentaseRusak < 10) {
            return "Baik";
        } else if (persentaseRusak < 20) {
            return "Cukup";
        } else {
            return "Buruk";
        }
    }
    
    // Override method to display room information
    @Override
    public void tampilkanInfoRuangan() {
        super.tampilkanInfoRuangan();
        System.out.println("Jenis Ruangan: Ruang Kelas");
        System.out.println("Jumlah Kursi Tersedia: " + jumlahKursiTersedia);
        System.out.println("Jumlah Kursi Rusak: " + jumlahKursiRusak);
        System.out.println("Total Kursi: " + getTotalKursi());
        System.out.println("Status Kursi: " + getStatusKursi());
    }
    
    // Getters and setters
    public int getJumlahKursiTersedia() {
        return jumlahKursiTersedia;
    }
    
    public void setJumlahKursiTersedia(int jumlahKursiTersedia) {
        this.jumlahKursiTersedia = jumlahKursiTersedia;
    }
    
    public int getJumlahKursiRusak() {
        return jumlahKursiRusak;
    }
    
    public void setJumlahKursiRusak(int jumlahKursiRusak) {
        this.jumlahKursiRusak = jumlahKursiRusak;
    }
    
    public Faculty getFaculty() {
        return faculty;
    }
    
    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }
}