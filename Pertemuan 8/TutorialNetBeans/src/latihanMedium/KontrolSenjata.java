/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanMedium;

/**
 *
 * @author bruhismyname/Rajwaa
 */

/*  Nama File   : KontrolSenjata.java
 *  Deskripsi   : Kelas KontrolSenjata package latihanMedium
 *  Pembuat     : Rajwaa Muflihul Aufaa
 *  NIM         : 24060123140189
 *  Tanggal     : 1 Mei 2025
 */
public class KontrolSenjata {
    private Senjata senjata;

    public KontrolSenjata(Senjata senjata) {
        this.senjata = senjata;
    }
    
    public boolean isAdaPeluru(){
        if (senjata.getPeluru() > 0){
            return true;
        } else {
            return false;
        }
    }
    
    public void isiPeluru(int jumPeluru) {
        senjata.setPeluru(senjata.getPeluru() + jumPeluru);
        System.out.println(">> Peluru Berhasil Ditambah: " + jumPeluru);
    }
    
    public void menembak(int jumlah) {
        System.out.println(">> Siap Menembak " + jumlah + " kali");
        if (isAdaPeluru()) {
            for (int i = jumlah; i > 0; i--) {
                if(isAdaPeluru()) {
                    System.out.println(senjata.getBunyi());
                    senjata.setPeluru(senjata.getPeluru() - 1);
                } else {
                    System.out.println("Gagal Tembak, Peluru Habis");
                }
            }
            System.out.println(">> Peluru Sisa: " + senjata.getPeluru());
        } else {
            System.out.println("Peluru Habis");
        }
    }
    
    public String menusuk() {
        if(senjata.isMenusuk()) {
            return "Jleb!";
        } else {
            return "Gagal, belum pasang bayonet";
        }
    }
    
    public void pasangBayonet() {
        senjata.setMenusuk(true);
        System.out.println("Bayonet Terpasang");
    }
}
