package com.huanhai.snake.main;

import com.huanhai.snake.commpent.SnakePanel;
import com.huanhai.snake.domain.Food;
import com.huanhai.snake.domain.ISnake;
import com.huanhai.snake.domain.Snake;
import com.huanhai.snake.pool.SnakeTask;
import com.huanhai.snake.pool.TradeThreadPool;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author 覃波
 * @version 1.0
 * @date 2021-01-13 16:05
 **/
public class FrameClient {
    private static int width = 1000;
    private static int height = 900;
    private static String title = "贪吃蛇";
    private static JFrame frame = new JFrame(title);
    private static ISnake snake = new Snake();
    private static SnakePanel snakePanel = new SnakePanel();
    private static Food food = new Food(snakePanel);
    private static ThreadPoolExecutor threadPool = TradeThreadPool.getThreadPool();

    public FrameClient() {
    }

    public static void createWindow() {
        frame.setFocusable(true);
        frame.addKeyListener(snakePanel);
        frame.setSize(width, height);
        frame.setLocation(300, 50);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(new BorderLayout());
//        JPanel panel = new JPanel();
//        panel.setSize(300, 400);
//        panel.add(addStartButton());
//        panel.add(addExitButton());
        food.init();
        snakePanel.setFood(food);
        snakePanel.setSnake(snake);
        frame.add(snakePanel, BorderLayout.CENTER);
//        frame.add(panel, BorderLayout.SOUTH);
        threadPool.execute(new SnakeTask(snakePanel));


    }

    private static JButton addStartButton() {
        final JButton button = new JButton("开始游戏");
        button.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Thread(new SnakeTask(snakePanel)).start();
                button.setFocusable(false);
                frame.setFocusable(true);
            }
        });
        return button;
    }

    private static JButton addExitButton() {
        final JButton button = new JButton("退出游戏");
        button.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button.setFocusable(false);
                frame.setFocusable(true);
                System.exit(0);
            }
        });
        return button;
    }


}
