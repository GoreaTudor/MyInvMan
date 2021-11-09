package GUI.WelcomePanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GoToSignUpButton extends JButton implements ActionListener {

    public GoToSignUpButton () {
        this.addActionListener(this);
        this.setFocusable(false);
        this.setName("Sign up");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Sign up pressed");
    }
}
