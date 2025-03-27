/*  Nama File   : ComputerLab.java
 *  Deskripsi   : Kelas ComputerLab merupakan kelas yang merepresentasikan ruangan laboratorium komputer.
 *  Pembuat     : Rajwaa Muflihul Aufaa
 *  NIM         : 24060123140189
 *  Tanggal     : 27 Maret 2025
 */

public class ComputerLab extends Laboratory {
    private int jumlahKomputer;
    
    // konstruktor default
    public ComputerLab() {
        super();
        this.jumlahKomputer = 0;
    }
    
    // konstruktor parameter
    public ComputerLab(String kode, double panjang, double lebar, double tinggi, int kapasitas,
                      String namaLaboratorium, double hargaSewa, Faculty faculty, int jumlahKomputer) {
        super(kode, panjang, lebar, tinggi, kapasitas, namaLaboratorium, hargaSewa, faculty);
        this.jumlahKomputer = jumlahKomputer;
    }
    
    // override method untuk menghitung biaya kebersihan
    @Override
    public void tampilkanInfoRuangan() {
        super.tampilkanInfoRuangan();
        System.out.println("Jenis Laboratorium: Laboratorium Komputer");
        System.out.println("Jumlah Komputer: " + jumlahKomputer);
    }
    
    // getter dan setter
    public int getJumlahKomputer() {
        return jumlahKomputer;
    }
    
    public void setJumlahKomputer(int jumlahKomputer) {
        this.jumlahKomputer = jumlahKomputer;
    }
}