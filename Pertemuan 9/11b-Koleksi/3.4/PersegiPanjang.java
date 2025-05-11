/*  Nama File   : PersegiPanjang.java
 *  Deskripsi   : Program untuk mendefinisikan kelas PersegiPanjang yang merupakan turunan dari kelas BangunDatarGeneric
 *  Pembuat     : Rajwaa Muflihul Aufaa
 *  NIM         : 24060123140189
 *  Tanggal     : 8 Mei 2025
 */

class PersegiPanjang<T extends Number> extends BangunDatarGeneric<T> {
    private T panjang;
    private T lebar;
    
    public PersegiPanjang(T panjang, T lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    public T getPanjang() {
        return panjang;
    }
    
    public void setPanjang(T panjang) {
        this.panjang = panjang;
    }
    
    public T getLebar() {
        return lebar;
    }
    
    public void setLebar(T lebar) {
        this.lebar = lebar;
    }
    
    @Override
    public double hitungLuas() {
        return panjang.doubleValue() * lebar.doubleValue();
    }
    
    @Override
    public double hitungKeliling() {
        return 2 * (panjang.doubleValue() + lebar.doubleValue());
    }
    
    @Override
    public void display() {
        System.out.println("/******************* PERSEGI PANJANG *******************/");
        System.out.println("Panjang: " + panjang);
        System.out.println("Lebar: " + lebar);
        super.display();
    }
}