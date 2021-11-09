package GUI.BaseWindow;

import GUI.WelcomePanel.WelcomePanel;

import javax.swing.*;

public class BaseFrame extends JFrame {

    private static BaseFrame frame = new BaseFrame();


    private WelcomePanel welcomePanel;


    private BaseFrame () {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Inventory Management");
        //this.setSize(300, 300);

        welcomePanel = new WelcomePanel();

        this.add(welcomePanel);
        this.setVisible(true);
    }


    public static BaseFrame getFrame () {
        return frame;
    }


    public static void hideWelcomePanel() {
        frame.welcomePanel.setVisible(false);
    }
}
