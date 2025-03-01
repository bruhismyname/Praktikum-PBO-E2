/*  Nama File   : MataKuliah.java
 *  Deskripsi   : berisi atribut dan method dalam class MataKuliah
 *  Pembuat     : Rajwaa Muflihul Aufaa
 *  NIM         : 24060123140189
 *  Tanggal     : 27 Februari 2025
 */

public class MataKuliah {
    // ATRIBUT
    private String idMatkul;
    private String Nama;
    private int SKS;

    // METHOD
    /// konstruktor default
    public MataKuliah() {
        this.idMatkul = "";
        this.Nama = "";
        this.SKS = 0;
    }

    // konstruktor dengan parameter
    public MataKuliah(String idMatkul, String Nama, int SKS) {
        this.idMatkul = idMatkul;
        this.Nama = Nama;
        this.SKS = SKS;
    }

    // Selector/getter methods
    public String getIdMatkul() {
        return this.idMatkul;
    }

    public String getNama() {
        return this.Nama;
    }

    public int getSKS() {
        return this.SKS;
    }
}