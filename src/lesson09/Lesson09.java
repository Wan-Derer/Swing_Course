/*
https://www.youtube.com/watch?v=TVDUomyZ2Dk&list=PL786bPIlqEjTN-Sy8uMLQ6s85qNxP1hAp&index=9
MouseListener
 */

package lesson09;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Lesson09 {

    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();

    public static void main(String[] args) {

//        jFrame.add(jPanel);
//        jPanel.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mousePressed(MouseEvent e) {
//                super.mousePressed(e);
//                jPanel.setBackground(Color.cyan);
//            }
//            @Override
//            public void mouseReleased(MouseEvent e) {
//                super.mouseReleased(e);
//                jPanel.setBackground(Color.orange);
//            }
//        });

        JComponent jComponent = new MyComponent();
    jFrame.add(jComponent);
    jFrame.addMouseMotionListener(new MouseAdapter() {
        @Override
        public void mouseMoved(MouseEvent e) {
            super.mouseMoved(e);
            MyComponent.xCoord = e.getX();
            MyComponent.yCoord = e.getY();
            jComponent.repaint();
        }
    });


    }

    static class MyComponent extends JComponent{
        public static int xCoord;
        public static int yCoord;

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawString("Координаты: X = " + xCoord + ", Y = " + yCoord, xCoord, yCoord);
        }
    }


    private static JFrame getFrame() {
        JFrame jFrame = new JFrame() {
        };
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(700, 500);
        jFrame.setLocationRelativeTo(null);
        jFrame.setTitle("Приложение 9");

        return jFrame;
    }

}


