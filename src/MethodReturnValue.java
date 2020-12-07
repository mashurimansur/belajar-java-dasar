public class MethodReturnValue {
    public static void main(String[] args) {
        var result = sum(100, 100);
        System.out.println(result);

        var result2 = hitung(100, "+", 100);
        System.out.println(result2);
    }

    static  int sum(int value1, int value2) {
        var total = value1 + value2;
        return total;
    }

    static  int hitung(int value1, String operasi, int value2) {
        switch (operasi) {
            case "+":
                return value1 + value2;
            case "/":
                return value1 / value2;
            case "-":
                return value1 - value2;
            default:
                return 0;
        }
    }
}
