package com.huanhai.snake.pool;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

/**
 * @author 覃波
 * @version 1.0
 * @date 2021-01-13 17:36
 **/
public class SnakeTask implements Runnable{
    JPanel snakePanel;
  public SnakeTask(JPanel panel){
      this.snakePanel=panel;
  }
    @Override
    public void run() {
      while (true){
          snakePanel.repaint();
          try {
              TimeUnit.MILLISECONDS.sleep(300);
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
      }
    }
}
