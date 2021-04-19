public class ElseIf {
    public static void main(String[] args) {
        int nilai = 30;

        if(nilai >= 80){
            System.out.println("Nilai Anda : A");
        } else if (nilai >= 70){
            System.out.println("Nilai Anda : B");
        }else if(nilai >= 60){
            System.out.println("Nilai Anda : C");
        }else if (nilai >= 50){
            System.out.println("Nilai Anda : D");
        }else {
            System.out.println("nilai anda : E");
        }
    }
}
