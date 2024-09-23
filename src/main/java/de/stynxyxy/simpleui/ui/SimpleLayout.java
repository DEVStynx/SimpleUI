package de.stynxyxy.simpleui.ui;

import java.awt.*;

public class SimpleLayout {

    private LayoutManager layoutManager;
    public SimpleLayout(int rows, int columns) {
        this(new GridLayout(rows,columns));
    }

    public SimpleLayout(LayoutManager layoutManager) {
        this.layoutManager = layoutManager;
    }

    public LayoutManager get() {
        return this.layoutManager;
    }

    public LayoutManager set(LayoutManager layoutManager) {
        this.layoutManager = layoutManager;
        return this.get();
    }

    public static LayoutManager createSimpleRowLayout(int rows, int columns) {
        return new SimpleLayout(rows, columns).get();
    }
}
