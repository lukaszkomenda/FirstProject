package CodeWars;

public class SpinWords {
    public String spinWords(String sentence) {
        //TODO: Code stuff here

        String sentenceReoriented = "";

        String[] array = sentence.split(" ");

        int numberOfCharacters = array[0].length();

        if (array.length == 1 && numberOfCharacters >= 5) {
            StringBuilder sentenceReverse = new StringBuilder(array[0]);
            return sentenceReverse.reverse().toString();
        }

        for (int i = 0; i < array.length; i++) {

            StringBuilder sentenceReverse = new StringBuilder(array[i]);
            numberOfCharacters = array[i].length();

            if (numberOfCharacters < 5 && i != array.length - 1) {
                sentenceReoriented += array[i] + " ";
            } else if (numberOfCharacters >= 5 && i != array.length - 1) {
                sentenceReoriented += sentenceReverse.reverse().toString() + " ";
            } else if (numberOfCharacters < 5 && i == array.length - 1) {
                sentenceReoriented += array[i];
            } else {
                sentenceReoriented += sentenceReverse.reverse().toString();
            }
        }

        return sentenceReoriented;

    }
}
