package com.huanhai.snake;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @author 覃波
 * @version 1.0
 * @date 2021-01-13 17:29
 **/
public class SnakePanel extends JPanel   {
    AbstractSnake snake;
    Food food;
    public SnakePanel(){}
    public SnakePanel(AbstractSnake snake,Food food){
        this.snake=snake;
        this.food=food;
    }

    public AbstractSnake getSnake() {
        return snake;
    }

    public void setSnake(AbstractSnake snake) {
        this.snake = snake;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        snake.move();
        Graphics2D g2 = (Graphics2D) g;
        g2.fill(snake.getShape());
        g2.fill(food.getfood());
    }

}
