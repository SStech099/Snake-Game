package com.sstech.myApp;

import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {


    public GameFrame() throws HeadlessException {
        this.add(new GamePanel());
        this.setTitle("Snake");
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);

    }
}
