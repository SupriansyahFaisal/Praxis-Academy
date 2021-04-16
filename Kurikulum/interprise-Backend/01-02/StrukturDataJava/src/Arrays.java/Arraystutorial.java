import java.util.ArrayList;

public class Arraystutorial {
    public static void list(String[] args) {
        ArrayList<String> kendaraan = new ArrayList<String>();
        System.out.println("Sebelum ditambah : ");
        System.out.println(kendaraan);
        System.out.println("Setelah ditambah : ");
        kendaraan.add("Kereta");
        kendaraan.add("Kapal");
        kendaraan.add("Mobil");
        kendaraan.add("Motor");
        kendaraan.add("Pesawat");
        System.out.println(kendaraan + "\n");
        System.out.println("Setelah di hapus : ");
        kendaraan.remove(2);
        System.out.println(kendaraan + "\n");
        System.out.println("Setelah di ubah : ");
        kendaraan.set(1, "kaki");
        System.out.println(kendaraan + "\n");

    }
}
