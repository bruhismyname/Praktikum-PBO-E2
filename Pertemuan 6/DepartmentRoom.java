/*  Nama File   : DepartmentRoom.java
 *  Deskripsi   : Kelas DepartmentRoom merupakan kelas turunan dari kelas Room yang merepresentasikan ruangan departemen.
 *  Pembuat     : Rajwaa Muflihul Aufaa
 *  NIM         : 24060123140189
 *  Tanggal     : 27 Maret 2025
 */

public class DepartmentRoom extends Room {
    private int jumlahMeja;
    private int jumlahKursi;
    private int jumlahLemari;
    private Department department;
    
    // konsktruktor default
    public DepartmentRoom() {
        super();
        this.jumlahMeja = 0;
        this.jumlahKursi = 0;
        this.jumlahLemari = 0;
    }
    
    // parameter konstruktor
    public DepartmentRoom(String kode, double panjang, double lebar, double tinggi, int kapasitas,
                         int jumlahMeja, int jumlahKursi, int jumlahLemari, Department department) {
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.jumlahMeja = jumlahMeja;
        this.jumlahKursi = jumlahKursi;
        this.jumlahLemari = jumlahLemari;
        this.department = department;
    }
    
    // override method untuk menghitung biaya kebersihan
    @Override
    public double hitungBiayaKebersihan() {
        return hitungLuasRuangan() * department.getTarifBiayaKebersihan();
    }
    
    // ambil total perabot
    public int getTotalPerabot() {
        return jumlahMeja + jumlahKursi + jumlahLemari;
    }
    
    // override method untuk menampilkan informasi ruangan
    @Override
    public void tampilkanInfoRuangan() {
        super.tampilkanInfoRuangan();
        System.out.println("Jenis Ruangan: Ruang Departemen");
        System.out.println("Departemen: " + department.getNamaDepartemen());
        System.out.println("Jumlah Meja: " + jumlahMeja);
        System.out.println("Jumlah Kursi: " + jumlahKursi);
        System.out.println("Jumlah Lemari: " + jumlahLemari);
        System.out.println("Total Perabot: " + getTotalPerabot());
    }
    
    // getter dan setter
    public int getJumlahMeja() {
        return jumlahMeja;
    }
    
    public void setJumlahMeja(int jumlahMeja) {
        this.jumlahMeja = jumlahMeja;
    }
    
    public int getJumlahKursi() {
        return jumlahKursi;
    }
    
    public void setJumlahKursi(int jumlahKursi) {
        this.jumlahKursi = jumlahKursi;
    }
    
    public int getJumlahLemari() {
        return jumlahLemari;
    }
    
    public void setJumlahLemari(int jumlahLemari) {
        this.jumlahLemari = jumlahLemari;
    }
    
    public Department getDepartment() {
        return department;
    }
    
    public void setDepartment(Department department) {
        this.department = department;
    }
}