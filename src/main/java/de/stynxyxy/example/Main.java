package de.stynxyxy.example;

import de.stynxyxy.simpleui.ui.SimpleBorder;
import de.stynxyxy.simpleui.ui.SimpleGUI;
import de.stynxyxy.simpleui.ui.SimpleLayout;
import de.stynxyxy.simpleui.ui.SimplePanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {

        //ExampleUI ui =  new ExampleUI();
        SimpleGUI ui = new SimpleGUI("example",new SimplePanel(new SimpleBorder(100,100,100,100).get(), SimpleLayout.createSimpleRowLayout(1,1)));

        JButton button = new JButton("test");
        JLabel label = new JLabel("text");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("pressed button");
                label.setText("pressed the Button!");
            }
        });
        ui.getPanel().addWidget(label);
        ui.getPanel().addWidget(button);
        ui.update();
    }
}
