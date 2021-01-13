package com.huanhai.snake;

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
          System.out.println("移动中");
          try {
              TimeUnit.MILLISECONDS.sleep(200);
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
      }
    }
}
