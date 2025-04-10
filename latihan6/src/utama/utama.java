package utama;

import dosen.dosen;
import mahasiswa.mahasiswa;
import matakuliah.matakuliah;

import java.util.ArrayList;

public class utama {
    public static void main(String[] args) {
        // dosen
        dosen cahya = new dosen("Ardya", "D2007");
        dosen budi = new dosen("Viesto", "L2005");

        // mahasiswa
        mahasiswa tiara = new mahasiswa("Tiara", "M001");
        mahasiswa diana = new mahasiswa("Diana", "M002");

        // Mata Kuliah 1 - PBO
        matakuliah pbo = new matakuliah("PBO", "123");
        ArrayList<dosen> pengampuPBO = new ArrayList<>();
        pengampuPBO.add(cahya);
        pbo.setPengampu(pengampuPBO);
        ArrayList<mahasiswa> mhsPBO = new ArrayList<>();
        mhsPBO.add(tiara);
        mhsPBO.add(diana);
        pbo.setDaftarmahasiswa(mhsPBO);

        // Mata Kuliah 2 - Kompar
        matakuliah kompar = new matakuliah("Kompar", "124");
        ArrayList<dosen> pengampuKompar = new ArrayList<>();
        pengampuKompar.add(budi);
        kompar.setPengampu(pengampuKompar);
        ArrayList<mahasiswa> mhsKompar = new ArrayList<>();
        mhsKompar.add(tiara);
        mhsKompar.add(diana);
        kompar.setDaftarmahasiswa(mhsKompar);

        // Mata Kuliah 3 - Methnum
        matakuliah methnum = new matakuliah("Methnum", "125");
        ArrayList<dosen> pengampuMethnum = new ArrayList<>();
        pengampuMethnum.add(budi);
        methnum.setPengampu(pengampuMethnum);
        ArrayList<mahasiswa> mhsMethnum = new ArrayList<>();
        mhsMethnum.add(tiara);
        methnum.setDaftarmahasiswa(mhsMethnum);

        // Tampilkan data
        tampilkanData(pbo);
        tampilkanData(kompar);
        tampilkanData(methnum);
    }

    public static void tampilkanData(matakuliah matakuliah) {
        System.out.println("Mata Kuliah  : " + matakuliah.getNama());
        System.out.println("Kode MK      : " + matakuliah.getKodeMK());

        System.out.print("Pengampu     : ");
        for (dosen d : matakuliah.getPengampu()) {
            System.out.print(d.getNama() + " ");
        }
        System.out.println();

        System.out.print("mahasiswa    : ");
        for (mahasiswa m : matakuliah.getDaftarmahasiswa()) {
            System.out.print(m.getNama() + " ");
        }
        System.out.println("\n-------------------------------");
    }
}
