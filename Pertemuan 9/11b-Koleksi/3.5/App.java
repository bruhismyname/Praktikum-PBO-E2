/*  Nama File   : App.java
 *  Deskripsi   : Program App yang merupakan main Koleksi
 *  Pembuat     : Rajwaa Muflihul Aufaa
 *  NIM         : 24060123140189
 *  Tanggal     : 8 Mei 2025
 */

public class App {
    public static void main(String[] args) {
        Koleksi<Character> koleksiKarakter = new Koleksi<>();
        
        System.out.println("\n/******************* APP KOLEKSI KARAKTER *******************/");
        
        System.out.println("\n/******************* MENAMBAHKAN 10 KARAKTER *******************/");
        char[] karakters = {'R', 'A', 'J', 'W', 'A', 'A', 'U', 'F', 'A', 'A'};
        
        for (char c : karakters) {
            koleksiKarakter.add(c);
            System.out.println("Menambahkan karakter: " + c);
        }
        
        System.out.println("\n/******************* MENAMPILKAN SEMUA KARAKTER *******************/");
        System.out.println("Jumlah elemen: " + koleksiKarakter.getSize());
        koleksiKarakter.showAll();
        
        System.out.println("\n/******************* MENGAKSES ELEMEN TERTENTU *******************/");
        int indexAkses = 3;
        System.out.println("Elemen pada indeks " + indexAkses + ": " + koleksiKarakter.getIsi(indexAkses));
        
        System.out.println("\n/******************* MENGUBAH ELEMEN *******************/");
        int indexUbah = 5;
        char karakterBaru = 'J';
        System.out.println("Mengubah elemen pada indeks " + indexUbah + " dari '" + 
                          koleksiKarakter.getIsi(indexUbah) + "' menjadi '" + karakterBaru + "'");
        koleksiKarakter.setIsi(indexUbah, karakterBaru);
        
        System.out.println("\n/******************* KOLEKSI SETELAH PENGUBAHAN *******************/");
        koleksiKarakter.showAll();
        
        System.out.println("\n/******************* MENGHAPUS ELEMEN *******************/");
        System.out.println("Jumlah elemen sebelum penghapusan: " + koleksiKarakter.getSize());
        
        for (int i = 0; i < 3; i++) {
            char karakterDihapus = koleksiKarakter.delete();
            System.out.println("Elemen yang dihapus: " + karakterDihapus);
        }
        
        System.out.println("\n/******************* KOLEKSI SETELAH PENGHAPUSAN *******************/");
        System.out.println("Jumlah elemen setelah penghapusan: " + koleksiKarakter.getSize());
        koleksiKarakter.showAll();
        
        System.out.println("\n/******************* MENAMBAHKAN KARAKTER BARU *******************/");
        char[] karakterBaru2 = {'A', 'V', 'A'};
        
        for (char c : karakterBaru2) {
            koleksiKarakter.add(c);
            System.out.println("Menambahkan karakter: " + c);
        }
        
        System.out.println("\n/******************* KOLEKSI FINAL *******************/");
        System.out.println("Jumlah elemen: " + koleksiKarakter.getSize());
        koleksiKarakter.showAll();
    }
}