/*  Nama File   : DosenTetap.java
 *  Deskripsi   : Dosen tetap dengan NIDN dan tunjangan 2%
 *  Pembuat     : Rajwaa Muflihul Aufaa
 *  NIM         : 24060123140189
 *  Tanggal     : 15 Maret 2025
 */

import java.time.LocalDate;

class DosenTetap extends Dosen {
    private String nidn;
    private static final int BUP_TAHUN = 65;
    
    public DosenTetap(String nip, String nidn, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidn = nidn;
    }
    
    public LocalDate hitungBUP() {
        LocalDate bupDate = tanggalLahir.plusYears(BUP_TAHUN);
        return LocalDate.of(bupDate.getYear(), bupDate.getMonthValue() + 1, 1);
    }
    
    @Override
    public double hitungTunjangan() {
        int tahunMasaKerja = hitungMasaKerja().getYears();
        return 0.02 * tahunMasaKerja * gajiPokok;
    }
    
    @Override
    public void printInfo() {
        System.out.println("NIP\t\t: " + nip);
        System.out.println("NIDN\t\t: " + nidn);
        System.out.println("Nama\t\t: " + nama);
        System.out.println("TTL\t\t: " + formatTanggal(tanggalLahir));
        System.out.println("TMT\t\t: " + formatTanggal(tmt));
        System.out.println("Jabatan\t\t: Dosen Tetap");
        System.out.println("Fakultas\t: " + fakultas);
        System.out.println("Masa Kerja\t: " + getMasaKerjaString());
        System.out.println("BUP\t\t: " + formatTanggal(hitungBUP()));
        System.out.println("Gaji Pokok\t: Rp " + String.format("%,.2f", gajiPokok));
        int tahunMasaKerja = hitungMasaKerja().getYears();
        System.out.println("Tunjangan\t: 2% x " + tahunMasaKerja + " x Rp " + 
                            String.format("%,.2f", gajiPokok) + " = Rp " + 
                            String.format("%,.2f", hitungTunjangan()));
    }
}