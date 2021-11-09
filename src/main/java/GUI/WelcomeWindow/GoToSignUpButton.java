package GUI.WelcomeWindow;

import GUI.BaseWindow.BaseFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class GoToSignUpButton extends JButton implements ActionListener {

    GoToSignUpButton () {
        this.addActionListener(this);
        this.setFocusable(false);
        this.setText("Sign up");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Sign up pressed");
        BaseFrame.WelcomePanelVisibility(false);
        BaseFrame.SignUpPanelVisibility(true);
    }
}
