package com.sstech.myApp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GamePanel extends JPanel implements ActionListener {

    static final int SCREEN_WIDTH = 600;
    static final int SCREEN_HEIGHT = 600;
    static final int UNIT_SIZE = 25;
    static final int GAME_UNITS = (SCREEN_WIDTH * SCREEN_HEIGHT) / UNIT_SIZE;
    public GamePanel() {
    }

    public void startGame() {

    }

    public void paintComponent(Graphics g) {

    }
    public void draw(Graphics g) {

    }
    public void move() {

    }
    public void checkApples() {

    }
    public void checkCollisions() {

    }
    public void gameOver(Graphics g) {

    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public class MyKeyAdapter extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {

        }
    }

}
