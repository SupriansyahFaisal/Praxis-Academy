public class SwitchLamda {
    public static void main(String[] args) {
        var nilai = "A";

        switch (nilai){
            case"A" -> System.out.println("Anda Lulus Dengan Baik");
            case"B","C" -> System.out.println("Anda Lulus");
            case"D","E" -> System.out.println("Anda Tidak Lulus");
            default -> {
                System.out.println("Mungkin Anda Salah Jurusan");
            }
        }
    }
}
