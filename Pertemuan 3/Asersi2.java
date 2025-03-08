/*  Nama File   : Asersi2.java
 *  Deskripsi   : Program untuk demo asersi, yang akan menolak input jari-jari lingkran yang bernilai nol
 *  Pembuat     : Rajwaa Muflihul Aufaa
 *  NIM         : 24060123140189
 *  Tanggal     : 6 Maret 2025
 */

// class Lingkaran
class Lingkaran {
    private double jariJari;
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }
    public double hitungKeliling() {
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
}

// class Asersi2
public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        assert(jariJari>0): "Jari-jari harus lebih besar dari 0";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("Keliling lingkaran dengan jari-jari " + jariJari + " adalah " + kelilingLingkaran);
    }
}

// Pertanyaan: secara konsep, ada yang kurang tepat pada program Asersi2 di atas.

// Jawaban: Program menggunakan assertion untuk memeriksa nilai jari-jari, padahal assertion seharusnya hanya untuk debugging, bukan untuk validasi input dalam implementasi program. Validasi nilai jari-jari (harus > 0) seharusnya dilakukan di constructor class Lingkaran menggunakan exception, bukan di method main dengan assertion. Ini lebih sesuai dengan konsep encapsulation dalam pemrograman berorientasi objek.Cara yang lebih tepat adalah constructor Lingkaran melempar exception jika jari-jari tidak valid, kemudian method main menangkapnya dengan try-catch. Dengan begitu, program tetap bisa memberikan pesan error dan melakukan penanganan yang lebih baik daripada langsung berhenti ketika assertion gagal.