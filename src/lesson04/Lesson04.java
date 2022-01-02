/*
https://www.youtube.com/watch?v=TVDUomyZ2Dk&list=PL786bPIlqEjTN-Sy8uMLQ6s85qNxP1hAp&index=4
 */

package lesson04;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.beans.EventHandler;

public class Lesson04 {
    public static void main(String[] args) {

        JFrame jFrame = getFrame();
        JPanel jPanel = new JPanel();
        jFrame.add(jPanel);
        JButton jButton = new JButton("КНОПКА");
        jPanel.add(jButton);
//        jButton.addActionListener(e -> jFrame.setTitle(((JButton)e.getSource()).getText()));
        jButton.addActionListener(EventHandler.create(ActionListener.class, jFrame, "title", "source.text"));
    }


    private static JFrame getFrame() {
        JFrame jFrame = new JFrame() {
        };
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(700, 500);
        jFrame.setLocationRelativeTo(null);
        jFrame.setTitle("Приложение 4");

        return jFrame;
    }

}


