/*
https://www.youtube.com/watch?v=YjD90CJBWTo&list=PL786bPIlqEjTN-Sy8uMLQ6s85qNxP1hAp&index=24
File Dialog
 */

package lesson24_FileDialog;

import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import java.awt.*;
import java.awt.event.ComponentListener;
import java.io.File;
import java.io.FilenameFilter;

import static javafx.application.ConditionalFeature.SWT;

public class Lesson24 {

    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();

    public static void main(String[] args) {
//        System.setProperty("apple.awt.fileDialogForDirectories", "true");
        jFrame.add(jPanel);

        JButton b1 = new JButton("Показать JFileChooser");
        jPanel.add(b1);
        b1.addActionListener(e -> {
                    JFileChooser fileChooser = new JFileChooser();
                    fileChooser.setDialogTitle("Своё название");
//                    fileChooser.showOpenDialog(jPanel);
//                    fileChooser.showSaveDialog(jPanel);
                    int pressed = fileChooser.showDialog(jPanel, "Своя кнопка");
                    System.out.println(pressed);

                    fileChooser.setCurrentDirectory(new File("/Users/Wanderer/Work/1"));    // не работает на Mac
                    fileChooser.setMultiSelectionEnabled(true);    // не работает на Mac
//                    fileChooser.setFileFilter(new FileFilter() {    // не работает на Mac
//                        @Override
//                        public boolean accept(File f) {
//                            return f.getName().endsWith(".png");
//                        }
//
//                        @Override
//                        public String getDescription() {
//                            return "PNG images";
//                        }
//                    });


                    fileChooser.add(new TextField("asdfghjkl;", 25));    // не работает на Mac

                    File file = fileChooser.getSelectedFile();      // на Mac возвращает null
                    System.out.println(file);

                }
        );


        JButton b2 = new JButton("Показать awt.FileDialog");
        jPanel.add(b2);
        b2.addActionListener(e -> {
                    FileDialog dialog = new FileDialog(jFrame, "Своё название");
//                    FileDialog dialog = new FileDialog(jFrame,"Своё название", FileDialog.SAVE);
//                    dialog.setTitle("Своё название");     // не работает на Mac
                    dialog.setDirectory("/Users/Wanderer/Work/1");
                    dialog.setMultipleMode(true);
                    dialog.setFilenameFilter((dir, name) -> name.endsWith(".png"));

                    JTextField textField = new JTextField("Текстовое поле");
                    dialog.add(textField, BorderLayout.NORTH);    // не работает на Mac
                    dialog.addPropertyChangeListener(evt -> textField.setText(evt.getPropertyName()));

                    dialog.setVisible(true);

                    System.out.println(dialog.getFile());

                }
        );

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
        jFrame.setTitle("Приложение 24. File Dialog");

        return jFrame;
    }


}


