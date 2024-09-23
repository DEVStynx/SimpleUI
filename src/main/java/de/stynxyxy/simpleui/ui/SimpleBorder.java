package de.stynxyxy.simpleui.ui;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class SimpleBorder {

    Border border;
    public SimpleBorder() {
        this(100,100,100,100);
    }

    public SimpleBorder(int top, int left, int bottom, int right) {
        this.border = BorderFactory.createEmptyBorder(top,left,bottom,right);
    }


    public Border get() {
        return this.border;
    }
}
