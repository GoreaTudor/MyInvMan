package MainPackage;

import Data.Database.DatabaseConnector;
import GUI.BaseWindow.BaseFrame;

public class Main {
    public static void main(String[] args) {
        BaseFrame.getFrame();
        DatabaseConnector.getInstance();
    }
}
