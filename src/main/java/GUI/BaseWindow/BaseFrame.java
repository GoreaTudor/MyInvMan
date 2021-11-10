package GUI.BaseWindow;

import GUI.SignInWindow.SignInPanel;
import GUI.SignUpWindow.SignUpPanel;
import GUI.WelcomeWindow.WelcomePanel;

import javax.swing.*;

public class BaseFrame extends JFrame {

    private static BaseFrame frame = new BaseFrame();

    JPanel container;

    private WelcomePanel welcomePanel;
    private SignUpPanel signUpPanel;
    private SignInPanel signInPanel;


    private BaseFrame () {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Inventory Management");
        this.setSize(500, 500);

        container = new JPanel();
        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));

        welcomePanel = new WelcomePanel();
        signUpPanel = new SignUpPanel();
        signInPanel = new SignInPanel();

        container.add(welcomePanel);
        container.add(signUpPanel);
        container.add(signInPanel);

        this.add(container);
        this.setVisible(true);
    }


    public static BaseFrame getFrame () {
        return frame;
    }


    public static void welcomePanelVisibility(boolean v) {
        frame.welcomePanel.setVisible(v);
    }

    public static void signUpPanelVisibility(boolean v) {
        frame.signUpPanel.setVisible(v);
    }

    public static void signInPanelVisibility(boolean v) {
        frame.signInPanel.setVisible(v);
    }


    public static WelcomePanel getWelcomePanel () {
        return frame.welcomePanel;
    }

    public static SignUpPanel getSignUpPanel () {
        return frame.signUpPanel;
    }

    public static SignInPanel getSignInPanel() {
        return frame.signInPanel;
    }
}
