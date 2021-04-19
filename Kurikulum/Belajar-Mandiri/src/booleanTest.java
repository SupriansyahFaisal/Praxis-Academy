public class booleanTest {
    public static void main(String[] args) {
        var absen = 70;
        var nilaiAkhir = 80;

        boolean lulusabsen = absen >=75;
        boolean lulusNilaiAkhir = nilaiAkhir >=75;

        var lulus = lulusabsen && lulusNilaiAkhir;
        System.out.println(lulus);


    }
}
