package efficiency_score_1_awt;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class awt3 extends Canvas {
    public static void main(String[] args) {
        Frame frame = new Frame("House AWT");
        Canvas canvas = new awt3();

        frame.add(canvas);
        frame.setSize(500, 400);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillRect(150, 200, 200, 150);

        g.setColor(Color.BLACK);
        int[] xPoints = { 130, 250, 370 };
        int[] yPoints = { 200, 100, 200 };
        g.fillPolygon(xPoints, yPoints, 3);

        g.setColor(Color.black);
        g.fillRect(220, 270, 60, 80);

        g.setColor(Color.CYAN);
        g.fillRect(170, 220, 50, 50);
        g.fillRect(280, 220, 50, 50);

        g.setColor(Color.BLACK);
        g.drawLine(170, 245, 220, 245);
        g.drawLine(195, 220, 195, 270);
        g.drawLine(280, 245, 330, 245);
        g.drawLine(305, 220, 305, 270);

        g.setColor(Color.BLACK);
        g.fillRect(310, 130, 30, 50);
    }
}
