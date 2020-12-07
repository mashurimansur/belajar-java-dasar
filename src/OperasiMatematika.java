public class OperasiMatematika {
    public static void main(String[] args) {
        int a = 100;
        int b = 10;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        //augmented assigment
        int c = 100;
        System.out.println(c += 10);
        System.out.println(c -= 10);
        System.out.println(c *= 10);
        System.out.println(c /= 10);
        System.out.println(c %= 10);

        //unary operator yaitu operator yang ditempatkan di depan variable
        int d = 50;
        d++;
        System.out.println(d);
        d--;
        System.out.println(d);

        System.out.println(-d);
        System.out.println(!true);
    }
}
