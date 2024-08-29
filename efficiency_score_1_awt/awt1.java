package efficiency_score_1_awt;

import java.awt.*;

public class awt1 {
    public static void main(String[] args) {
        Frame frame = new Frame("Example AWT");
        Label label = new Label("Hello, User!");

        frame.setLayout(new FlowLayout(FlowLayout.CENTER));

        frame.add(label);
        frame.setSize(300, 100);
        frame.setVisible(true);
    }
}
