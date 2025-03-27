/*  Nama File   : LecturerRoom.java
 *  Deskripsi   : Kelas LecturerRoom merupakan kelas turunan dari kelas Room yang merepresentasikan ruangan dosen.
 *  Pembuat     : Rajwaa Muflihul Aufaa
 *  NIM         : 24060123140189
 *  Tanggal     : 27 Maret 2025
 */

public class LecturerRoom extends Room {
    private String namaDosen;
    private int jumlahKursi;
    private int jumlahMeja;
    private Department department;
    
    // konstruktor default
    public LecturerRoom() {
        super();
        this.namaDosen = "";
        this.jumlahKursi = 0;
        this.jumlahMeja = 0;
    }
    
    // parameter konstruktor
    public LecturerRoom(String kode, double panjang, double lebar, double tinggi, int kapasitas,
                       String namaDosen, int jumlahKursi, int jumlahMeja, Department department) {
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.namaDosen = namaDosen;
        this.jumlahKursi = jumlahKursi;
        this.jumlahMeja = jumlahMeja;
        this.department = department;
    }
    
    // override method untuk menghitung biaya kebersihan
    @Override
    public double hitungBiayaKebersihan() {
        return hitungLuasRuangan() * department.getTarifBiayaKebersihan();
    }
    
    // override method untuk menampilkan informasi ruangan
    @Override
    public void tampilkanInfoRuangan() {
        super.tampilkanInfoRuangan();
        System.out.println("Jenis Ruangan: Ruang Dosen");
        System.out.println("Nama Dosen: " + namaDosen);
        System.out.println("Departemen: " + department.getNamaDepartemen());
        System.out.println("Jumlah Kursi: " + jumlahKursi);
        System.out.println("Jumlah Meja: " + jumlahMeja);
    }
    
    // getter dan setter
    public String getNamaDosen() {
        return namaDosen;
    }
    
    public void setNamaDosen(String namaDosen) {
        this.namaDosen = namaDosen;
    }
    
    public int getJumlahKursi() {
        return jumlahKursi;
    }
    
    public void setJumlahKursi(int jumlahKursi) {
        this.jumlahKursi = jumlahKursi;
    }
    
    public int getJumlahMeja() {
        return jumlahMeja;
    }
    
    public void setJumlahMeja(int jumlahMeja) {
        this.jumlahMeja = jumlahMeja;
    }
    
    public Department getDepartment() {
        return department;
    }
    
    public void setDepartment(Department department) {
        this.department = department;
    }
}