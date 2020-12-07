public class DoWhileLoop {
    public static void main(String[] args) {
        // do while itu selalu menampilkan datanya walaupun while nya tidak memenuhi
        var counter = 1;

        do {
            System.out.println("Perulangan " + counter);
            counter++;
        } while (counter <= 10);
    }
}
