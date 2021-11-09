package GUI.SignUpWindow;

import javax.swing.*;

public class SignUpPanel extends JPanel {

    private JLabel usernameLabel;
    private JTextField usernameField;
    private JLabel passwordLabel;
    private JPasswordField passwordField;
    private SubmitSignUpButton submitSignUpButton;

    public SignUpPanel () {
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        usernameLabel = new JLabel("Username:");
        usernameField = new JTextField();
        passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();
        submitSignUpButton = new SubmitSignUpButton();

        this.add(usernameLabel);
        this.add(usernameField);
        this.add(passwordLabel);
        this.add(passwordField);
        this.add(submitSignUpButton);

        this.setVisible(false);
    }

    public JTextField getUsernameField() {
        return usernameField;
    }

    public JPasswordField getPasswordField() {
        return passwordField;
    }
}
