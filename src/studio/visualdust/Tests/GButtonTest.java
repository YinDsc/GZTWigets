package studio.visualdust.Tests;

import studio.visualdust.product.gztwigets.GButton;
import studio.visualdust.product.gztwigets.GMessageWindow;
import studio.visualdust.product.gztwigets.GTextField;
import studio.visualdust.product.gztwigets.Theme;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GButtonTest {
    public static void main(String[] args) {
        Theme.GZTIniter();
        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame.setVisible(true);
        frame.getContentPane().setBackground(new Color(255, 255, 255));
        frame.setSize(new Dimension(233, 233));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //Insert test code under here .

        GButton gButton = new GButton("exit test");
        frame.add(gButton);
        gButton.setLocation(111, 111);
        gButton.SetSize(new Dimension(111, 30));
        gButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }
        });
        GTextField textField = new GTextField("??????");
        textField.setBorder(null);
        frame.add(textField);
        textField.SetSize(new Dimension(100, 50));
        textField.setLocation(0, 0);
        new GMessageWindow(frame, 2, "fuck!!!!!!!!!!");
    }
}
