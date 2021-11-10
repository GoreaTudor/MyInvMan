package GUI.SignInWindow;

import GUI.BaseWindow.BaseFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

class SubmitSignInButton extends JButton implements ActionListener {

    SubmitSignInButton () {
        this.addActionListener(this);
        this.setFocusable(false);
        this.setText("Submit");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String username = BaseFrame.getSignInPanel().getUsernameField().getText();
        int password = Arrays.hashCode(BaseFrame.getSignInPanel().getPasswordField().getPassword());

        System.out.println(username);
        System.out.println(password);
        System.out.println();
    }
}
