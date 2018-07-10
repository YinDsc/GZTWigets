package studio.visualdust.product.gztwigets.GFrame;

import javax.swing.*;
import java.awt.*;

public class GFrame extends JFrame {
    public static Color DEFAULT_BG_COLOR = new Color(255, 255, 255);

    private JPanel statusPanel = new JPanel();
    //StatusPanel instead of the origin one.

    public GFrame() {
        this.setLayout(null);
        this.getContentPane().setBackground(DEFAULT_BG_COLOR);
        this.setUndecorated(true);

    }

    public void SetSize(Dimension dimension) {
        this.setSize(dimension);
        statusPanel.setLocation(0, 0);
    }
}
