/*
https://www.youtube.com/watch?v=TVDUomyZ2Dk&list=PL786bPIlqEjTN-Sy8uMLQ6s85qNxP1hAp&index=10
Текстовые поля JTextField, JPasswordField, JTextArea, ScrollPane
 */

package lesson10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Lesson10 {

    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();

    public static void main(String[] args) {

        jFrame.add(jPanel);

        jPanel.add(new JLabel("Это лэйбл"));
        jPanel.add(new JTextField("Текст по умолчанию", 20));
        jPanel.add(new JPasswordField(10));

        JTextArea textArea = new JTextArea(5, 20);
        textArea.setLineWrap(true);
        JScrollPane scrollPane = new JScrollPane(textArea);

        jPanel.add(scrollPane);


        jPanel.revalidate();


    }


    private static JFrame getFrame() {
        JFrame jFrame = new JFrame() {
        };
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(700, 500);
        jFrame.setLocationRelativeTo(null);
        jFrame.setTitle("Приложение 10");

        return jFrame;
    }

}


