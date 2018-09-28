package studio.visualdust.Tests;

import studio.visualdust.product.gztwigets.GMessageWindow;
import studio.visualdust.product.gztwigets.GTheme;

import javax.swing.*;

public class MessageWindowTest extends JFrame {
    public static void main(String[] args) {
        JFrame mainWind = new JFrame();
        mainWind.setLocation(700, 400);
        (new GTheme()).GZTIniter();
        new GMessageWindow(mainWind, 1, "群主的出现把我吓跑了");
    }
}
