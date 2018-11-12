package com.glyde.main;

import java.awt.*;


public class Game extends Canvas implements Runnable, WindowCreator {
    private static final int WIDTH = 640, HEIGHT = WIDTH / 12 * 9;

    @Override
    public void run() {

    }
    public Game()
    {
        createWindow();
    }

    @Override
    public void createWindow() {
        new Window(WIDTH, HEIGHT, "Glyde v1.0", this);
    }

    public synchronized void start() {

    }


}
