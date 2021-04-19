public class YieldKey {
    public static void main(String[] args) {
    var nilai = "A";
    String ucapan  = switch (nilai){
        case"A":
            yield "Anda lulus dengan baik";
        case "B","C":
            yield  "Anda lulus";
        case "D","E":
            yield "Anda tidak lulus";
        default:
            yield "Anda salah jurusan";
            };
        System.out.println(ucapan);
        }
    }

