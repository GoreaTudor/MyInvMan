package GUI.WelcomeWindow;

import GUI.BaseWindow.BaseFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class GoToSignInButton extends JButton implements ActionListener {

    public GoToSignInButton () {
        this.addActionListener(this);
        this.setFocusable(false);
        this.setText("Sign in");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Sign in pressed");
        BaseFrame.WelcomePanelVisibility(false);
    }
}
