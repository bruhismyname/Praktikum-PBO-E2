/*  Nama File   : PNS.java
 *  Deskripsi   : Subclass dari Manusia dan mengimplementasi interface Pajak
 *  Pembuat     : Rajwaa Muflihul Aufaa
 *  NIM         : 24060123140189
 *  Tanggal     : 20 Maret 2025
 */

import java.util.Calendar;
import java.util.Date;

public class PNS extends Manusia implements Pajak {
  private String nip;
  private static int counterPns = 0;

  public PNS() {
    this.nip = "Belum diisi";
    counterPns++;
  }

  public PNS(String nama, Date tgl_mulai_kerja, String alamat, double pendapatan, String nip) {
    super(nama, tgl_mulai_kerja, alamat, pendapatan);
    this.nip = nip;
    counterPns++;
  }

  public PNS(String nama, Date tgl_mulai_kerja, double pendapatan, String nip) {
    super(nama, tgl_mulai_kerja, "Belum diisi", pendapatan);
    this.nip = nip;
    counterPns++;
  }

  @Override
  public double hitungPajak() {
    return 0.10 * getPendapatan(); 
  }

  @Override
  protected int hitungMasaKerja() {
    Calendar now = Calendar.getInstance();
    Calendar start = Calendar.getInstance();
    start.setTime(getTglMulaiKerja());

    int years = now.get(Calendar.YEAR) - start.get(Calendar.YEAR);
    return years + 5;
  }

  @Override
  public void printInfo() {
    super.printInfo();
    System.out.println("NIP: " + nip);
  }

  public String getNip() {
    return nip;
  }

  public void setNip(String nip) {
    this.nip = nip;
  }

  public static int getCounterPNS() {
    return counterPns;
  }
}