/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihanTutorial;

/**
 *
 * @author bruhismyname/Rajwaa
 */

/*  Nama File   : TestSenjata.java
 *  Deskripsi   : Main class untuk kelas senjata package latihanTutorial
 *  Pembuat     : Rajwaa Muflihul Aufaa
 *  NIM         : 24060123140189
 *  Tanggal     : 1 Mei 2025
 */

public class TestSenjata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Senjata ak47 = new Senjata("TAR");
        Senjata m16 = new Senjata("DOR");
        
        System.out.print("AK47 Menembak 3x: "); ak47.menembak(3);
        System.out.print("M16 Menembak 1x: "); m16.menembak(1);
        
        System.out.println("AK47 Menusuk: " + ak47.menusuk());
        ak47.pasangBayonet();
        System.out.println("AK47 Menusuk: " + ak47.menusuk());
    }
}
