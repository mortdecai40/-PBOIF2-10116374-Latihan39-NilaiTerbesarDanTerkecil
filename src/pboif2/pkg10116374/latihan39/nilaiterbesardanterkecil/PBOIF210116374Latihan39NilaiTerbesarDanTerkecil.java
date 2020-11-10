package pboif2.pkg10116374.latihan39.nilaiterbesardanterkecil;
import java.util.Scanner;
/**
 * @author Acromyrmex
 * NAMA                 : TEUKU RIZKI NABIL
 * KELAS                : PBO2
 * NIM                  : 10116374
 * Deskripsi Program    : Program untuk menghitung nilai terbesar dan terkecil
 *
 */
public class PBOIF210116374Latihan39NilaiTerbesarDanTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        NilaiMahasiswa nilaiMhs = new NilaiMahasiswa();
        Petugas petugas = new Petugas();
        
        System.out.println("=====Program Nilai Terbesar dan Terkecil "
                + "Nilai Mahasiswa=====");
  
        // input petugas
        System.out.print("Masukkan Nama Petugas : ");
        petugas.setNama(scanner.next());
        
        // input banyak mahasiswa
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
        nilaiMhs.setJmlMahasiswa(scanner.nextInt());
        
        // input nilai per mahasiswa
        for(int i = 0; i < nilaiMhs.getJmlMahasiswa(); i++) {
            System.out.print("Masukkan Nilai Mahasiswa Ke-"+(i+1)+" = ");
            nilaiMhs.setNilai(scanner.nextInt());
        }
        
        nilaiMhs.tampilNilai();
        System.out.println("\nPetugas : " + petugas.getNama());
    }
    
}
