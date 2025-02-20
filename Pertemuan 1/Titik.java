/*  Nama File   : Titik.java
 *  Deskripsi   : berisi atribut dan method dalam class Titik
 *  Pembuat     : Rajwaa Muflihul Aufaa
 *  NIM         : 24060123140189
 *  Tanggal     : 21 Februari 2025
 */

public class Titik {
    // ATRIBUT
    double absis;
    double ordinat;
    static int counterTitik = 0;

    // METHOD
    // konstruktor untuk membuat dengan nilai absis dan ordinat tertentu
    Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    // konstruktor untuk membuat titk (0,0)
    Titik(){
        this.absis = 0;
        this.ordinat = 0;
    }
    // mengembalikan nilai counterTitik
    static int getCounterTitik(){
        return counterTitik;
    }
    //mengembalikan nilai absis
    double getAbsis(){
        return absis;
    }

    double getOrdinat(){
        return ordinat;
    }

    void setAbsis(double x){
        this.absis = x;
    }

    void setOrdinat(double y){
        this.ordinat = y;
    }

    void geser(double x, double y){
        this.absis = this.absis + x;
        this.ordinat = this.ordinat + y;
    }

    int getKuadran() {
        if (absis > 0 && ordinat > 0){
            return 1;
        } else if (absis < 0 && ordinat > 0) {
            return 2;
        } else if (absis > 0 && ordinat < 0) {
            return 3;
        } else if (absis < 0 && ordinat < 0) {
            return 4;
        } else {
            return 0;
        }
    }

    double getJarakPusat() {
        return Math.sqrt(absis * absis + ordinat * ordinat);
    }

    double getJarak(Titik T) {
        double deltaX = this.absis - T.absis;
        double deltaY = this.ordinat - T.ordinat;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    void refleksiX() {
        this.ordinat = -this.ordinat;
    }

    void refleksiY() {
        this.absis = -this.absis;
    }

    Titik getRefleksiX(){
        return new Titik(this.absis, -this.ordinat);
    }

    Titik getRefleksiY(){
        return new Titik(this.ordinat, -this.absis);
    }    
    
    // mencetak koordinat titik
    void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    void printCounterTitik(){
        System.out.println(this.counterTitik);
    }
}  //end class Titik
