package SophisticatedPackage.basic;

import javax.swing.*;

public class objects {
    public static void main(String[] args) {
        int number = 5;

        //tworzenie obiektu graficznego
        JFrame window = new JFrame();

        //tworzenie okna
        window.setTitle("My window");
        window.setSize(800,600);
        window.setVisible(true);

        JLabel label = new JLabel();
        label.setText("My Label");

        window.add(label);

        String s = "hi";

    }
}
