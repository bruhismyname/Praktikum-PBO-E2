/*  Nama File   : Pegawai.java
 *  Deskripsi   : Superclass untuk semua pegawai perguruan tinggi
 *  Pembuat     : Rajwaa Muflihul Aufaa
 *  NIM         : 24060123140189
 *  Tanggal     : 15 Maret 2025
 */

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

class Pegawai {
    protected String nip;
    protected String nama;
    protected LocalDate tanggalLahir;
    protected LocalDate tmt; 
    protected double gajiPokok;
    
    public Pegawai(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok) {
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
    }
    
    public Period hitungMasaKerja() {
        LocalDate today = LocalDate.now();
        return Period.between(tmt, today);
    }

    public String getMasaKerjaString() {
        Period masaKerja = hitungMasaKerja();
        return masaKerja.getYears() + " tahun " + masaKerja.getMonths() + " bulan";
    }
    
    public double hitungTunjangan() {
        return 0.0; 
    }
    
    protected String formatTanggal(LocalDate tanggal) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));
        return tanggal.format(formatter);
    }
    
    public void printInfo() {
        System.out.println("NIP\t: " + nip);
        System.out.println("Nama\t: " + nama);
        System.out.println("Tanggal Lahir\t: " + formatTanggal(tanggalLahir));
        System.out.println("TMT\t: " + formatTanggal(tmt));
        System.out.println("Masa Kerja\t: " + getMasaKerjaString());
        System.out.println("Gaji Pokok\t: Rp " + String.format("%,.2f", gajiPokok));
        System.out.println("Tunjangan\t: " + String.format("Rp %,.2f", hitungTunjangan()));
    }
}