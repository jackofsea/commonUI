package com.huanhai.snake.commpent;

import com.huanhai.snake.domain.Food;
import com.huanhai.snake.domain.ISnake;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @author 覃波
 * @version 1.0
 * @date 2021-01-13 17:29
 **/
public class SnakePanel extends JPanel implements KeyListener {
    ISnake snake;
    Food food;

    public SnakePanel() {
    }

    public SnakePanel(ISnake snake, Food food) {
        this.snake = snake;
        this.food = food;
    }




    @Override
    public void paint(Graphics g) {
        super.paint(g);
        snake.move();
        Graphics2D g2 = (Graphics2D) g;
        g2.fill(snake.getShape());
        g2.fill(food.getfood());
    }

    @Override
    public void keyTyped(KeyEvent e) {
        keyListen(e);

    }

    @Override
    public void keyPressed(KeyEvent e) {
        keyListen(e);
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
    private void keyListen(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP:
                snake.up();
                break;
            case KeyEvent.VK_LEFT:
                snake.left();
                break;
            case KeyEvent.VK_RIGHT:
                snake.right();
                break;
            default:
                snake.down();
        }
    }
    public ISnake getSnake() {
        return snake;
    }

    public void setSnake(ISnake snake) {
        this.snake = snake;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }
}
