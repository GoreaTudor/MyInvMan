package GUI.SignUpWindow;

import GUI.BaseWindow.BaseFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class BackButton extends JButton implements ActionListener {

    BackButton () {
        this.addActionListener(this);
        this.setFocusable(false);
        this.setText("Back");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        BaseFrame.getSignUpPanel().getUsernameField().setText("");
        BaseFrame.getSignUpPanel().getPasswordField().setText("");

        BaseFrame.signUpPanelVisibility(false);
        BaseFrame.welcomePanelVisibility(true);
    }
}
