package MainPackage;

import GUI.BaseWindow.BaseFrame;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Runnable guiRunnable = () -> BaseFrame.getFrame();
        SwingUtilities.invokeLater(guiRunnable);
    }
}
