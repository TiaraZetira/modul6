import universitas.mahasiswa;
import universitas.manajemenMhs;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        manajemenMhs manajemen = new manajemenMhs();
        int pilihan;

        do {
            System.out.println("=== MENU ===");
            System.out.println("1. Tambah mahasiswa");
            System.out.println("2. Tampilkan Semua mahasiswa");
            System.out.println("3. Tampilkan mahasiswa dengan IPK Tertinggi");
            System.out.println("4. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("Masukkan IPK   : ");
                    double ipk = sc.nextDouble();
                    sc.nextLine(); 
                    mahasiswa mhs = new mahasiswa(nim, nama, prodi, ipk);
                    manajemen.tambahMahasiswa(mhs);
                    break;
                case 2:
                    manajemen.tampilkanSemua();
                    break;
                case 3:
                    manajemen.tampilkanIPKTertinggi();
                    break;
                case 4:
                    System.out.println("Keluar dari program...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 4);

        sc.close();
    }
}
