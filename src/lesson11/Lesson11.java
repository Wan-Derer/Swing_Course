/*
https://www.youtube.com/watch?v=TVDUomyZ2Dk&list=PL786bPIlqEjTN-Sy8uMLQ6s85qNxP1hAp&index=11
Компоненты выбора RadioButton, RadioGroup, ComponentBox, Border
 */

package lesson11;

import javax.swing.*;
import javax.swing.border.Border;

public class Lesson11 {

    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();

    public static void main(String[] args) {

        jFrame.add(jPanel);

        JCheckBox checkBox = new JCheckBox("Галка");
        checkBox.setSelected(true);
        jPanel.add(checkBox);

        JRadioButton radioButton1 = new JRadioButton("Адын");
        JRadioButton radioButton2 = new JRadioButton("Дыва");
        radioButton2.setSelected(true);
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);
        jPanel.add(radioButton1);
        jPanel.add(radioButton2);

        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.addItem("Один");
        comboBox.addItem("Два");
        comboBox.addItem("Три");
        comboBox.addItem("4");
        jPanel.add(comboBox);

        Border border = BorderFactory.createEtchedBorder();
        Border border2 = BorderFactory.createTitledBorder(border, "Тайтл");
        jPanel.setBorder(border2);

//        jPanel.revalidate();


    }


    private static JFrame getFrame() {
        JFrame jFrame = new JFrame() {
        };
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(700, 500);
        jFrame.setLocationRelativeTo(null);
        jFrame.setTitle("Приложение 11");

        return jFrame;
    }

}


