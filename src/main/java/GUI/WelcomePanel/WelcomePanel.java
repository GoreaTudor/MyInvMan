package GUI.WelcomePanel;

import javax.swing.*;
import java.awt.*;

public class WelcomePanel extends JPanel {
    GoToSignUpButton signUpButton;
    GoToSignInButton signInButton;

    public WelcomePanel () {
        this.setLayout(new FlowLayout());

        signUpButton = new GoToSignUpButton();
        signInButton = new GoToSignInButton();
    }

}
