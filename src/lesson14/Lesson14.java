/*
https://www.youtube.com/watch?v=TVDUomyZ2Dk&list=PL786bPIlqEjTN-Sy8uMLQ6s85qNxP1hAp&index=14
PopupMenu
 */

package lesson14;

import javax.swing.*;


public class Lesson14 {

    static final String OS = System.getProperty("os.name").toLowerCase().startsWith("mac") ? "MAC" : "WIN";

    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();


    public static void main(String[] args) {
        jFrame.add(jPanel);

        JPopupMenu popupMenu = new JPopupMenu();
        popupMenu.add(new JMenuItem("пункт 1"));
        popupMenu.add(new JMenuItem("пункт 2"));

        jPanel.setComponentPopupMenu(popupMenu);


    }


    private static JFrame getFrame() {
        JFrame jFrame = new JFrame() {
        };
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(700, 500);
        jFrame.setLocationRelativeTo(null);         // в центре экрана
        jFrame.setTitle("Приложение 14");

        return jFrame;
    }



}


