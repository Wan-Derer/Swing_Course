/*
https://www.youtube.com/watch?v=TVDUomyZ2Dk&list=PL786bPIlqEjTN-Sy8uMLQ6s85qNxP1hAp&index=8
KeyStroke
 */

package lesson08;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Lesson08 {

    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();

    public static void main(String[] args) {
        jFrame.add(jPanel);
        JButton jButton = new JButton("КНОПКА");
        jPanel.add(jButton);
        AbstractAction action = new MyAction();
        jButton.addActionListener(action);

        KeyStroke keyStroke = KeyStroke.getKeyStroke("ctrl B");
        InputMap inputMap = jPanel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        inputMap.put(keyStroke, "changeColor");
        ActionMap actionMap = jPanel.getActionMap();
        actionMap.put("changeColor", action);

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
        jFrame.setTitle("Приложение 8");

        return jFrame;
    }

}


