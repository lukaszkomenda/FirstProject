package Inheritance;

import javax.swing.*;

public class MyWindow extends JFrame {
    // tworzenie obiektu graficznego
    public static void main(String[] args) {
        new MyWindow();
    }


    public MyWindow(){
        setSize(500,500);
        setVisible(true);
        setTitle("My window");
    }
}
