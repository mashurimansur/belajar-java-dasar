public class ForEach {
    public static void main(String[] args) {
        String[] names = {
                "Mashuri", "Mansur", "Muna", "Jumardi"
        };

        for (var i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }

        //ini lebih simpel dibangding dengan yang diatas
        System.out.println("Ini Perulangan Menggunakan foreach");
        for (var name: names) {
            System.out.println(name);
        }
    }
}
