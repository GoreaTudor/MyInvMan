package GUI.WelcomePanel;

import javax.swing.*;
import java.awt.*;

public class WelcomePanel extends JPanel {
    GoToSignUpButton signUpButton;
    GoToSignInButton signInButton;

    public WelcomePanel () {
        this.setLayout(new FlowLayout());
        this.setBackground(Color.GRAY);

        signUpButton = new GoToSignUpButton();
        signInButton = new GoToSignInButton();

        this.add(signUpButton);
        this.add(signInButton);
    }

}
