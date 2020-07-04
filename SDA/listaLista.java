package SDA;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class listaLista {
    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>();

        arrayList.add("kjda1kdlkal");
        arrayList.add("kjdak2dlkal");
        arrayList.add("kjdakd3lkal");
        arrayList.add("kjdak4dlkal");
        arrayList.add("kjdakd5lkal");
        arrayList.add("kjdakdl6kal");
        arrayList.set(3,"abc");

//        String s = arrayList.get(3);

        System.out.println(arrayList);


        addLinkedList();

        // a → b → c → d

//        linkedList.get(3);

    }

    private static void addLinkedList() {
        List<String> linkedList = new LinkedList<>();

        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        linkedList.add("d");
        linkedList.add("e");
    }
}
