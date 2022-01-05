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

        jFrame.setIconImage(new ImageIcon("img/moder.png").getImage());     // не работает

        setTrayIcon();


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


    private static void setTrayIcon() {
        if (!SystemTray.isSupported()) {
            System.out.println("not supported");
            return;
        }

        // https://stackoverflow.com/questions/11253772/setting-the-default-application-icon-image-in-java-swing-on-os-x
        // это работает на Java не новее 1.8
        // https://community.oracle.com/tech/developers/discussion/3938294/unable-to-use-com-apple-eawt-package

        try {
            com.apple.eawt.Application.getApplication().setDockIconImage(new ImageIcon("img/moder.png").getImage());
        } catch (Exception ignored) {}


        // https://eax.me/java-tray-icon/
        System.setProperty("apple.awt.enableTemplateImages", "true");

        TrayIcon trayIcon = new TrayIcon(new ImageIcon("img/moder.png").getImage(), "Имя приложения");
        trayIcon.setImageAutoSize(true);

        SystemTray tray = SystemTray.getSystemTray();
        try {
            tray.add(trayIcon);
        } catch (AWTException e) {
            e.printStackTrace();
        }




    }
}
