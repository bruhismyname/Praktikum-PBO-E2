/*  Nama File   : Kendaraan.java
 *  Deskripsi   : berisi atribut dan method dalam class Kendaraan
 *  Pembuat     : Rajwaa Muflihul Aufaa
 *  NIM         : 24060123140189
 *  Tanggal     : 27 Februari 2025
 */

public class Kendaraan{
    // ATRIBUT
    private String noPlat;
    private String jenis;

    // METHOD
    // konstruktur default
    public Kendaraan(){
        this.noPlat = "";
        this.jenis = "";
    }

    // konstruktor dengan parameter
    public Kendaraan(String noPlat, String Jenis){
        this.noPlat = noPlat;
        this.jenis = Jenis;
    }

    // Selector/getter methods
    public String getNoPlat(){
        return this.noPlat;
    }

    public String getJenis(){
        return this.jenis;
    }

    public void setNoPlat(String noPlat){
        this.noPlat = noPlat;
    }

    public void setJenis(String jenis) {
        if (jenis.toLowerCase().equals("motor") || 
            jenis.toLowerCase().equals("mobil")) {
            this.jenis = jenis.toLowerCase();
        } else {
            throw new IllegalArgumentException("Jenis kendaraan harus 'motor' atau 'mobil'");
        }
    }
}