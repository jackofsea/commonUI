package com.huanhai.snake;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * @author 覃波
 * @version 1.0
 * @date 2021-01-13 16:05
 **/
public class FrameClient {
    private  static int width=1000;
    private static int height=900;
    private static  String title="贪吃蛇";
    private static JFrame  frame=new JFrame("贪吃蛇");
   public FrameClient(){}

    public static void createWindow(){
        frame=new JFrame("贪吃蛇");
        frame.setSize(width,height);
        frame.setLocation(300,50);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
       frame.setLayout(new BorderLayout());
        JPanel panel=new JPanel();
        panel.setSize(300,400);
        panel.add(addStartButton());
        panel.add(addExitButton());
        frame.add(panel,BorderLayout.SOUTH);


    }

    private static JButton addStartButton(){
        JButton button=new JButton("开始游戏");
        button.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("开始游戏");
            }
        });
        return button;
    }

    private static JButton addExitButton(){
        JButton button=new JButton("退出游戏");
        button.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        return button;
    }

    public static void main(String[] args) {
        FrameClient.createWindow();

    }

}
