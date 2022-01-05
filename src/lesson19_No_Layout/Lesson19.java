/*
https://www.youtube.com/watch?v=YjD90CJBWTo&list=PL786bPIlqEjTN-Sy8uMLQ6s85qNxP1hAp&index=19
No Layout
 */

package lesson19_No_Layout;

import javax.swing.*;
import java.awt.*;

public class Lesson19 {

    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();

    public static void main(String[] args) {
        jPanel.setLayout(null);
        jFrame.add(jPanel);

        JButton b1 = new JButton("КНОПКА 1");
        b1.setBounds(10, 10, 100, 100);
        jPanel.add(b1);

        JButton b2 = new JButton("КНОПКА 2");
        b2.setBounds(110, 110, 100, 100);
        jPanel.add(b2);


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
        jFrame.setTitle("Приложение 19. No Layout");

        return jFrame;
    }


}


