package efficiency_score_1_awt;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class awt2 {
    public static void main(String[] args) {
        Frame frame = new Frame("Example Layout AWT");
        Panel mainPanel = new Panel(new BorderLayout());

        Label titleLabel = new Label("Back-End Development", Label.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 16));
        mainPanel.add(titleLabel, BorderLayout.NORTH);

        Panel buttonPanel = new Panel(new FlowLayout());

        buttonPanel.add(new Button("View Tasks"));
        buttonPanel.add(new Button("Add Tasks"));
        buttonPanel.add(new Button("Delete Tasks"));

        mainPanel.add(buttonPanel, BorderLayout.CENTER);

        frame.add(mainPanel);
        frame.setSize(300, 100);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
