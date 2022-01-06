/*
https://www.youtube.com/watch?v=YjD90CJBWTo&list=PL786bPIlqEjTN-Sy8uMLQ6s85qNxP1hAp&index=23
Custom Dialogs
 */

package lesson23_CustomDialogs;

import javax.swing.*;
import java.awt.*;

public class Lesson23 {

    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();

    public static void main(String[] args) {
        jFrame.add(jPanel);
        JButton b1 = new JButton("Показать диалог");
        jPanel.add(b1);
        b1.addActionListener(e -> {
                    MyDialog dialog = new MyDialog();
                    dialog.setVisible(true);
                }
        );


        jFrame.revalidate();
    }

    static class MyDialog extends JDialog {
        public MyDialog() {
            super(jFrame, "Заголовок", true);
            add(new JTextField(), BorderLayout.NORTH);
            add(new JButton("КНОПКА"), BorderLayout.SOUTH);
            setLocationRelativeTo(jFrame);
            setSize(250, 150);
        }
    }


    private static JFrame getFrame() {
        JFrame jFrame = new JFrame() {
        };
//        jFrame.setFont(Font.getFont(Font.SERIF));       // for Windows (Cyrillic problem fix)
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(700, 500);
        jFrame.setLocationRelativeTo(null);
        jFrame.setTitle("Приложение 23. Custom Dialogs");

        return jFrame;
    }


}


