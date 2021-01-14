package com.huanhai.snake.domain;

import java.awt.geom.Ellipse2D;

/**
 * @author 覃波
 * @version 1.0
 * @date 2021-01-13 17:03
 **/
public class Snake extends AbstractSnake {
    private int dx=5;
    private int dy=0;
    public Snake(){}
    @Override
    public Ellipse2D getShape() {
        return new Ellipse2D.Double(x, y, 15, 15);
    }
    @Override
    public void move() {
        x+=dx;
        y+=dy;
    }

    @Override
    public void up() {
       dx=0;
       dy=-step;
    }

    @Override
    public void down() {
        dx=0;
        dy=+step;
    }

    @Override
    public void left() {
        dx=-step;
        dy=0;
    }

    @Override
    public void right() {
        dx=step;
        dy=0;
    }
}
