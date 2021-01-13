package com.huanhai.snake;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.concurrent.TimeUnit;

/**
 * @author 覃波
 * @version 1.0
 * @date 2021-01-13 16:05
 **/
public class FrameClient {
    private static int width = 1000;
    private static int height = 900;
    private static String title = "贪吃蛇";
    private static JFrame frame = new JFrame("贪吃蛇");
    private static AbstractSnake snake = new Snake();
    private static JPanel snakePanel = new SnakePanel();
    private static Food food = new Food(snakePanel);

    public FrameClient() {
    }

    public static void createWindow() {
        frame = new JFrame("贪吃蛇");
        frame.setSize(width, height);
        frame.setLocation(300, 50);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(new BorderLayout());
        JPanel panel = new JPanel();
        panel.setSize(300, 400);
        panel.add(addStartButton());
        panel.add(addExitButton());
        food.init();
        snakePanel.addKeyListener(new MyListener(snake));
        ((SnakePanel) snakePanel).setFood(food);
        ((SnakePanel) snakePanel).setSnake(snake);

        //  snake.add(food);
        frame.add(snakePanel, BorderLayout.CENTER);
        frame.add(panel, BorderLayout.SOUTH);

    }

    private static JButton addStartButton() {
        JButton button = new JButton("开始游戏");
        button.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Thread(new SnakeTask(snakePanel)).start();
            }
        });
        return button;
    }

    private static JButton addExitButton() {
        JButton button = new JButton("退出游戏");
        button.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        return button;
    }


}

class MyListener implements KeyListener {
    private AbstractSnake snake;
    public MyListener(AbstractSnake snake){
        this.snake=snake;
    }
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override // 按下
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            snake.down();
        } else if (e.getKeyCode() == KeyEvent.VK_UP) {
            snake.up();
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            snake.left();
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            snake.right();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
