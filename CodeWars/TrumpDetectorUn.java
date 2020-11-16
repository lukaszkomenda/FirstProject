package CodeWars;


import java.util.stream.Collectors;

public class TrumpDetectorUn {
    public static double detect(String trumpySpeech) {

        return countRepititiveLetters(trumpySpeech) / countUnReptitiveLetters(trumpySpeech);
    }

    private static int countUnReptitiveLetters(String trumpySpeech) {


        return (int) trumpySpeech
                .chars()
                .distinct()
                .count();
    }

    private static int countRepititiveLetters(String trumpySpeech) {
        int counter = 0;

        for (int i = 0; i < trumpySpeech.length(); i++) {
            char letter = trumpySpeech.charAt(i);

            for (int j = 0; j < trumpySpeech.length(); j++) {
                if (letter == trumpySpeech.charAt(j)){
                    counter++;
                }
            }
        }
        return counter;


    }
}
