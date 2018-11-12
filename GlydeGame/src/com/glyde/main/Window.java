package com.glyde.main;

import javax.swing.*;
import java.awt.*;

public class Window extends Canvas {

    public Window(int width, int height, String title, Game game) {
        JFrame frame = new JFrame(title); // Create a JFrame
        Dimension dim = new Dimension(width, height);
        frame.setPreferredSize(dim);
        frame.setMaximumSize(dim);
        frame.setMinimumSize(dim);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

        frame.add(game); // Dependency injection
        frame.setVisible(true);

        game.start();

    }
}
