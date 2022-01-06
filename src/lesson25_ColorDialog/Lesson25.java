/*
https://www.youtube.com/watch?v=YjD90CJBWTo&list=PL786bPIlqEjTN-Sy8uMLQ6s85qNxP1hAp&index=25
Color Dialog
 */

package lesson25_ColorDialog;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class Lesson25 {

    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();

    public static void main(String[] args) {
        jFrame.add(jPanel);

        JButton b1 = new JButton("Показать Color Dialog");
        jPanel.add(b1);
        b1.addActionListener(e -> {
            Color color = JColorChooser.showDialog(jPanel, "Своё название", Color.magenta);
            jPanel.setBackground(color);
        });


        jFrame.revalidate();
    }


    private static JFrame getFrame() {
        JFrame jFrame = new JFrame() {
        };
//        jFrame.setFont(Font.getFont(Font.SERIF));       // for Windows (Cyrillic problem fix)
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(700, 500);
        jFrame.setLocationRelativeTo(null);
        jFrame.setTitle("Приложение 25. Color Dialog");

        return jFrame;
    }


}


