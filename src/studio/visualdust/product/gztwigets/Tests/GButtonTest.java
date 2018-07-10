package studio.visualdust.product.gztwigets.Tests;

import studio.visualdust.product.gztwigets.GButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GButtonTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
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
