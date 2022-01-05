/*
https://www.youtube.com/watch?v=YjD90CJBWTo&list=PL786bPIlqEjTN-Sy8uMLQ6s85qNxP1hAp&index=17
BorderGrid Layout
 */

package lesson17_BorderGridLayout;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class Lesson17 {

    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();

    public static void main(String[] args) {
        jFrame.setLayout(new BorderLayout());
//        jFrame.add(jPanel);

        JPanel panel1 = new JPanel();
        panel1.setBorder(new TitledBorder(" Панель 1 "));
        panel1.setLayout(new BorderLayout());
        jFrame.add(panel1);

        panel1.add(new JButton("КНОПКА 1"), BorderLayout.NORTH);
        panel1.add(new JButton("КНОПКА 2"), BorderLayout.SOUTH);
        panel1.add(new JButton("КНОПКА 3"), BorderLayout.WEST);
        panel1.add(new JButton("КНОПКА 4"), BorderLayout.EAST);
        panel1.add(new JButton("КНОПКА 5"), BorderLayout.CENTER);

        JPanel panel2 = new JPanel();
        panel2.setBorder(new TitledBorder(" Панель 2 "));
        panel2.setLayout(new GridLayout(2, 2));
        jFrame.add(panel2, BorderLayout.SOUTH);
        panel2.add(new JButton("Кнопка 1"));
        panel2.add(new JButton("Кнопка 2"));
        panel2.add(new JButton("Кнопка 3"));
        panel2.add(new JButton("Кнопка 4"));


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
        jFrame.setTitle("Приложение 17. BorderGrid Layout");

        return jFrame;
    }


}


