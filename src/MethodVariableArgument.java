public class MethodVariableArgument {
    public static void main(String[] args) {
        sayCongrats("Hury", 80, 80, 90, 70, 90);
    }

    static void sayCongrats(String name, int... values) {
        var total = 0;
        for (var value: values) {
            total += value;
        }

        var finalValue = total / values.length;

        if (finalValue >= 75) {
            System.out.println(name + " Selamat Anda Lulus");
        } else {
            System.out.println(name + " Maaf Anda Tidak Lulus");
        }
    }
}
