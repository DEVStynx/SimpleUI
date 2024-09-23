package de.stynxyxy.simpleui.interfaces;

import de.stynxyxy.simpleui.ui.SimplePanel;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public interface GUIInterface {
    JFrame frame = null;
    JPanel panel = null;



    void initGUI(Border border, LayoutManager manager);

    void initGUI(SimplePanel panel);

    SimplePanel getPanel();

    void update();
}
