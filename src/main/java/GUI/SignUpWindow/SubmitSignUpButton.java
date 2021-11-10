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
        String username = BaseFrame.getSignUpPanel().getUsernameField().getText();
        int password = Arrays.hashCode(BaseFrame.getSignUpPanel().getPasswordField().getPassword());
        boolean isAdmin = BaseFrame.getSignUpPanel().getIsAdminCheckBox().isSelected();

        System.out.println(username);
        System.out.println(password);
        System.out.println(isAdmin);
        System.out.println();
    }
}
