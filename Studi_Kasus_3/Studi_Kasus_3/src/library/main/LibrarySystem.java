package library.main;

import library.model.Book;
import library.model.Member;

import java.util.ArrayList;
import java.util.Scanner;

public class LibrarySystem {
    private static ArrayList<Book> books = new ArrayList<>();
    private static ArrayList<Member> members = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("=== MENU PERPUSTAKAAN ===");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Tambah Anggota");
            System.out.println("3. Tampilkan Daftar Buku");
            System.out.println("4. Tampilkan Daftar Anggota");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Buat konsumsi newline

            switch (choice) {
                case 1:
                    tambahBuku();
                    break;
                case 2:
                    tambahAnggota();
                    break;
                case 3:
                    tampilkanDaftarBuku();
                    break;
                case 4:
                    tampilkanDaftarAnggota();
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan sistem.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (choice != 5);
    }

    private static void tambahBuku() {
        System.out.print("Masukkan Judul Buku: ");
        String title = scanner.nextLine();
        System.out.print("Masukkan Nama Penulis: ");
        String author = scanner.nextLine();
        System.out.print("Masukkan Tahun Terbit: ");
        int year = scanner.nextInt();
        scanner.nextLine(); // Konsumsi newline

        books.add(new Book(title, author, year));
        System.out.println("Buku berhasil ditambahkan!\n");
    }

    private static void tambahAnggota() {
        System.out.print("Masukkan Nama Anggota: ");
        String name = scanner.nextLine();
        System.out.print("Masukkan ID Anggota: ");
        String id = scanner.nextLine();

        members.add(new Member(name, id));
        System.out.println("Anggota berhasil ditambahkan!\n");
    }

    private static void tampilkanDaftarBuku() {
        System.out.println("=== DAFTAR BUKU ===");
        if (books.isEmpty()) {
            System.out.println("Belum ada buku yang terdaftar.");
        } else {
            for (Book book : books) {
                book.displayInfo();
            }
        }
    }

    private static void tampilkanDaftarAnggota() {
        System.out.println("=== DAFTAR ANGGOTA ===");
        if (members.isEmpty()) {
            System.out.println("Belum ada anggota yang terdaftar.");
        } else {
            for (Member member : members) {
                member.displayInfo();
            }
        }
    }
}
