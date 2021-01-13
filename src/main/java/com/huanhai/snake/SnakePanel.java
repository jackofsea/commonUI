package com.huanhai.snake;

import javax.swing.*;
import java.awt.*;

/**
 * @author 覃波
 * @version 1.0
 * @date 2021-01-13 17:29
 **/
public class SnakePanel extends JPanel {
    AbstractSnake snake;
    public SnakePanel(AbstractSnake snake){
        this.snake=snake;
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        snake.move();
        Graphics2D g2 = (Graphics2D) g;
        g2.fill(snake.getShape());
    }

}
