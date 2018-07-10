package studio.visualdust.Tests;

import studio.visualdust.product.gztwigets.GButton;
import studio.visualdust.product.gztwigets.GFrame.GFrame;

import javax.swing.*;
import java.awt.*;

public class GButtonTest {
    public static void main(String[] args) {
        GFrame frame = new GFrame();
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(233, 233);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //Insert test code under here .

        GButton gButton = new GButton("exit test");
        frame.add(gButton);
        gButton.setLocation(111, 111);
        gButton.SetSize(new Dimension(111, 30));
    }
}
