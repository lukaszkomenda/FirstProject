package Overriding;

import javax.swing.*;
import java.awt.*;

public class Drawing extends JFrame {
    // tworzenie obiektu granicznego
    public static void main(String[] args) {
        new Drawing();
    }

    // ustawianie parametru obiektu
    public Drawing(){
        setSize(500,500);
        setVisible(true);
    }
    public void paint(Graphics g){
        //super.paint(g);
        // tworzenie elementów w obiektu
        g.drawRect(50,50,100,25);
        //g.setColor(new Color(0,0,225));
        g.drawOval(200,50,50,50);
        g.setColor(Color.GREEN);
        g.fillRect(50,200,100,25);
        g.drawString("My String",200,200);
    }
}
