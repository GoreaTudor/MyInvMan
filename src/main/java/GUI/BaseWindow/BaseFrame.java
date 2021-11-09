package GUI.BaseWindow;

import GUI.WelcomePanel.WelcomePanel;

import javax.swing.*;

public class BaseFrame extends JFrame {

    WelcomePanel welcomePanel;

    BaseFrame () {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        welcomePanel = new WelcomePanel();

        this.add(welcomePanel);
    }
}
