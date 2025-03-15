/*  Nama File   : Tendik.java
 *  Deskripsi   : Tenaga kependidikan dengan bidang dan tunjangan 1%
 *  Pembuat     : Rajwaa Muflihul Aufaa
 *  NIM         : 24060123140189
 *  Tanggal     : 15 Maret 2025
 */

import java.time.LocalDate;

class Tendik extends Pegawai {
    private String bidang; 
    private static final int BUP_TAHUN = 55;
    
    public Tendik(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String bidang) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.bidang = bidang;
    }
    
    public LocalDate hitungBUP() {
        LocalDate bupDate = tanggalLahir.plusYears(BUP_TAHUN);
        return LocalDate.of(bupDate.getYear(), bupDate.getMonthValue() + 1, 1);
    }
    
    @Override
    public double hitungTunjangan() {
        int tahunMasaKerja = hitungMasaKerja().getYears();
        return 0.01 * tahunMasaKerja * gajiPokok;
    }
    
    @Override
    public void printInfo() {
        System.out.println("NIP\t\t: " + nip);
        System.out.println("Nama\t\t: " + nama);
        System.out.println("TTL\t\t: " + formatTanggal(tanggalLahir));
        System.out.println("TMT\t\t: " + formatTanggal(tmt));
        System.out.println("Jabatan\t\t: Tenaga Kependidikan");
        System.out.println("Bidang\t\t: " + bidang);
        System.out.println("Masa Kerja\t: " + getMasaKerjaString());
        System.out.println("BUP\t\t: " + formatTanggal(hitungBUP()));
        System.out.println("Gaji Pokok\t: Rp " + String.format("%,.2f", gajiPokok));
        int tahunMasaKerja = hitungMasaKerja().getYears();
        System.out.println("Tunjangan\t: 1% x " + tahunMasaKerja + " x Rp " + 
                            String.format("%,.2f", gajiPokok) + " = Rp " + 
                            String.format("%,.2f", hitungTunjangan()));
    }
}