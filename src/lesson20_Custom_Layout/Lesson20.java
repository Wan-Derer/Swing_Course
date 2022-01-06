/*
https://www.youtube.com/watch?v=YjD90CJBWTo&list=PL786bPIlqEjTN-Sy8uMLQ6s85qNxP1hAp&index=20
Custom Layout
 */

package lesson20_Custom_Layout;

import javax.swing.*;
import java.awt.*;

public class Lesson20 {

    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();

    public static void main(String[] args) {
        jPanel.setLayout(new MyLayout());
        jFrame.add(jPanel);

        jPanel.add(new JButton("КНОПКА 1"));
        jPanel.add(new JButton("КНОПКА 2"));
        jPanel.add(new JButton("КНОПКА 3"));


        jFrame.revalidate();
    }

    private static class MyLayout implements LayoutManager {

        @Override
        public void addLayoutComponent(String name, Component comp) {

        }

        @Override
        public void removeLayoutComponent(Component comp) {

        }

        @Override
        public Dimension preferredLayoutSize(Container parent) {
            return null;
        }

        @Override
        public Dimension minimumLayoutSize(Container parent) {
            return null;
        }

        @Override
        public void layoutContainer(Container parent) {
            int qty = parent.getComponentCount();
            for (int i = 0; i < qty; i++) {
                Component c = parent.getComponent(i);
                c.setBounds(i * 100, i * 50, 100, 50);

            }
        }
    }

    private static JFrame getFrame() {
        JFrame jFrame = new JFrame() {
        };
        jFrame.setFont(Font.getFont(Font.SERIF));       // for Windows (Cyrillic problem fix)
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(700, 500);
        jFrame.setLocationRelativeTo(null);
        jFrame.setTitle("Приложение 19. No Layout");

        return jFrame;
    }


}


