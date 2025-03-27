/*  Nama File   : Room.java
 *  Deskripsi   : Kelas abstrak Room merupakan kelas dasar.
 *  Pembuat     : Rajwaa Muflihul Aufaa
 *  NIM         : 24060123140189
 *  Tanggal     : 27 Maret 2025
 */

public abstract class Room {
    private String kode;
    private double panjang;
    private double lebar;
    private double tinggi;
    private int kapasitas;
    
    // konstruktor default
    public Room() {
        this.kode = "";
        this.panjang = 0.0;
        this.lebar = 0.0;
        this.tinggi = 0.0;
        this.kapasitas = 0;
    }
    
    // parameter konstruktor
    public Room(String kode, double panjang, double lebar, double tinggi, int kapasitas) {
        this.kode = kode;
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        this.kapasitas = kapasitas;
    }
    
    // hitung luas ruangan
    public double hitungLuasRuangan() {
        return panjang * lebar;
    }
    
    // hitung biaya kebersihan abstract method
    public abstract double hitungBiayaKebersihan();
    
    // tampilkan informasi ruangan
    public void tampilkanInfoRuangan() {
        System.out.println("Kode Ruangan: " + kode);
        System.out.println("Ukuran (P x L x T): " + panjang + " x " + lebar + " x " + tinggi);
        System.out.println("Kapasitas: " + kapasitas + " orang");
        System.out.println("Luas Ruangan: " + hitungLuasRuangan() + " m²");
        System.out.println("Biaya Kebersihan: Rp " + String.format("%,.2f", hitungBiayaKebersihan()));
    }
    
    // getter dan setter
    public String getKode() {
        return kode;
    }
    
    public void setKode(String kode) {
        this.kode = kode;
    }
    
    public double getPanjang() {
        return panjang;
    }
    
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }
    
    public double getLebar() {
        return lebar;
    }
    
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
    
    public double getTinggi() {
        return tinggi;
    }
    
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    
    public int getKapasitas() {
        return kapasitas;
    }
    
    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }
}