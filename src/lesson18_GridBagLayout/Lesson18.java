/*
https://www.youtube.com/watch?v=YjD90CJBWTo&list=PL786bPIlqEjTN-Sy8uMLQ6s85qNxP1hAp&index=18
GridBagLayout
 */

package lesson18_GridBagLayout;

import javax.swing.*;
import java.awt.*;

public class Lesson18 {

    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();

    public static void main(String[] args) {
        jPanel.setLayout(new GridBagLayout());
        jFrame.add(jPanel);

        GridBagConstraints constraints1 = new GridBagConstraints();
        constraints1.weightx = 0;   // 0 - занимает всё доступное поле
        constraints1.weighty = 0;
        constraints1.gridx = 0;
        constraints1.gridy = 0;
        constraints1.gridwidth = 2;
        constraints1.gridheight = 2;

        jPanel.add(new JTextArea(4,20), constraints1);

        GridBagConstraints constraints2 = new GridBagConstraints();
        constraints2.weightx = 0;
        constraints2.weighty = 0;
        constraints2.gridx = 2;
        constraints2.gridy = 0;
        constraints2.gridwidth = 2;
        constraints2.gridheight = 1;

        jPanel.add(new JButton("КНОПКА 1"), constraints2);

        GridBagConstraints constraints3 = new GridBagConstraints();
        constraints3.weightx = 0;
        constraints3.weighty = 0;
        constraints3.gridx = 2;
        constraints3.gridy = 1;
        constraints3.gridwidth = 1;
        constraints3.gridheight = 1;

        jPanel.add(new JButton("КНОПКА 2"), constraints3);

        GridBagConstraints constraints4 = new GridBagConstraints();
        constraints4.weightx = 0;
        constraints4.weighty = 0;
        constraints4.gridx = 3;
        constraints4.gridy = 1;
        constraints4.gridwidth = 1;
        constraints4.gridheight = 1;

        jPanel.add(new JButton("КНОПКА 3"), constraints4);





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
        jFrame.setTitle("Приложение 18. GridBagLayout");

        return jFrame;
    }


}


