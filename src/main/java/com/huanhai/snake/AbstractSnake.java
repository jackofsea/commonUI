package com.huanhai.snake;

/**
 * @author 覃波
 * @version 1.0
 * @date 2021-01-13 15:57
 **/
public abstract class AbstractSnake implements ISnake {
    public int x=10;
    public int y=10;
    abstract void move();
    abstract void up();
    abstract void down();
    abstract void left();
    abstract void right();
}
