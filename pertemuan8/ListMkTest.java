package pertemuan8;

import java.util.Scanner;

public class ListMkTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListMk list = new ListMk();
        int pilih;

        do {
            System.out.println("\n=== MENU MATAKULIAH ===");
            System.out.println("1. Tambah Awal");
            System.out.println("2. Tambah Tengah");
            System.out.println("3. Tambah Akhir");
            System.out.println("4. Hapus Awal");
            System.out.println("5. Hapus Tengah");
            System.out.println("6. Hapus Akhir");
            System.out.println("7. Cari Matakuliah");
            System.out.println("8. Tampilkan Semua");
            System.out.println("9. Hitung Jumlah");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            pilih = sc.nextInt(); sc.nextLine();  // baca enter setelah angka

            switch (pilih) {
                case 1 -> list.addHead(inputMk(sc));
                case 2 -> {
                    System.out.print("Posisi: ");
                    int pos = sc.nextInt(); sc.nextLine();
                    list.addMiddle(inputMk(sc), pos);
                }
                case 3 -> list.addTail(inputMk(sc));
                case 4 -> list.removeHead();
                case 5 -> {
                    System.out.print("Posisi: ");
                    int pos = sc.nextInt(); sc.nextLine();
                    list.removeMiddle(pos);
                }
                case 6 -> list.removeTail();
                case 7 -> {
                    System.out.print("Kode MK: ");
                    String kode = sc.nextLine();
                    Matakuliah mk = list.find(kode);
                    if (mk != null) mk.tampil();
                    else System.out.println("Matakuliah tidak ditemukan.");
                }
                case 8 -> list.displayElement();
                case 9 -> System.out.println("Jumlah matakuliah: " + list.size());
            }
        } while (pilih != 0);

        sc.close();
    }

    static Matakuliah inputMk(Scanner sc) {
        System.out.print("Kode MK: ");
        String kode = sc.nextLine();
        System.out.print("Nama MK: ");
        String nama = sc.nextLine();
        System.out.print("SKS     : ");
        int sks = sc.nextInt(); sc.nextLine();
        return new Matakuliah(kode, nama, sks);
    }
}
