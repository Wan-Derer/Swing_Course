/*
https://www.youtube.com/watch?v=YjD90CJBWTo&list=PL786bPIlqEjTN-Sy8uMLQ6s85qNxP1hAp&index=22
Dialogs
 */

package lesson22_Dialogs;

import javax.swing.*;
import java.awt.*;

public class Lesson22 {

    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();

    public static void main(String[] args) {
        jFrame.add(jPanel);
        JButton b1 = new JButton("Показать сообщение");
        jPanel.add(b1);
        b1.addActionListener(e -> JOptionPane.showMessageDialog(
                jPanel, "Это сообщение", "Заголовок", JOptionPane.ERROR_MESSAGE
        ));


        JButton b2 = new JButton("Показать подтверждение");
        jPanel.add(b2);
        b2.addActionListener(e -> System.out.println(
                JOptionPane.showConfirmDialog(
                        jPanel, "Это подтверждение", "Заголовок", JOptionPane.YES_NO_CANCEL_OPTION
                )));

        JButton b3 = new JButton("Показать диалог выбора");
        jPanel.add(b3);
        b3.addActionListener(e -> System.out.println(
                JOptionPane.showOptionDialog(
                        jPanel, "Это диалог выбора", "Заголовок",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                        new Object[]{"Один", "Два", "Три"}, "Один"
                )));

        JButton b4 = new JButton("Показать диалог ввода 1");
        jPanel.add(b4);
        b4.addActionListener(e -> System.out.println(
                JOptionPane.showInputDialog(
                        jPanel, "Это диалог ввода","нач значение"
                )));

        JButton b5 = new JButton("Показать диалог ввода 2");
        jPanel.add(b5);
        b5.addActionListener(e -> System.out.println(
                JOptionPane.showInputDialog(
                        jPanel, "Это диалог ввода","Заголовок",JOptionPane.INFORMATION_MESSAGE,null,
                        new Object[]{"Один", "Два", "Три"}, "Два"
                )));


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
        jFrame.setTitle("Приложение 22. Dialogs");

        return jFrame;
    }


}


