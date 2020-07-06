package CodingBat;

public class oddText {
    public static void main(String[] args) {
        System.out.println(oddTextMethod("xyz"));
    }

    private static String oddTextMethod(String str) {
        String strNew = "";
        char[] strArray = str.toCharArray();

        for (int i = 0; i < strArray.length; i++) {
            if (i % 2 == 0){
                strNew += strArray[i];
            }
        }
        return strNew;
    }
}
