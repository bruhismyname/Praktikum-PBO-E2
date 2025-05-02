/*  Nama File   : BangunDatarGeneric.java
 *  Deskripsi   : Kelas konstruksi generic untuk bangunDatar
 *  Pembuat     : Rajwaa Muflihul Aufaa
 *  NIM         : 24060123140189
 *  Tanggal     : 1 Mei 2025
 */

public class BangunDatarGeneric<T extends BangunDatar> {
    private T bangunDatar;

    public void set(T tipeBangunDatar) {
        bangunDatar = tipeBangunDatar;
    }

    public T get() {
        return bangunDatar;
    }

    public double hitungKeliling() {
        return bangunDatar.hitungKeliling();
    }
}

/* SOAL
 *
 * Cobalah pada saat praktikum : Gantilah ‘T’ (dan segala T) pada BangunDatarGeneric.java diganti dengan karakter yang lain seperti, T1,T2,T1234. 
 * Simpulkan apa yang anda lakukan ! 
 * 
 * Jawaban: 
 * Pada saat praktikum, saya mencoba mengganti parameter generic T di kelas BangunDatarGeneric menjadi nama lain seperti T1, T2, dan T1234. Setelah saya mengganti semua referensi T secara konsisten di dalam kelas tersebut, program tetap dapat dikompilasi dan dijalankan dengan baik.
 * Hal ini terjadi karena T hanyalah sebuah placeholder atau penamaan parameter tipe generic dalam Java. Nama ini bersifat bebas dan tidak harus menggunakan huruf T, meskipun T merupakan konvensi penamaan yang umum digunakan. Nama tersebut bisa diganti dengan nama lain seperti T1, X, ShapeType, atau bahkan T1234, selama penggunaannya konsisten di seluruh bagian kelas tersebut.
 * Namun, untuk menjaga keterbacaan kode dan mengikuti standar konvensi pemrograman Java, disarankan untuk tetap menggunakan penamaan generik yang umum seperti T (Type), E (Element), K (Key), dan V (Value).
 * 
 * Kesimpulan:
 * Mengganti T dengan nama lain seperti T1, T2, atau T1234 tidak memengaruhi fungsionalitas program, asalkan penggantiannya dilakukan secara konsisten. Nama parameter generic di Java bebas ditentukan, namun sebaiknya tetap mengikuti konvensi agar kode lebih mudah dibaca dan dipahami.
 */