/*  Nama File   : ContohMetodeGenerik.java
 *  Deskripsi   : Kelas ContohMetodeGenerik untuk mendemonstrasikan penggunaan metode generik
 *  Pembuat     : Rajwaa Muflihul Aufaa
 *  NIM         : 24060123140189
 *  Tanggal     : 1 Mei 2025
 */

public class ContohMetodeGenerik {
    
    public static <T extends Anabul> void tampilkanInfo(T hewan) {
        System.out.println("Nama: " + hewan.getNama());
        hewan.bersuara();
        hewan.bergerak();
    }
    
    public static <T extends Anabul> void bersuaraBerulang(T hewan, int jumlah) {
        System.out.println(hewan.getNama() + " bersuara " + jumlah + " kali:");
        for (int i = 0; i < jumlah; i++) {
            hewan.bersuara();
        }
    }
    
    public static <T extends Anabul, U extends Anabul> boolean samaNama(T hewan1, U hewan2) {
        return hewan1.getNama().equals(hewan2.getNama());
    }
    
    public static <T extends Anabul> Datum<T> modifikasiNama(T hewan, String awalan) {
        hewan.setNama(awalan + " " + hewan.getNama());
        return new Datum<>(hewan);
    }
    
    public static void main(String[] args) {
        System.out.println("\n/******************* DEMONSTRASI METODE GENERIK *******************/");
        
        Kucing kucing = new Kucing("Meow");
        Anjing anjing = new Anjing("Doggy");
        Burung burung = new Burung("Chirp");
        
        System.out.println("\n/******************* MENAMPILKAN INFORMASI HEWAN *******************/");
        tampilkanInfo(kucing);
        System.out.println();
        tampilkanInfo(anjing);
        System.out.println();
        tampilkanInfo(burung);
        
        System.out.println("\n/******************* DEMONSTRASI SUARA BERULANG *******************/");
        bersuaraBerulang(kucing, 3);
        System.out.println();
        bersuaraBerulang(anjing, 2);
        
        System.out.println("\n/******************* PERBANDINGAN NAMA HEWAN *******************/");
        Kucing kucingLain = new Kucing("Meow");
        System.out.println("Apakah " + kucing.getNama() + " dan " + kucingLain.getNama() + 
                         " memiliki nama yang sama? " + samaNama(kucing, kucingLain));
        System.out.println("Apakah " + kucing.getNama() + " dan " + anjing.getNama() + 
                         " memiliki nama yang sama? " + samaNama(kucing, anjing));
        
        System.out.println("\n/******************* MODIFIKASI NAMA HEWAN *******************/");
        Datum<Kucing> datumKucingBaru = modifikasiNama(kucing, "Si");
        Datum<Anjing> datumAnjingBaru = modifikasiNama(anjing, "Si");
        Datum<Burung> datumBurungBaru = modifikasiNama(burung, "Si");
        
        System.out.println("Nama kucing setelah dimodifikasi: " + datumKucingBaru.getIsi().getNama());
        System.out.println("Nama anjing setelah dimodifikasi: " + datumAnjingBaru.getIsi().getNama());
        System.out.println("Nama burung setelah dimodifikasi: " + datumBurungBaru.getIsi().getNama());
    }
}