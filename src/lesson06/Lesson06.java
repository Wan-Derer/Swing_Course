/*
https://www.youtube.com/watch?v=TVDUomyZ2Dk&list=PL786bPIlqEjTN-Sy8uMLQ6s85qNxP1hAp&index=6
WindowListener
 */

package lesson06;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.beans.EventHandler;

public class Lesson06 {
    public static void main(String[] args) {

        JFrame jFrame = getFrame();

//        jFrame.addWindowListener(new WindowListener() { }); // переопределить все методы для окна

        jFrame.addWindowListener(new WindowAdapter() {   // переопределить отдельные методы для окна
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("windowClosing");
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
        jFrame.setTitle("Приложение 6");

        return jFrame;
    }

}


