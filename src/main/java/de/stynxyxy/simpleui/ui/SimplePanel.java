package de.stynxyxy.simpleui.ui;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class SimplePanel extends JPanel {

    SimplePanel INSTANCE;
    Component[] components;


    public SimplePanel(Border border, LayoutManager manager) {


        this.INSTANCE = this;
        this.components = new Component[0];
        initPanel(border,manager);
    }


    public SimplePanel(Border border, LayoutManager manager, Component[] components) {
        this.INSTANCE = this;
        this.components = components;
        initPanel(border,manager);
    }

    public void initPanel(Border border,LayoutManager layoutManager) {
        //setting up Border,Layout
        this.setBorder(border);
        this.setLayout(layoutManager);
        initWidgets();
    }

    public void initWidgets() {
        for (Component component: this.components) {
            this.add(component);
            System.out.println("✅Added Component: "+component.getName());
        }
    }

    public Component addWidget(Component component) {
        this.add(component);
        return component;
    }
    public Component[] addWidgets(Component[] components) {
        for (Component component: components) {
            this.add(component);
        }
        return components:
    }


    public SimplePanel getINSTANCE() {
        return this.INSTANCE;
    }
}
