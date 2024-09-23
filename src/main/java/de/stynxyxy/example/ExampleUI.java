package de.stynxyxy.example;

import de.stynxyxy.simpleui.implementations.GUI;
import de.stynxyxy.simpleui.ui.SimpleBorder;
import de.stynxyxy.simpleui.ui.SimpleGUI;
import de.stynxyxy.simpleui.ui.SimpleLayout;
import de.stynxyxy.simpleui.ui.SimplePanel;

import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class ExampleUI extends GUI {
    public ExampleUI() {
        super("Example GUI", new SimplePanel(new SimpleBorder().get(), SimpleLayout.createSimpleRowLayout(1,1)));

    }

    @Override
    public void initGUI(SimplePanel panel) {
        super.initGUI(panel);

    }

    @Override
    public void update() {
        super.update();
        System.out.println("Window "+this.getName()+" just updated");
    }
}
