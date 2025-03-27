/*  Nama File   : App.java
 *  Deskripsi   : Kelas App merupakan kelas utama yang berisi method main untuk menjalankan program.
 *  Pembuat     : Rajwaa Muflihul Aufaa
 *  NIM         : 24060123140189
 *  Tanggal     : 27 Maret 2025
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        System.out.println("*****************************************************");
        System.out.println("*   Praktikum Pemrograman Berorientasi Objek E2     *");
        System.out.println("*          Oleh: Rajwaa Muflihul Aufaa              *");
        System.out.println("*          INITIALIZATION PROGRAM FSM               *");
        System.out.println("*****************************************************\n");
        // membuat fakultas
        Faculty fsm = new Faculty("Fakultas Sains dan Matematika", 25000);
        System.out.println("/******************* " + fsm.getNamaFakultas() + " *******************/");
        System.out.println("Tarif Kebersihan Standar: Rp " + String.format("%,.2f", fsm.getTarifBiayaKebersihanStandar()) + " per m²");
        
        // membuat departemen
        Department deptMatematika = new Department("Departemen Matematika", "Prof. Dr. Matematika", 30000);
        Department deptFisika = new Department("Departemen Fisika", "Dr. Fisika, M.Sc.", 28000);
        Department deptKimia = new Department("Departemen Kimia", "Prof. Dr. Kimia", 27000);
        Department deptBiologi = new Department("Departemen Biologi", "Dr. Biologi", 26000);
        
        // membuat ruangan kelas
        // ruang kelas
        ClassRoom kelas1 = new ClassRoom("K001", 10, 8, 3, 40, 40, 2, fsm);
        ClassRoom kelas2 = new ClassRoom("K002", 12, 10, 3, 60, 60, 5, fsm);
        
        // lab komputer
        ComputerLab labKomputer1 = new ComputerLab("LK001", 15, 10, 3, 30, "Laboratorium Komputasi", 1500000, fsm, 30);
        ComputerLab labKomputer2 = new ComputerLab("LK002", 12, 8, 3, 25, "Laboratorium Pemrograman", 1200000, fsm, 25);
        
        // bukan lab komputer (lab fisika, kimia, biologi)
        List<String> mataKuliahFisika = Arrays.asList("Fisika Dasar", "Mekanika", "Termodinamika");
        NonComputerLab labFisika = new NonComputerLab("LF001", 12, 8, 3, 20, 
                                  "Laboratorium Fisika", 1000000, fsm, "Fisika", mataKuliahFisika);
        
        List<String> mataKuliahKimia = Arrays.asList("Kimia Dasar", "Kimia Organik", "Kimia Analitik");
        NonComputerLab labKimia = new NonComputerLab("LK003", 12, 8, 3, 20, 
                                 "Laboratorium Kimia", 1100000, fsm, "Kimia", mataKuliahKimia);
        
        List<String> mataKuliahBiologi = Arrays.asList("Biologi Sel", "Genetika", "Mikrobiologi");
        NonComputerLab labBiologi = new NonComputerLab("LB001", 14, 9, 3, 25, 
                                   "Laboratorium Biologi", 1050000, fsm, "Biologi", mataKuliahBiologi);
        
        // ruang departemen
        DepartmentRoom ruangDeptMat = new DepartmentRoom("DM001", 8, 6, 3, 15, 5, 20, 10, deptMatematika);
        DepartmentRoom ruangDeptFis = new DepartmentRoom("DF001", 8, 6, 3, 15, 6, 18, 8, deptFisika);
        
        // ruang dosen
        LecturerRoom ruangDosen1 = new LecturerRoom("RD001", 4, 3, 3, 2, "Dr. John Doe", 3, 2, deptMatematika);
        LecturerRoom ruangDosen2 = new LecturerRoom("RD002", 4, 3, 3, 2, "Dr. Jane Smith", 4, 2, deptFisika);
        LecturerRoom ruangDosen3 = new LecturerRoom("RD003", 4, 3, 3, 2, "Prof. Alice Johnson", 3, 2, deptKimia);
        
        // tambahkan ruangan ke fakultas
        fsm.tambahRuang(kelas1);
        fsm.tambahRuang(kelas2);
        fsm.tambahRuang(labKomputer1);
        fsm.tambahRuang(labKomputer2);
        fsm.tambahRuang(labFisika);
        fsm.tambahRuang(labKimia);
        fsm.tambahRuang(labBiologi);
        fsm.tambahRuang(ruangDeptMat);
        fsm.tambahRuang(ruangDeptFis);
        fsm.tambahRuang(ruangDosen1);
        fsm.tambahRuang(ruangDosen2);
        fsm.tambahRuang(ruangDosen3);
        
        // tampilkan informasi ruangan
        System.out.println("\n/******************* INFORMASI RUANGAN *******************/");
        for (Room ruang : fsm.getDaftarRuang()) {
            System.out.println("\n-----------------------");
            ruang.tampilkanInfoRuangan();
        }
        
        // tampilkan biaya kebersihan
        System.out.println("\n/******************* TOTAL BIAYA KEBERSIHAN *******************/");
        System.out.println("Total Biaya Kebersihan: Rp " + String.format("%,.2f", fsm.hitungTotalBiayaKebersihan()));
        
        // tampilkan jumlah ruangan per jenis
        System.out.println("\n/******************* JUMLAH RUANGAN PER JENIS *******************/");
        Map<String, Integer> totalRuangPerJenis = fsm.getTotalRuangPerJenis();
        for (Map.Entry<String, Integer> entry : totalRuangPerJenis.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        // tampilkan biaya kebersihan per jenis ruangan
        System.out.println("\n/******************* BREAKDOWN BIAYA KEBERSIHAN PER JENIS RUANGAN *******************/");
        Map<String, Double> biayaPerJenis = new HashMap<>();
        
        for (Room ruang : fsm.getDaftarRuang()) {
            String jenisRuang = ruang.getClass().getSimpleName();
            double biaya = ruang.hitungBiayaKebersihan();
            biayaPerJenis.put(jenisRuang, biayaPerJenis.getOrDefault(jenisRuang, 0.0) + biaya);
        }
        
        for (Map.Entry<String, Double> entry : biayaPerJenis.entrySet()) {
            System.out.println(entry.getKey() + ": Rp " + String.format("%,.2f", entry.getValue()));
        }

        System.out.println("\n/******************* END PROGRAM FSM *******************/");
    }
}