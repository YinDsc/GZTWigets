package studio.visualdust.product.gztwigets;

import javax.swing.*;
import java.awt.*;

public class GCheckBox extends JPanel {
    private Color DEFAULT_BG_COLOR = new Color(255, 255, 255);
    private Color MOVINGPANEL_FG = new Color(255, 255, 255);
    private Color GAIN_BG_COLOR = new Color(211, 211, 211);
    private Color ON_COLOR = new Color(21, 188, 0);
    private Color OFF_COLOR = new Color(177, 0, 3);

    private int GAIN_WIDTH = 100;
    private int GAIN_HEIGHT = 15;
    private int STATEPANEL_HEIGHT = 30;

    JLabel titleLabel = new JLabel("", JLabel.CENTER);
    JPanel gainPanel = new JPanel();
    GStringPanel stateGStrPanel = new GStringPanel("ON/OFF", MOVINGPANEL_FG);

    private boolean chosen = false;

    public GCheckBox(String title, boolean bool) {
        this.setLayout(null);
        chosen = false;
        titleLabel.setText(title);
        this.add(titleLabel);
        this.add(gainPanel);
        this.add(stateGStrPanel);

        this.SetSize(this.getSize());
    }

    public boolean IsChosen() {
        return chosen;
    }

    public void SetChosen(boolean chosen) {
        this.chosen = chosen;
        stateGStrPanel.setBackground(chosen ? ON_COLOR : OFF_COLOR);
    }

    public void SetSize(Dimension dimension) {
        this.setSize(dimension);
        gainPanel.setLocation(this.getWidth() - GAIN_WIDTH, this.getHeight() / 2 - GAIN_HEIGHT / 2);
        titleLabel.setLocation(0, 0);
        titleLabel.setSize(this.getWidth() - gainPanel.getWidth(), this.getHeight());
        stateGStrPanel.Set_Size(new Dimension(gainPanel.getWidth() / 2, STATEPANEL_HEIGHT));
        stateGStrPanel.setLocation(chosen ? this.getWidth() - gainPanel.getWidth() / 2 : gainPanel.getX(), this.getHeight() / 2 - STATEPANEL_HEIGHT / 2);
    }
}
