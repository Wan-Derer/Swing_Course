/*
https://www.youtube.com/watch?v=TVDUomyZ2Dk&list=PL786bPIlqEjTN-Sy8uMLQ6s85qNxP1hAp&index=15
ToolBar
 */

package lesson15;

import javax.swing.*;


public class Lesson15 {

    static final String OS = System.getProperty("os.name").toLowerCase().startsWith("mac") ? "MAC" : "WIN";

    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();


    public static void main(String[] args) {
        jFrame.add(jPanel);

        JToolBar toolBar = new JToolBar("Имя тулбара");
        JButton b1 = new JButton("КН1");
        b1.setToolTipText("Подсказка");
        JButton b2 = new JButton("КН2");
        JButton b3 = new JButton("КН3");
        toolBar.add(b1);
        toolBar.add(b2);
        toolBar.addSeparator();
        toolBar.add(b3);

        jPanel.add(toolBar);


    }


    private static JFrame getFrame() {
        JFrame jFrame = new JFrame() {
        };
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(700, 500);
        jFrame.setLocationRelativeTo(null);         // в центре экрана
        jFrame.setTitle("Приложение 15");

        return jFrame;
    }



}


