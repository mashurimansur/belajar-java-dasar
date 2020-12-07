public class MethodRecursive {
    public static void main(String[] args) {
        var result = factorialLoop(5);
        System.out.println(result);

        System.out.println(recursiveFactrial(10));

        //error tergantung dari device masing2
        loop(10000);
    }

    static int factorialLoop(int value) {
        var result = 1;
        for (var counter = 1; counter <= value; counter++) {
            result *= counter;
        }
        return result;
    }

    static int recursiveFactrial(int value) {
        if (value == 1) {
            return 1;
        } else {
            return value * recursiveFactrial(value - 1);
        }
    }

    //contoh coding yang membuat error stackoverflow
    static void loop(int value) {
        if (value == 0) {
            System.out.println("Selesai");
        } else {
            System.out.println("Loop " + value);
            loop(value - 1);
        }
    }
}
