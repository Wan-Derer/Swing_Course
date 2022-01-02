/*
https://www.youtube.com/watch?v=TVDUomyZ2Dk&list=PL786bPIlqEjTN-Sy8uMLQ6s85qNxP1hAp&index=7
Actions
 */

package lesson07;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Lesson07 {

    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();

    public static void main(String[] args) {
        jFrame.add(jPanel);
        JButton jButton = new JButton("КНОПКА");
        jPanel.add(jButton);

        jButton.addActionListener(new MyAction());


    }

    static class MyAction extends AbstractAction {

        public MyAction() {
            putValue(AbstractAction.SHORT_DESCRIPTION, "Короткое описание");
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            jPanel.setBackground(Color.cyan);
        }
    }


    private static JFrame getFrame() {
        JFrame jFrame = new JFrame() {
        };
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(700, 500);
        jFrame.setLocationRelativeTo(null);
        jFrame.setTitle("Приложение 7");

        return jFrame;
    }

}


