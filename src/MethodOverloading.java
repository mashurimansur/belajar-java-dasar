public class MethodOverloading {
    public static void main(String[] args) {
        //adalah kemampuan membuat method dengan name yang sama berkali kali, asalkan parameternya berbeda
        // kalau sama maka akan terjadi error
    }

    static void sayHello() {
        System.out.println("Hello World");
    }

    static void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    static void sayHello(String firstName, String lastName) {
        System.out.println(firstName + " " + lastName);
    }
}
