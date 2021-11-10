package GUI.SignInWindow;

import CustomExceptions.InvalidPasswordException;
import CustomExceptions.InvalidUsernameException;
import Data.Database.DatabaseConnector;
import GUI.BaseWindow.BaseFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
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
        char[] password = BaseFrame.getSignInPanel().getPasswordField().getPassword();
        int hashedPWD = Arrays.hashCode(password);

        System.out.println("username=" + username);
        System.out.println("password=" + password);
        System.out.println("hashedPWD=" + hashedPWD);
        System.out.println();

        try {
            if (username.length() < 4 || username.length() > 20)
                throw new InvalidUsernameException();

            if (password.length < 4 || password.length > 20)
                throw new InvalidPasswordException();

            DatabaseConnector.getStatement().executeQuery("");

            BaseFrame.signUpPanelVisibility(false);
            BaseFrame.welcomePanelVisibility(true);

            JOptionPane.showMessageDialog(null, "Account created successfully", "Info", JOptionPane.INFORMATION_MESSAGE);

        } catch (InvalidUsernameException ex) {
            JOptionPane.showMessageDialog(null, "Username must be between 4 and 20 characters", "Invalid Username", JOptionPane.ERROR_MESSAGE);

        } catch (InvalidPasswordException ex) {
            JOptionPane.showMessageDialog(null, "Password must be between 4 and 20 characters", "Invalid Password", JOptionPane.ERROR_MESSAGE);

        } catch (SQLIntegrityConstraintViolationException ex) { // duplicate primary key
            JOptionPane.showMessageDialog(null, "This username is unavailable, please use a different username", "Account error", JOptionPane.ERROR_MESSAGE);

        } catch (SQLException ex) {
            ex.printStackTrace();

        } finally {
            BaseFrame.getSignUpPanel().getUsernameField().setText("");
            BaseFrame.getSignUpPanel().getPasswordField().setText("");
        }
    }
}
