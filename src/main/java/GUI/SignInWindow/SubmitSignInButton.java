package GUI.SignInWindow;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class SubmitSignInButton extends JButton implements ActionListener {

    SubmitSignInButton () {
        this.addActionListener(this);
        this.setFocusable(false);
        this.setText("Submit");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ;
    }
}
