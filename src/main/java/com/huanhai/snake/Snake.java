package com.huanhai.snake;

import java.awt.geom.Ellipse2D;
import java.util.concurrent.TimeUnit;

/**
 * @author 覃波
 * @version 1.0
 * @date 2021-01-13 17:03
 **/
public class Snake extends AbstractSnake implements Runnable {
    private int dx=1;
    private int dy=1;

    public Ellipse2D getShape() {
        return new Ellipse2D.Double(x, y, 15, 15);
    }
    @Override
    void move() {
        x+=dx;
        y+=dy;
    }

    @Override
    public void run() {
        while (true){
            move();
            try {
                TimeUnit.MILLISECONDS.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
