public class SwitchStatement {
    public static void main(String[] args) {
        var nilai = "B";

        switch (nilai) {
            case "A":
                System.out.println("Anda Lulus Dengan Baik");
                break;
            case "B":
            case "C":
                System.out.println("Anda Lulus");
                break;
            case "D":
                System.out.println("Nilai Anda Cukup Baik");
                break;
            default:
                System.out.println("Anda Tidak Lulus");
        }
        //switch lambda, lambda ini cuman bisa jalan di java 14 keatas
        switch (nilai) {
            case "A" -> System.out.println("Anda Lulus Dengan Baik");
            case "B", "C" -> System.out.println("Anda Lulus");
            case "D" -> System.out.println("Nilai Anda Cukup Baik");
            default -> System.out.println("Anda Tidak Lulus");
        }

        // switch tanpa yield
        String ucapan;
        switch (nilai) {
            case "A" -> ucapan = "Anda Lulus Dengan Baik";
            case "B", "C" -> ucapan ="Anda Lulus";
            case "D" -> ucapan = "Nilai Anda Cukup Baik";
            default -> ucapan = "Anda Tidak Lulus";
        }
        System.out.println(ucapan);

        //switch menggunakan yield
        ucapan = switch (nilai) {
            case "A":
                yield "Anda Lulus Dengan Baik";
            case "B", "C":
                yield "Anda Lulus";
            case "D":
                yield "Nilai Anda Cukup Baik";
            default:
                yield "Anda Tidak Lulus";
        };
        System.out.println(ucapan);
    }
}
