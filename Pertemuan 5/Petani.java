/*  Nama File   : Petani.java
 *  Deskripsi   : Subclass dari Manusia dan mengimplementasi interface Pajak
 *  Pembuat     : Rajwaa Muflihul Aufaa
 *  NIM         : 24060123140189
 *  Tanggal     : 20 Maret 2025
 */

import java.util.Calendar;
import java.util.Date;

public class Petani extends Manusia implements Pajak {
  private String asal_daerah;
  private static int counterPetani = 0;

  public Petani() {
    this.asal_daerah = "Belum diisi";
    counterPetani++;
  }

  public Petani(String nama, Date tgl_mulai_kerja, String alamat, double pendapatan, String asal_daerah) {
    super(nama, tgl_mulai_kerja, alamat, pendapatan);
    this.asal_daerah = asal_daerah;
    counterPetani++;
  }

  @Override
  public double hitungPajak() {
    return 0; 
  }

  @Override
  protected int hitungMasaKerja() {
    Calendar now = Calendar.getInstance();
    Calendar start = Calendar.getInstance();
    start.setTime(getTglMulaiKerja());

    int years = now.get(Calendar.YEAR) - start.get(Calendar.YEAR);
    return years + 1;
  }

  @Override
  public void printInfo() {
    super.printInfo();
    System.out.println("Asal Daerah: " + asal_daerah);
  }

  public String getAsalDaerah() {
    return asal_daerah;
  }

  public void setAsalDaerah(String asal) {
    this.asal_daerah = asal;
  }

  public static int getCounterPetani() {
    return counterPetani;
  }
}