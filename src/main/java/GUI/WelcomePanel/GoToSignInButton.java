package GUI.WelcomePanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GoToSignInButton extends JButton implements ActionListener {

    public GoToSignInButton () {
        this.addActionListener(this);
        this.setFocusable(false);
        this.setName("Sign in");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Sign in pressed");
    }
}
