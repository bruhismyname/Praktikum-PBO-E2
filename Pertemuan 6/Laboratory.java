/*  Nama File   : Laboratory.java
 *  Deskripsi   : Abstract class Laboratory merupakan kelas abstrak yang merepresentasikan laboratorium.
 *  Pembuat     : Rajwaa Muflihul Aufaa
 *  NIM         : 24060123140189
 *  Tanggal     : 27 Maret 2025
 */

public abstract class Laboratory extends Room implements Rentable {
    private String namaLaboratorium;
    private double hargaSewa;
    private Faculty faculty;
    
    // konstruktor default
    public Laboratory() {
        super();
        this.namaLaboratorium = "";
        this.hargaSewa = 0.0;
    }
    
    // parameter konstruktor
    public Laboratory(String kode, double panjang, double lebar, double tinggi, int kapasitas,
                     String namaLaboratorium, double hargaSewa, Faculty faculty) {
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.namaLaboratorium = namaLaboratorium;
        this.hargaSewa = hargaSewa;
        this.faculty = faculty;
    }
    
    // override method untuk menghitung biaya kebersihan
    @Override
    public double hitungBiayaKebersihan() {
        return hitungLuasRuangan() * faculty.getTarifBiayaKebersihanStandar();
    }
    
    // override method untuk menampilkan informasi ruangan
    @Override
    public void tampilkanInfoRuangan() {
        super.tampilkanInfoRuangan();
        System.out.println("Nama Laboratorium: " + namaLaboratorium);
        System.out.println("Harga Sewa: Rp " + String.format("%,.2f", hargaSewa) + " per hari");
    }
    
    // getter dan setter
    public String getNamaLaboratorium() {
        return namaLaboratorium;
    }
    
    public void setNamaLaboratorium(String namaLaboratorium) {
        this.namaLaboratorium = namaLaboratorium;
    }
    
    @Override
    public double getHargaSewa() {
        return hargaSewa;
    }
    
    @Override
    public void setHargaSewa(double hargaSewa) {
        this.hargaSewa = hargaSewa;
    }
    
    public Faculty getFaculty() {
        return faculty;
    }
    
    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }
}