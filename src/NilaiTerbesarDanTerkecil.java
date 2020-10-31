import java.util.Scanner;
/**
 *
 * @author
 * NAMA     : Arsy Opraza Akma
 * KELAS    : IF1
 * NIM      : 10119001
 * Deskripsi Program: Program ini mencari nilai terbesar dan terkecil
 * yang diinput user
 */

public class NilaiTerbesarDanTerkecil {
    public static void main(String[] args) {
        int i, jumlahMahasiswa;
        int[] nilaiMahasiswa;
        Scanner scanner;

        System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai Mahasiswa=====");
        System.out.print("Masukkan Nama Petugas : ");

        scanner = new Scanner(System.in);
        String namaPetugas = scanner.next();
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
        jumlahMahasiswa = scanner.nextInt();

        nilaiMahasiswa = new int[jumlahMahasiswa];

        for (i = 0; i < nilaiMahasiswa.length; i++) {
            System.out.print("Masukkan Nilai Mahasiswa Ke-" + (i + 1) + " : ");
            nilaiMahasiswa[i] = scanner.nextInt();
        }

        System.out.print("\n");
        System.out.println("=====Hasil Nilai Mahasiswa=====");
        for (i = 0; i < nilaiMahasiswa.length; i++) {
            System.out.println("Nilai Mahasiswa Ke-" + (i + 1) + " : " + nilaiMahasiswa[i]);
        }
        cariNilaiTerkecilDanTerbesar(nilaiMahasiswa);

        System.out.print("\n");
        System.out.println("Petugas " + " : " + namaPetugas);
    }

    public static void cariNilaiTerkecilDanTerbesar(int [] nilaiMahasiswa) {
        int max = nilaiMahasiswa[0];
        int min = nilaiMahasiswa[0];
        int i;

        for (i = 1; i < nilaiMahasiswa.length; i++) {
            if (max < nilaiMahasiswa[i]) {
                max = nilaiMahasiswa[i];
            } else if (min > nilaiMahasiswa[i]) {
                min = nilaiMahasiswa[i];
            }
        }
        System.out.print("\n");
        System.out.println("Nilai Terbesar adalah " + max);
        System.out.println("Nilai Terkecil adalah " + min);
    }
}
