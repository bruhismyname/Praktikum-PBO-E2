/*  Nama File   : KoleksiAnabul.java
 *  Deskripsi   : Program untuk mendefinisikan kelas KoleksiAnabul yang merupakan koleksi dari objek Anabul
 *  Pembuat     : Rajwaa Muflihul Aufaa
 *  NIM         : 24060123140189
 *  Tanggal     : 8 Mei 2025
 */

public class KoleksiAnabul {
    private Koleksi<Anabul> koleksi;
    
    public KoleksiAnabul() {
        koleksi = new Koleksi<>();
    }
    
    public void add(Anabul anabul) {
        koleksi.add(anabul);
    }
    
    public Anabul getAnabul(int index) {
        return koleksi.getIsi(index);
    }
    
    public int getSize() {
        return koleksi.getSize();
    }
    
    public void showAll() {
        System.out.println("/******************* KOLEKSI ANABUL *******************/");
        System.out.println("Jumlah anabul: " + koleksi.getSize());
        
        for (int i = 0; i < koleksi.getSize(); i++) {
            Anabul anabul = koleksi.getIsi(i);
            System.out.println("\nAnabul ke-" + (i + 1) + ":");
            System.out.println("Nama: " + anabul.getNama());
            anabul.Bersuara();
            anabul.Gerak();
        }
    }
}