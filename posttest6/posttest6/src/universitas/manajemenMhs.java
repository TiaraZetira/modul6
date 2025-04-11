package universitas;

import java.util.ArrayList;

public class manajemenMhs {
    private ArrayList<mahasiswa> daftarMahasiswa = new ArrayList<>();

    public void tambahMahasiswa(mahasiswa m) {
        daftarMahasiswa.add(m);
        System.out.println("Data berhasil ditambahkan!");
    }

    public void tampilkanSemua() {
        System.out.println("DAFTAR mahasiswa:");
        for (int i = 0; i < daftarMahasiswa.size(); i++) {
            mahasiswa m = daftarMahasiswa.get(i);
            m.tampilkanData();
        }
    }

    public void tampilkanIPKTertinggi() {
        if (daftarMahasiswa.isEmpty()) {
            System.out.println("Belum ada data mahasiswa.");
            return;
        }

        mahasiswa tertinggi = daftarMahasiswa.get(0);
        for (int i = 1; i < daftarMahasiswa.size(); i++) {
            mahasiswa m = daftarMahasiswa.get(i);
            if (m.getIpk() > tertinggi.getIpk()) {
                tertinggi = m;
            }
        }

        System.out.println("mahasiswa dengan IPK tertinggi:");
        tertinggi.tampilkanData();
    }
}
