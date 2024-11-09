
import java.util.Scanner;
class Buku {
    String judul;
    String penulis ;
    String tahun ;
    Buku next;
    public Buku(String judul, String penulis, String tahun) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahun = tahun;
        this.next = null;
    }
}
class CariBuku {
    private Buku head;
    public CariBuku() {
        head = null;
    }
    public void addBuku(String judul, String penulis, String tahun) {
        Buku newBuku = new Buku(judul, penulis, tahun);
        if (head == null) {
            head = newBuku;
        } else {
            Buku current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newBuku;
        }
        System.out.println("Buku berhasil ditambahkan!");
    }
    public void displayBuku() {
        if (head == null) {
            System.out.println("Daftar Buku kosong.");
            return;
        }
        System.out.println("Daftar Buku:");
        Buku current = head;
        int index = 1;
        while (current != null) {
            System.out.println(index + ". Judul: " + current.judul + " Penulis: " + current.penulis + " Tahun Terbit: " + current.tahun);
            current = current.next;
            index++;
        }
    }
    public void searchBuku(String name) {
        Buku current = head;
        while (current != null) {
            if (current.judul.equalsIgnoreCase(current.judul)) {

                System.out.println("Buku ditemukan!");
                System.out.println("Judul Buku: " + current.judul);
                System.out.println("Nomor Penulis: " + current.penulis);
                System.out.println("Tahun Terbit: " + current.tahun);
                return;
            }
            current = current.next;
        }
        System.out.println("Buku tidak ditemukan.");
    }
}
public class UAPperpustakaaan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CariBuku manager = new CariBuku();
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Lihat Daftar Buku");
            System.out.println("3. Cari Buku Berdasarkan Judul");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi:");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Masukkan judul buku: ");
                    String judul = scanner.nextLine();
                    System.out.print("Masukkan penulis buku: ");
                    String penulis = scanner.nextLine();
                    System.out.print("Masukkan tahun terbit: ");
                    String tahun = scanner.nextLine();
                    manager.addBuku(judul, penulis, tahun);
                    break;
                case 2:
                    manager.displayBuku();
                    break;
                case 3:
                    System.out.print("Masukkan judul buku yang dicari: ");
                    String searchName = scanner.nextLine();
                    manager.searchBuku(searchName);
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan Program Manajemen Perpustakaan!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak ada. Silakan coba lagi!");
            }
        }
    }
}