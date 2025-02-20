/*  Nama File   : MTitik.java
 *  Deskripsi   : berisi atribut dan method dalam class Titik
 *  Pembuat     : Rajwaa Muflihul Aufaa
 *  NIM         : 24060123140189
 */

public class MTitik {
    public static void main (String[] args) {
        System.out.println("*****************************************************");
        System.out.println("*   Praktikum Pemrograman Berorientasi Objek E2     *");
        System.out.println("*          Oleh: Rajwaa Muflihul Aufaa              *");
        System.out.println("*          INITIALIZATION PROGRAM TITIK             *");
        System.out.println("*****************************************************");
        System.out.println("\n/******************* TITIK *******************/");
        Titik T1 = new Titik(3,4);
        System.out.println("Koordinat T1 adalah: ");
        T1.printTitik();
        Titik T2 = T1;
        System.out.println("Koordinat T2 adalah: ");
        T2.printTitik();
        Titik T3 = new Titik(5,-7);
        System.out.println("Koordinat T3 adalah: ");
        T3.printTitik();

        System.out.println("\n/******************* GET ABSIS *******************/");
        double x =T1.getAbsis();
        System.out.println("Nilai absis T1 adalah: "+ x);

        System.out.println("\n/******************* GET ORDINAT *******************/");
        double y =T1.getOrdinat();
        System.out.println("Nilai absis T1 adalah: "+ y);
        
        System.out.println("\n/******************* SET ABSIS *******************/");
        System.out.println("Koordinat awal T1: ");
        T1.printTitik();
        T1.setAbsis(-6);
        System.out.println("Koordinat T1 setelah set absis: ");
        System.out.println("Nilai ordinat T1: "+T1.getAbsis());

        System.out.println("\n/******************* SET ORDINAT *******************/");
        System.out.println("Koordinat awal T1: ");
        T1.printTitik();
        T1.setOrdinat(10);
        System.out.println("Koordinat T1 setelah set ordinat: ");
        System.out.println("Nilai ordinat T1: "+T1.getOrdinat());

        System.out.println("\n/******************* GESER *******************/");
        T1.geser(3,4);
        System.out.println("Koordinat T1 setelah digeser adalah: ");
        T1.printTitik();

        System.out.println("\n/******************* NUMBER OF POINTS *******************/");
        int counterTitik = Titik.getCounterTitik();
        System.out.println("Jumlah titik pada T1 ada: " + counterTitik);

        System.out.println("\n/******************* GET KUADRAN *******************/");
        System.out.println("T1 berada di kuadran: " + T1.getKuadran());
        System.out.println("T2 berada di kuadran: " + T2.getKuadran());
        System.out.println("T3 berada di kuadran: " + T3.getKuadran());

        System.out.println("\n/******************* GET JARAK PUSAT *******************/");
        System.out.println("Jarak pusat T3: " + T3.getJarakPusat());

        System.out.println("\n/******************* GET JARAK *******************/");
        System.out.println("Jarak T2 dan T3: " + T2.getJarak(T3));

        System.out.println("\n/******************* REFLEKSI X *******************/");
        T3.refleksiX();
        System.out.println("T3 setelah refleksi X: ");
        T3.printTitik();

        System.out.println("\n/******************* REFLEKSI Y *******************/");
        T3.refleksiY();
        System.out.println("T3 setelah refleksi Y: ");
        T3.printTitik();

        System.out.println("\n/******************* GET REFLEKSI X *******************/");
        Titik T_refleksi1 = T1.getRefleksiX();
        System.out.println("T1 setelah refleksi terhadap sumbu X:");
        T_refleksi1.printTitik();

        System.out.println("\n/******************* GET REFLEKSI Y *******************/");
        Titik T_refleksi2 = T1.getRefleksiY();
        System.out.println("T1 setelah refleksi terhadap sumbu Y:");
        T_refleksi2.printTitik();

        System.out.println("\n/******************* END PROGRAM TITIK *******************/");
    }
}