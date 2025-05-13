package pertemuan8;

public class Matakuliah {
    String kode;
    String nama;
    int sks;

    public Matakuliah(String kode, String nama, int sks) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
    }

    public void tampil() {
        System.out.println(kode + " - " + nama + " (" + sks + " SKS)");
    }
}
