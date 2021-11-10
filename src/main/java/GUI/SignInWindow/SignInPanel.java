package GUI.SignInWindow;

import javax.swing.*;

public class SignInPanel extends JPanel {

    private JLabel usernameLabel;
    private JTextField usernameField;
    private JLabel passwordLabel;
    private JPasswordField passwordField;
    private SubmitSignInButton submitSignInButton;
    private BackButton backButton;

    public SignInPanel () {
        this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));

        usernameLabel = new JLabel("Username:");
        usernameField = new JTextField();
        passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();
        submitSignInButton = new SubmitSignInButton();
        backButton = new BackButton();

        this.add(usernameLabel);
        this.add(usernameField);
        this.add(passwordLabel);
        this.add(passwordField);
        this.add(submitSignInButton);
        this.add(backButton);

        this.setVisible(false);
    }

    public JTextField getUsernameField() {
        return usernameField;
    }

    public JPasswordField getPasswordField() {
        return passwordField;
    }
}
