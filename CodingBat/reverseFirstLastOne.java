package CodingBat;

public class reverseFirstLastOne {
    public static void main(String[] args) {
        System.out.println(reverseFirstLast("xyz"));
    }

    private static String reverseFirstLast(String str) {
        String front;

        if (str.length() >= 3) {
            front = str.substring(0, 3);
        } else {
            front = str;
        }

        return front + front + front;
    }
}
