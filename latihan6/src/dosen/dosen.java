package dosen;

public class dosen {
    private String nama;
    private String NIDN;

    public dosen(String nama, String NIDN) {
        this.nama = nama;
        this.NIDN = NIDN;
    }

    public String getNama() {
        return nama;
    }

    public String getNIDN() {
        return NIDN;
    }
}