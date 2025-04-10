package mataKuliah;

import java.util.ArrayList;
import dosen.dosen;
import mahasiswa.mahasiswa;

public class mataKuliah {
    private String nama;
    private String kodeMK;
    private ArrayList<dosen> pengampu;
    private ArrayList<mahasiswa> daftarmahasiswa;

    public mataKuliah(String nama, String kodeMK) {
        this.nama = nama;
        this.kodeMK = kodeMK;
        this.pengampu = new ArrayList<>();
        this.daftarmahasiswa = new ArrayList<>();
    }

    public void setPengampu(ArrayList<dosen> pengampu) {
        this.pengampu = pengampu;
    }

    public void setDaftarmahasiswa(ArrayList<mahasiswa> daftarmahasiswa) {
        this.daftarmahasiswa = daftarmahasiswa;
    }

    public String getNama() {
        return nama;
    }

    public String getKodeMK() {
        return kodeMK;
    }

    public ArrayList<dosen> getPengampu() {
        return pengampu;
    }

    public ArrayList<mahasiswa> getDaftarmahasiswa() {
        return daftarmahasiswa;
    }
}

