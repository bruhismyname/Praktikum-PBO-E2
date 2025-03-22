/*  Nama File   : Pengusaha.java
 *  Deskripsi   : Subclass dari Manusia dan mengimplementasi interface Pajak
 *  Pembuat     : Rajwaa Muflihul Aufaa
 *  NIM         : 24060123140189
 *  Tanggal     : 20 Maret 2025
 */

import java.util.Calendar;
import java.util.Date;

public class Pengusaha extends Manusia implements Pajak {
  private String npwp;
  private static int counterPengusaha = 0;

  public Pengusaha() {
    this.npwp = "Belum diisi";
    counterPengusaha++;
  }

  public Pengusaha(String nama, Date tgl_mulai_kerja, String alamat, double pendapatan, String npwp) {
    super(nama, tgl_mulai_kerja, alamat, pendapatan);
    this.npwp = npwp;
    counterPengusaha++;
  }

  @Override
  public double hitungPajak() {
    return 0.15 * getPendapatan(); 
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
    System.out.println("NPWP: " + npwp);
  }

  public String getNpwp() {
    return npwp;
  }

  public void setNpwp(String npwp) {
    this.npwp = npwp;
  }

  public static int getCounterPengusaha() {
    return counterPengusaha;
  }
}