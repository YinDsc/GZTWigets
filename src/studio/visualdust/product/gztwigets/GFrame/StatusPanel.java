package studio.visualdust.product.gztwigets.GFrame;

import javax.swing.*;
import java.awt.*;

public class StatusPanel extends JDesktopPane {
    public static int DEFAULT_SP_HEIGHT = 30;
    //The default height of statusPanel.
    public static int DEFAULT_BNT_WIDTH = 40;
    //The default width of three buttons.

    public static Color DEFAULT_BNT_BG_COLOR = new Color(255, 255, 255);
    public static Color DEFAULT_BNT_FG_COLOR = new Color(0, 0, 0);

    public static Color DEFAULT_CLOSEBNT_MOUSEMOVING_BG = new Color(255, 50, 50);
    public static Color DEFAULT_CLOSEBNT_MOUSEMOVING_FG = new Color(255, 255, 255);

    public static Color DEFAULT_MAXBUN_MOUSEMOVING_BG = new Color(200, 200, 200);
    public static Color DEFAULT_MINBNT_MOUSEMOVING_BG = DEFAULT_MAXBUN_MOUSEMOVING_BG;

    public static Color DEFAULT_MAXBNT_CLICK_BG = new Color(133, 133, 133);
    public static Color DEFAULT_MAXBNT_CLICK_FG = new Color(255, 255, 255);

    public static Color DEFAULT_MINBNT_CLICK_BG = DEFAULT_MAXBNT_CLICK_BG;
    public static Color DEFAULT_MINBNT_cLICK_FG = DEFAULT_MAXBNT_CLICK_FG;

    public JPanel closePanel = new JPanel();
    public JLabel closeLabel = new JLabel("x", JLabel.CENTER);
    public JPanel maxPanel = new JPanel();
    public JLabel maxLabel = new JLabel("o", JLabel.CENTER);
    public JPanel minPanel = new JPanel();
    public JLabel minLabel = new JLabel("-", JLabel.CENTER);

    public StatusPanel(GFrame gFrame) {
        this.setLayout(null);
        this.add(closePanel);
        this.add(minPanel);
        this.add(maxPanel);
        closePanel.add(closeLabel);
        maxPanel.add(maxLabel);
        minPanel.add(minLabel);
        //MouseListener Here.


        this.SetWidth(this.getWidth());
        ReputButtons();
    }

    public void SetWidth(int width) {
        this.setSize(width, DEFAULT_SP_HEIGHT);
        ReputButtons();
    }

    public void ReputButtons() {
        closePanel.setSize(DEFAULT_BNT_WIDTH, this.getHeight());
        closePanel.setLocation(this.getWidth() - DEFAULT_BNT_WIDTH, this.getHeight());
        closeLabel.setLocation(0, 0);
        closeLabel.setSize(closePanel.getSize());
        maxPanel.setSize(DEFAULT_BNT_WIDTH, this.getHeight());
        maxPanel.setLocation(this.getWidth() - DEFAULT_BNT_WIDTH * 2, this.getHeight());
        maxLabel.setLocation(0, 0);
        maxLabel.setSize(maxPanel.getSize());
        minPanel.setSize(DEFAULT_BNT_WIDTH, this.getHeight());
        minPanel.setLocation(this.getWidth() - DEFAULT_BNT_WIDTH * 3, this.getHeight());
        minLabel.setLocation(0, 0);
        minLabel.setSize(minPanel.getSize());
    }
}
