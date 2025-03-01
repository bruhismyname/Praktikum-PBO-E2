/*  Nama File   : Mahasiswa.java
 *  Deskripsi   : berisi atribut dan method dalam class Mahasiswa
 *  Pembuat     : Rajwaa Muflihul Aufaa
 *  NIM         : 24060123140189
 *  Tanggal     : 27 Februari 2025
 */

import java.util.ArrayList;

public class Mahasiswa {
    // ATRIBUT
    private String NIM;
    private String Nama;
    private String Prodi;
    private ArrayList<MataKuliah> listMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    // METHOD
    // konstruktor default
    public Mahasiswa() {
        this.listMatkul = new ArrayList<MataKuliah>();
    }

    // konstruktor dengan parameter
    public Mahasiswa(String NIM, String Nama, String Prodi) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.Prodi = Prodi;
        this.listMatkul = new ArrayList<MataKuliah>();
    }

    // Selector/getter methods
    public String getNIM() {
        return this.NIM;
    }

    public String getNama() {
        return this.Nama;
    }

    public String getProdi() {
        return this.Prodi;
    }

    public Dosen getDosenWali() {
        return this.dosenWali;
    }

    public Kendaraan getKendaraan() {
        return this.kendaraan;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public void setProdi(String Prodi) {
        this.Prodi = Prodi;
    }

    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    public void tambahMatkul(MataKuliah mataKuliah) {
        if (this.listMatkul.size() < 50){
            this.listMatkul.add(mataKuliah);
        }
        else {
            System.out.println("List Mata Kuliah sudah penuh");
        }
    }

    public int getJumlahSKS(){
        int totalSKS = 0;
        for (MataKuliah mataKuliah : this.listMatkul) {
            totalSKS += mataKuliah.getSKS();
        }
        return totalSKS;
    }

    public int getJumlahMatkul(){
        return this.listMatkul.size();
    }

    public void printMhs(){
        System.out.println("Nama \t\t: "+ this.Nama);
        System.out.println("NIM \t\t: "+ this.NIM);
        System.out.println("Prodi \t\t: "+ this.Prodi);
    }

    public void printDetailMhs(){
        printMhs();
        System.out.println("Dosen Wali\t: " + this.dosenWali.getNama());
        System.out.println("NIP\t\t: " + this.dosenWali.getNIP());
        System.out.println("Prodi\t\t: " + this.dosenWali.getProdi());
        System.out.println("Kendaraan\t: " + this.kendaraan.getJenis());
        System.out.println("No Plat\t\t: " + this.kendaraan.getNoPlat());
        System.out.println("Jumlah MK\t: " + this.getJumlahMatkul());
        System.out.println("Total SKS\t: " + this.getJumlahSKS());
        System.out.println("Daftar Mata Kuliah");
        int i;
        for (i = 0; i < this.listMatkul.size(); i++) {
            System.out.println((i+1) + ". " + this.listMatkul.get(i).getNama() + " (" + this.listMatkul.get(i).getSKS() + " SKS)");
        }
    }
}