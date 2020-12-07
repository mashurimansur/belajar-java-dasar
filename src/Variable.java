public class Variable {
    public static void main(String[] args) {
        String name;
        name = "Mashuri Mansur";

        Integer age = 23;
        String address = "Indonesia";

        System.out.println(name);
        System.out.println("Umur " + age);
        System.out.println(address);

        name = "Budi";
        System.out.println(name);

        // var digunakan saat kita tidak mau menyebut tipe datanya, maka dari itu datanya harus dimasukkan terlebih dahulu
        var location = "Makassar";
        System.out.println(location);

        // final itu sama dengan konstan di beberapa pemrograman lain, artinya datanya tidak bisa diubah apabila datanya sudah diset
        final String application = "Belajar Java Dasar";
        System.out.println(application);
    }
}
