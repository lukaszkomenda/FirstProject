package CodeWars;

public class PigLatin {
    public static String pigIt(String str) {

        final String addLetters = "ay";
        final String emptySpace = " ";
        String[] sentenceArray = str.split(emptySpace);
        String strNew = "";

        for (String s : sentenceArray) {
            strNew = strNew + s.substring(1) + s.substring(0,1) + addLetters + emptySpace;
        }

        return strNew.trim();
    }
}
