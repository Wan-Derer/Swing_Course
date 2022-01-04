/*
https://www.youtube.com/watch?v=TVDUomyZ2Dk&list=PL786bPIlqEjTN-Sy8uMLQ6s85qNxP1hAp&index=3
 */

package lesson03;

import javax.swing.*;
import java.awt.*;

public class Lesson03 {
    public static void main(String[] args) {

        JFrame jFrame = getFrame();
        JPanel jPanel = new JPanel();
        jFrame.add(jPanel);
        JButton jButton = new JButton("КНОПКА");
        jPanel.add(jButton);
        jButton.addActionListener(e -> jPanel.setBackground(Color.cyan));

    }


    private static JFrame getFrame() {
        JFrame jFrame = new JFrame() {
        };
//        jFrame.setFont(Font.getFont(Font.SERIF));       // for Windows (Cyrillic problem fix)
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(700, 500);
        jFrame.setLocationRelativeTo(null);
        jFrame.setTitle("Приложение 3");

        return jFrame;
    }

}


