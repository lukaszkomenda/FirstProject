package CodeWars;

public class Dubstep {
    public static String SongDecoder(String song) {
        String text = "";
        String[] array = song.split("WUB");

        for (int i = 0; i < array.length; i++) {
            if (!array[i].isBlank()){
                text += array[i] + " ";
            }
        }
        return text.trim();

    }

}



