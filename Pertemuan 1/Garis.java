/*  Nama File   : Garis.java
 *  Deskripsi   : berisi atribut dan method dalam class Garis
 *  Pembuat     : Rajwaa Muflihul Aufaa
 *  NIM         : 24060123140189
 *  Tanggal     : 21 Februari 2025
 */

class Garis {
    // ATRIBUT
    private Titik titikAwal;
    private Titik titikAkhir;
    private static int counterGaris = 0;

    // KONSTRUKTOR
    public Garis() {
        this.titikAwal = new Titik(0, 0);
        this.titikAkhir = new Titik(1, 1);
        counterGaris++;
    }

    public Garis(Titik titikAwal, Titik titikAkhir) {
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        counterGaris++;
    }

    // GETTER & SETTER
    public Titik getTitikAwal() {
        return titikAwal;
    }

    public Titik getTitikAkhir() {
        return titikAkhir;
    }

    public void setTitikAwal(Titik titikAwal) {
        this.titikAwal = titikAwal;
    }

    public void setTitikAkhir(Titik titikAkhir) {
        this.titikAkhir = titikAkhir;
    }

    public static int getCounterGaris() {
        return counterGaris;
    }

    // METHOD
    public double getPanjang() {
        return titikAwal.getJarak(titikAkhir);
    }

    public double getGradien() {
        double deltaX = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double deltaY = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        if (deltaX == 0) {
            throw new ArithmeticException("Gradien tak terdefinisi (garis vertikal)");
        }
        return deltaY / deltaX;
    }

    public Titik getTitikTengah() {
        double midX = (titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2;
        double midY = (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2;
        return new Titik(midX, midY);
    }

    public boolean isSejajar(Garis g) {
        return this.getGradien() == g.getGradien();
    }

    public boolean isTegakLurus(Garis g) {
        return this.getGradien() * g.getGradien() == -1;
    }

    public void printGaris() {
        System.out.println("Garis dari Titik " + titikAwal.getAbsis() + ", " + titikAwal.getOrdinat() +
                " ke Titik " + titikAkhir.getAbsis() + ", " + titikAkhir.getOrdinat());
    }

    public String getPersamaanGaris() {
        double m = getGradien();
        double c = titikAwal.getOrdinat() - m * titikAwal.getAbsis();
        return "y = " + m + "x + " + c;
    }
}
