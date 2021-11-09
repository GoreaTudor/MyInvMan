package GUI.BaseWindow;

import GUI.SignUpWindow.SignUpPanel;
import GUI.WelcomeWindow.WelcomePanel;

import javax.swing.*;

public class BaseFrame extends JFrame {

    private static BaseFrame frame = new BaseFrame();


    private WelcomePanel welcomePanel;
    private SignUpPanel signUpPanel;


    private BaseFrame () {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Inventory Management");
        this.setSize(500, 500);

        welcomePanel = new WelcomePanel();
        signUpPanel = new SignUpPanel();

        this.add(welcomePanel);
        this.add(signUpPanel);
        this.setVisible(true);
    }


    public static BaseFrame getFrame () {
        return frame;
    }


    public static void WelcomePanelVisibility(boolean v) {
        frame.welcomePanel.setVisible(v);
    }

    public static void SignUpPanelVisibility(boolean v) {
        frame.signUpPanel.setVisible(v);
    }


    public static WelcomePanel getWelcomePanel () {
        return frame.welcomePanel;
    }

    public static SignUpPanel getSignUpPanel () {
        return frame.signUpPanel;
    }
}
