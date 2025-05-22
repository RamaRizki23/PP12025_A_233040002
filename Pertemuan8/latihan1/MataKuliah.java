package Pertemuan8.latihan1;

public class MataKuliah {
    String kode;
    String nama;
    int sks;

    public MataKuliah(String kode, String nama, int sks) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
    }

    public MataKuliah() {
        //TODO Auto-generated constructor stub
    }

    void display() {
        System.out.println("Kode: " + kode + ", Nama: " + nama + ", SKS: " + sks);
    }
}