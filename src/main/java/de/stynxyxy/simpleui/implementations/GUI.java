package de.stynxyxy.simpleui.implementations;

import de.stynxyxy.simpleui.interfaces.GUIInterface;
import de.stynxyxy.simpleui.ui.SimplePanel;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class GUI extends JFrame implements GUIInterface {

    //Variables

    SimplePanel panel;

    /*
    * @param title The Title of The GUI
    * @info creates a new GUI INSTANCE
    * */
    public GUI(String title) {
        super(title);

        initGUI(BorderFactory.createEmptyBorder(100,100,100,100),new GridLayout(0,1));
    }

    /*
     * @param title The Title of The GUI
     * @param border The Border Variable/Option of The GUI
     * @param manager The Layout of The GUI
     * @info creates a new GUI INSTANCE
     * */
    public GUI(String title,Border border, LayoutManager manager) {
        super(title);

        initGUI(border,manager);
    }
    /*
     * @param title The Title of The GUI
     * @param panel The Standart Panel of the GUI
     * @info creates a new GUI INSTANCE
     * */
    public GUI(String title, SimplePanel panel) {
        super(title);

        initGUI(panel);
    }


    @Override
    public void initGUI(Border border, LayoutManager manager) {
        this.panel = new SimplePanel(border,manager);

        this.add(this.panel, BorderLayout.CENTER);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.pack();
        this.setVisible(true);
    }

    @Override
    public void initGUI(SimplePanel panel) {
        this.panel = panel;

        this.add(this.panel, BorderLayout.CENTER);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.pack();
        this.setVisible(true);
    }

    @Override
    public SimplePanel getPanel() {
        return this.panel;
    }

    @Override
    public void update() {
        this.add(getPanel());
        this.pack();
    }
}
