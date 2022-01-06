/*
https://www.youtube.com/watch?v=YjD90CJBWTo&list=PL786bPIlqEjTN-Sy8uMLQ6s85qNxP1hAp&index=21
Focus
 */

package lesson21_Focus;

import javax.swing.*;
import java.awt.*;

public class Lesson21 {

    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();

    public static void main(String[] args) {
        jFrame.add(jPanel);

        jPanel.add(new JButton("КНОПКА 1"));
        jPanel.add(new JButton("КНОПКА 2")).requestFocusInWindow();
        jPanel.add(new JButton("КНОПКА 3")).setFocusable(false);


        jFrame.revalidate();
    }


    private static JFrame getFrame() {
        JFrame jFrame = new JFrame() {
        };
        jFrame.setFont(Font.getFont(Font.SERIF));       // for Windows (Cyrillic problem fix)
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(700, 500);
        jFrame.setLocationRelativeTo(null);
        jFrame.setTitle("Приложение 20. Focus");

        return jFrame;
    }


}


