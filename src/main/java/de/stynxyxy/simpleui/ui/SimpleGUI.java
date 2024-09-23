package de.stynxyxy.simpleui.ui;



import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
@Deprecated
public class SimpleGUI extends JFrame {

    SimplePanel panel;

    public SimpleGUI(String title) {
        super(title);

        initGUI(BorderFactory.createEmptyBorder(100,100,100,100),new GridLayout(0,1));
    }

    public SimpleGUI(String title,Border border, LayoutManager manager) {
        super(title);

        initGUI(border,manager);
    }

    public SimpleGUI(String title, SimplePanel panel) {
        super(title);

        initGUI(panel);
    }



    protected void initGUI(Border border, LayoutManager manager) {
        this.panel = new SimplePanel(border,manager);

        this.add(this.panel, BorderLayout.CENTER);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.pack();
        this.setVisible(true);
    }

    protected void initGUI(SimplePanel panel) {
        this.panel = panel;

        this.add(this.panel, BorderLayout.CENTER);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.pack();
        this.setVisible(true);
    }

    public SimplePanel getPanel() {
        return this.panel;
    }

    public void update() {
        this.add(getPanel());
        this.pack();
    }
}
