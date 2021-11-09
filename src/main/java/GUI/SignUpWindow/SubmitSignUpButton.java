package GUI.SignUpWindow;

import GUI.BaseWindow.BaseFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

class SubmitSignUpButton extends JButton implements ActionListener {

    SubmitSignUpButton () {
        this.addActionListener(this);
        this.setFocusable(false);
        this.setText("Submit");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(BaseFrame.getSignUpPanel().getUsernameField().getText());
        System.out.println(Arrays.hashCode(BaseFrame.getSignUpPanel().getPasswordField().getPassword()));
        System.out.println();
    }
}
