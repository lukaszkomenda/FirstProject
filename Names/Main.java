package Names;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static List<String> generateNames(){

        List<String> nameArray = new ArrayList<>();

        for (int i = 0; i < name.names.length; i++) {
            nameArray.add(name.names[i]);

        }

        return nameArray;
    }

    public static void main(String[] args) {
        System.out.println(generateNames());
    }
}
