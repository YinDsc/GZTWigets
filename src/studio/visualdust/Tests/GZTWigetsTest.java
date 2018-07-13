package studio.visualdust.Tests;

import studio.visualdust.product.gztwigets.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GZTWigetsTest {
    public static void main(String[] args) {
        GTheme.GZTIniter();
        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame.setVisible(true);
        frame.getContentPane().setBackground(new Color(255, 255, 255));
        frame.setSize(new Dimension(555, 555));
        frame.setLocation(222, 222);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("GZTWigets LookAndFeel TEST !");

        //Insert test code under here .
        GTextField textField = new GTextField("GTextField test");
        textField.setBorder(null);
        frame.add(textField);
        textField.SetSize(new Dimension(200, 50));
        textField.setLocation(10, 10);

        GIntSpinner gIntSpinner = new GIntSpinner(0);
        frame.add(gIntSpinner);
        gIntSpinner.setLocation(111, 222);
        gIntSpinner.SetSize(new Dimension(255, 50));

        GCheckBox gCheckBox = new GCheckBox("GCheckBox", true);
        frame.add(gCheckBox);
        gCheckBox.setLocation(111, 333);
        gCheckBox.SetSize(new Dimension(333, 111));

        GButton gButton = new GButton("GMessageWindow test");
        frame.add(gButton);
        gButton.setLocation(111, 111);
        gButton.SetSize(new Dimension(255, 50));
        gButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new GMessageWindow(frame, 2, "GMessageWindow");
                int tmpR = (int) (Math.random() * 255);
                int tmpG = (int) (Math.random() * 255);
                int tmpB = (int) (Math.random() * 255);
                textField.SetTipColor(new Color(tmpR, tmpG, tmpB));
            }
        });

    }
}
