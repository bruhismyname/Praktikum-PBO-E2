/*  Nama File   : DosenTamu.java
 *  Deskripsi   : Dosen tamu dengan NIDK dan kontrak berakhir
 *  Pembuat     : Rajwaa Muflihul Aufaa
 *  NIM         : 24060123140189
 *  Tanggal     : 15 Maret 2025
 */

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class DosenTamu extends Dosen {
    private String nidk;
    private LocalDate tanggalBerakhirKontrak;
    
    public DosenTamu(String nip, String nidk, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas, LocalDate tanggalBerakhirKontrak) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidk = nidk;
        this.tanggalBerakhirKontrak = tanggalBerakhirKontrak;
    }
    
    public long hitungSisaKontrak() {
        LocalDate today = LocalDate.now();
        return ChronoUnit.MONTHS.between(today, tanggalBerakhirKontrak);
    }
    
    @Override
    public double hitungTunjangan() {
        return 0.025 * gajiPokok;
    }
    
    @Override
    public void printInfo() {
        System.out.println("NIP\t\t: " + nip);
        System.out.println("NIDK\t\t: " + nidk);
        System.out.println("Nama\t\t: " + nama);
        System.out.println("TTL\t\t: " + formatTanggal(tanggalLahir));
        System.out.println("TMT\t\t: " + formatTanggal(tmt));
        System.out.println("Jabatan\t\t: Dosen Tamu");
        System.out.println("Fakultas\t: " + fakultas);
        System.out.println("Masa Kerja\t: " + getMasaKerjaString());
        System.out.println("Kontrak Berakhir: " + formatTanggal(tanggalBerakhirKontrak));
        System.out.println("Sisa Kontrak\t: " + hitungSisaKontrak() + " bulan");
        System.out.println("Gaji Pokok\t: Rp " + String.format("%,.2f", gajiPokok));
        System.out.println("Tunjangan\t: 2,5% x Rp " + String.format("%,.2f", gajiPokok) + 
                            " = Rp " + String.format("%,.2f", hitungTunjangan()));
    }
}