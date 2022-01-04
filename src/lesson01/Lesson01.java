/*
https://www.youtube.com/watch?v=VsVw5ow8Ynw&list=PL786bPIlqEjTN-Sy8uMLQ6s85qNxP1hAp&index=1
 */

package lesson01;

import javax.swing.*;
import java.awt.*;

public class Lesson01 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame() {
        };
//        jFrame.setFont(Font.getFont(Font.SERIF));       // for Windows (Cyrillic problem fix)
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(500, 300);
//        jFrame.setLocation(500,300);
        jFrame.setLocationRelativeTo(null);
//        Toolkit toolkit = Toolkit.getDefaultToolkit();
//        Dimension dimension = toolkit.getScreenSize();
//        jFrame.setBounds((dimension.width - 500) / 2, (dimension.height - 300) / 2, 500, 300);
        jFrame.setTitle("Приложение");


    }
}
