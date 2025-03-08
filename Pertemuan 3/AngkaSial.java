/*  Nama File   : AngkaSial.java
 *  Deskripsi   : Program penggunaan exception buatan sendiri , pengenalan klausa 'throw' dan 'throws'
 *  Pembuat     : Rajwaa Muflihul Aufaa
 *  NIM         : 24060123140189
 *  Tanggal     : 6 Maret 2025
 */

public class AngkaSial{
    public void cobaAngka(int angka) throws AngkaSialException{
        if (angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException ase) {
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka");
        }
    }
}

// Pertanyaan: 1. Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
//             2. Apakah baris 21 pada AngkaSial.java di atas dieksekusi?   

// Jawaban: 1. Tidak akan dieksekusi. Ini karena saat exception dilempar (throw), program langsung keluar dari method dan mencari blok catch, melewati semua baris kode setelah throw.
//          2. Akan dieksekusi. Ini karena blok catch ini dirancang untuk menangkap exception tipe AngkaSialException yang dilempar dari method cobaAngka. Saat exception tertangkap, kode dalam blok catch dijalankan, menampilkan pesan error.

// Kesimpulannya, saat exception terjadi, aliran program akan melompat langsung dari baris throw ke blok catch yang sesuai, melewatkan semua kode yang ada di antara keduanya.
