/*
https://www.youtube.com/watch?v=YjD90CJBWTo&list=PL786bPIlqEjTN-Sy8uMLQ6s85qNxP1hAp&index=2
 */

package lesson02;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class Lesson02 {
    public static void main(String[] args) {
//        String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
//        System.out.println(Arrays.toString(fonts));

        JFrame jFrame = getFrame();
        jFrame.add(new MyComponent());


    }


    static class MyComponent extends JComponent {
        @Override
        protected void paintComponent(Graphics g) {
            Font font = new Font("Helvetica", Font.BOLD, 20);
            Graphics2D g2 = (Graphics2D) g;
            g2.setFont(font);
            g2.drawString("Привет!", 20, 40);

            Point2D p1 = new Point2D.Double(50, 50);
            Point2D p2 = new Point2D.Double(200, 150);
            Line2D l2 = new Line2D.Double(p1, p2);
            g2.draw(l2);

            Ellipse2D el = new Ellipse2D.Double();
            el.setFrameFromDiagonal(p1, p2);
            g2.setPaint(new Color(34, 81, 131));
            g2.draw(el);

            Rectangle2D r2 = new Rectangle2D.Double();
            r2.setFrameFromDiagonal(p1, p2);
            g2.setPaint(Color.MAGENTA);
            g2.draw(r2);

//                URL url = new URL("https://bvrs.ru/css/img/logo.png");
//                Image image = new ImageIcon(url).getImage();
            Image image = new ImageIcon("img/BVRS_logo.png").getImage();
            g2.drawImage(image, 100, 200, null);


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
        jFrame.setTitle("Приложение 2");

        return jFrame;
    }


}


