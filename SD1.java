import java.util.Scanner;

class Barang<N,H> {

    private N nama;
    private H harga;
    private JenisBarang jenis;

    public Barang(N nama, H harga, JenisBarang jenis) {
        this.nama = nama;
        this.harga = harga;
        this.jenis = jenis;
    }

    public N getNama() {
        return nama;
    }

    public H getHarga() {
        return harga;
    }

    public JenisBarang getJenis() {
        return jenis;
    }
}

enum JenisBarang {
    SANDANG, PANGAN, PAPAN
}

public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan Harga: ");
        int harga = input.nextInt();

        System.out.println("Pilih Jenis Barang:");
        System.out.println("0. SANDANG");
        System.out.println("1. PANGAN");
        System.out.println("2. PAPAN");

        System.out.print("Masukkan pilihan: ");
        int pilihan = input.nextInt();
        JenisBarang jenis = JenisBarang.values()[pilihan];

        Barang<String, Integer> barang = new Barang<>(nama, harga, jenis);

        System.out.println("\nInformasi Barang:");
        System.out.println("Nama: " + barang.getNama());
        System.out.println("Harga: " + barang.getHarga());
        System.out.println("Jenis: " + barang.getJenis());
    }
}