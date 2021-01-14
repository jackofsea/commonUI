package com.huanhai.snake.domain;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.util.Random;

public class Food  {
    private int x;
    private int y;
    private Component component;
    private static Random rn =new Random();
    public Food(Component component){
        this.component=component;
    }
    public void init() {
        this.x=rn.nextInt(300);
        this.y=rn.nextInt(400);
    }
    public Ellipse2D getfood() {
        return new Ellipse2D.Double(x, y, 15, 15);
    }


}
