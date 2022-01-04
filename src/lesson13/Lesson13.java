/*
https://www.youtube.com/watch?v=TVDUomyZ2Dk&list=PL786bPIlqEjTN-Sy8uMLQ6s85qNxP1hAp&index=13
Menu
 */

package lesson13;

import javax.swing.*;


public class Lesson13 {

    static final String OS = System.getProperty("os.name").toLowerCase().startsWith("mac") ? "MAC" : "WIN";

    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();


    public static void main(String[] args) {
//        jFrame.add(jPanel);

        // use unified menu bar
        System.setProperty("apple.laf.useScreenMenuBar", "true");
        // set menu bar title (не работает)
//        System.setProperty("com.apple.mrj.application.apple.menu.about.name", "Test");

        JMenuBar menuBar = new JMenuBar();


        JMenu fileMenu = new JMenu("Файл");
        JMenu editMenu = new JMenu("Правка");
        menuBar.add(fileMenu);
        menuBar.add(editMenu);

        fileMenu.add(new JMenuItem("Открыть"));
        JMenuItem saveItem = fileMenu.add(new JMenuItem("Сохранить"));
        saveItem.setEnabled(false);
        fileMenu.addSeparator();
        JMenuItem exitItem = fileMenu.add(new JMenuItem("Выход"));
        exitItem.addActionListener(e -> System.exit(0));
        exitItem.setAccelerator(KeyStroke.getKeyStroke(OS.equals("MAC") ? "meta Q" : "ctrl Q"));

        editMenu.add(new JMenuItem("Вырезать"));
        editMenu.add(new JMenuItem("Копировать"));
        editMenu.add(new JMenuItem("Вставить"));
        JMenu optionsMenu = new JMenu("Опции");
        optionsMenu.add(new JMenuItem("Опция 1"));
        optionsMenu.add(new JMenuItem("Опция 2"));
        editMenu.add(optionsMenu);

        editMenu.add(new JCheckBoxMenuItem("галка"));

        ButtonGroup buttonGroup = new ButtonGroup();
        JRadioButtonMenuItem rb1 = new JRadioButtonMenuItem("кнопка 1");
        JRadioButtonMenuItem rb2 = new JRadioButtonMenuItem("кнопка 2");
        buttonGroup.add(rb1);
        buttonGroup.add(rb2);
        editMenu.add(rb1);
        editMenu.add(rb2);

        editMenu.add(new JMenuItem("Edit", 'E'));       // На Маке не работает

        jFrame.setJMenuBar(menuBar);
        jFrame.revalidate();


    }


    private static JFrame getFrame() {
        JFrame jFrame = new JFrame() {
        };
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(700, 500);
        jFrame.setLocationRelativeTo(null);         // в центре экрана
        jFrame.setTitle("Приложение 13");

        return jFrame;
    }



}


