/*
https://www.youtube.com/watch?v=TVDUomyZ2Dk&list=PL786bPIlqEjTN-Sy8uMLQ6s85qNxP1hAp&index=5
LookAndFeel
 */

package lesson05;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.beans.EventHandler;
import java.util.Arrays;

public class Lesson05 {
    public static void main(String[] args) {

//        UIManager.LookAndFeelInfo[] lookAndFeelInfos = UIManager.getInstalledLookAndFeels();
//        for (UIManager.LookAndFeelInfo info:lookAndFeelInfos) {
//            System.out.println(info.getName());
//            System.out.println(info.getClassName());
//            System.out.println();
//        }

        JFrame jFrame = getFrame();
        JPanel jPanel = new JPanel();
        jFrame.add(jPanel);
        JButton b1 = new JButton("Metal");
        JButton b2 = new JButton("Nimbus");
        JButton b3 = new JButton("CDE/Motif");
        JButton b4 = new JButton("Mac OS X");

        jPanel.add(b1);
        jPanel.add(b2);
        jPanel.add(b3);
        jPanel.add(b4);

        b1.addActionListener(e -> {
            try {
                UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                ex.printStackTrace();
            }
        });

        b2.addActionListener(e -> {
            try {
                UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                ex.printStackTrace();
            }
        });

        b3.addActionListener(e -> {
            try {
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                ex.printStackTrace();
            }
        });

        b4.addActionListener(e -> {
            try {
                UIManager.setLookAndFeel("com.apple.laf.AquaLookAndFeel");
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                ex.printStackTrace();
            }
        });


    }


    private static JFrame getFrame() {
        JFrame jFrame = new JFrame() {
        };
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(700, 500);
        jFrame.setLocationRelativeTo(null);
        jFrame.setTitle("Приложение 5");

        return jFrame;
    }

}


