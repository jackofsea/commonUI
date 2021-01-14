package com.huanhai.snake.domain;

import java.awt.geom.Ellipse2D;

public interface ISnake {
     void move();
     void up();
     void down();
     void left();
     void right();
     Ellipse2D getShape();
}
