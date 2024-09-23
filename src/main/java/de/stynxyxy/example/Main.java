package de.stynxyxy.example;

import de.stynxyxy.simpleui.ui.SimpleBorder;
import de.stynxyxy.simpleui.ui.SimpleGUI;
import de.stynxyxy.simpleui.ui.SimpleLayout;
import de.stynxyxy.simpleui.ui.SimplePanel;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        //ExampleUI ui =  new ExampleUI();
        SimpleGUI ui = new SimpleGUI("example",new SimplePanel(new SimpleBorder(100,100,100,100).get(), SimpleLayout.createSimpleRowLayout(1,1)));
        ui.getPanel().addWidget(new JButton("test"));
        ui.update();
    }
}
