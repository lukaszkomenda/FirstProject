package CodingBat;

public class removeLetters {
    public static void main(String[] args) {
        System.out.println(removeLetter("xyz", 0));
    }

    private static String removeLetter(String str, int n) {

        return str.substring(0,n) + str.substring(n+1);
    }


}
