public class TypeDataArray {
    public static void main(String[] args) {
        //array adalah tipe data yang beriskan kumpulan data degan tipe data yang sama
        String[] arrayString;
        arrayString = new String[2];
        arrayString[0] = "Mashuri";
        arrayString[1] = "Mansur";
        System.out.println(arrayString[0] + " " + arrayString[1]);

        //array initializer
        int[] intArray = new int[] {
                10, 90, 40, 20, 30
        };

        long[] arrayLong = {
                10, 90, 30, 10, 40L
        };

        String[] yourName = {
                "Mashuri", "Mansur"
        };

        System.out.println(yourName.length);

        //array di dalam array
        String[][] members = {
                {"Mashuri", "Mansur"},
                {"Jumardi", "Mansur"},
                {"Mansur", "Ramalang"},
                {"Muna"}
        };

        System.out.println(members[0][0]);
        System.out.println(members[0][1]);
        System.out.println(members[3][0]);


    }
}
