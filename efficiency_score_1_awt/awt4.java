package efficiency_score_1_awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class awt4 {
    public static void main(String[] args) {
        Frame frame = new Frame("Email Sender");

        TextField recipientField = new TextField("Recipient Email");
        TextField subjectField = new TextField("Subject");
        TextArea bodyArea = new TextArea("Enter email body here...", 10, 40);

        Button sendButton = new Button("Send");

        frame.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        frame.add(new Label("Recipient Email:"), gbc);

        gbc.gridx = 1;
        frame.add(recipientField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        frame.add(new Label("Subject:"), gbc);

        gbc.gridx = 1;
        frame.add(subjectField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        frame.add(new Label("Body:"), gbc);

        gbc.gridy = 3;
        frame.add(bodyArea, gbc);

        gbc.gridy = 4;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        frame.add(sendButton, gbc);

        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Email Sent:");
                System.out.println("To: " + recipientField.getText());
                System.out.println("Subject: " + subjectField.getText());
                System.out.println("Body:\n" + bodyArea.getText());

                recipientField.setText("");
                subjectField.setText("");
                bodyArea.setText("");
            }
        });

        frame.setSize(400, 400);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
