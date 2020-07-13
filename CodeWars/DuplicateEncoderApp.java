package CodeWars;

public class DuplicateEncoder {
    public static void main(String[] args) {
        System.out.println(DuplicateEncoderMethod("xyzx"));

        /*
        The goal of this exercise is to convert a string
        to a new string where each character in the new
        string is "(" if that character appears only once
        in the original string, or ")" if that character
        appears more than once in the original string.
        Ignore capitalization when determining if a character
        is a duplicate.
         */
    }

    public static String DuplicateEncoderMethod(String word) {
        char[] array = word.toCharArray();
        char sign = 'a';
        int counter = 0;
        String text = "";

        for (int i = 0; i < array.length; i++) {
            sign = array[i];

            for (int j = 0; j < array.length; j++) {
                if (sign == array[j]){
                    counter++;
                }
            }

            if (counter % 2 == 0){
                text += ")";
            } else {
                text += "(";
            }
            counter = 0;
        }
        return text;
    }


}
