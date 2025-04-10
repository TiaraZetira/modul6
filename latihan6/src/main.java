class Contoh {
    String nama;
 
    Contoh(String nama) {
        this.nama = nama;
    }
    
    void tampilkan() {
        System.out.println("Nama: " + this.nama);
    }
}

public class Main {
    public static void main(String[] args) {
        Contoh[] objArray = { new Contoh("Objek 1"), new Contoh("Objek 2"), new Contoh("Objek 3") };
        
        for(Contoh obj : objArray) {
            obj.tampilkan();
        }
    }
}