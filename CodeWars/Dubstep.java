package CodeWars;

public class Dubstep {
    public static String SongDecoder(String song) {
        String text = "";
        String[] array = song.split("WUB");

        for (String s : array) {
            if (!s.isBlank()) {
                text += s + " ";
            }
        }
        return text.trim();

    }

}



