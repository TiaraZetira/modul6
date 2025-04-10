package mahasiswa;

public class mahasiswa {
    private String nama;
    private String NIM;

    public mahasiswa(String nama, String NIM) {
        this.nama = nama;
        this.NIM = NIM;
    }

    public String getNama() {
        return nama;
    }

    public String getNIM() {
        return NIM;
    }
}