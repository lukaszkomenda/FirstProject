package CodingBat;

public class textRepeatTimes {
    public static void main(String[] args) {
        System.out.println(multiplyText("Hi", 3));
    }

    private static String multiplyText(String str, int n) {
//        return str.repeat(n);
        String textNew = "";

        for(int i = 1; i <= n; i++) {
            textNew += str;
        }
        return textNew;
    }
}
