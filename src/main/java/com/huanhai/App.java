package com.huanhai;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        String s = "1sd我f3人3";
        String s1 = "1sd我f3人3";
        char a = '我';
        int i = Integer.parseInt("23");
        StringBuffer c = new StringBuffer();
        c.append("sd我f3人3");
        System.out.println("s".compareTo("1"));
        System.out.println(s.matches(s1));
        System.out.println(i);
    }
}

class Demo9_4 extends JFrame {

    MyPanel mp = null;

    public static void main(String[] args) {

        Demo9_4 demo = new Demo9_4();

    }

    //构造函数
    public Demo9_4() {
        mp = new MyPanel();
        //mp加入到JFrame
        this.add(mp);   // 每定义一个 Demo9_4 都会产生一个对应的this

        //添加监听
        this.addKeyListener(mp);     // 键盘监听这个类所定义的对象  用mp对象进行监听
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }
}
//定义自己的面板

class MyPanel extends JPanel implements KeyListener {
    int x = 10;
    int y = 10;

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLUE);
        g.fillOval(x, y, 20, 20);
    }

    //键被按下
    @Override
    public void keyPressed(KeyEvent arg0) {
        // TODO Auto-generated method stub
        //   System.out.println("键被按下"+(char)arg0.getKeyCode() );
        if (arg0.getKeyCode() == KeyEvent.VK_UP) {
            //System.out.println("键被按上");
            y -= 10;
        }
        if (arg0.getKeyCode() == KeyEvent.VK_DOWN) {
            //System.out.println("键被按上");
            y += 10;

        }
        if (arg0.getKeyCode() == KeyEvent.VK_LEFT) {
            //System.out.println("键被按左");
            x -= 10;
        }
        if (arg0.getKeyCode() == KeyEvent.VK_RIGHT) {
            //System.out.println("键被按右");
            x += 10;
        }
        //调用 repaint() 函数，来重绘制界面
        this.repaint();
    }

    //键被释放
    @Override
    public void keyReleased(KeyEvent arg0) {
        // TODO Auto-generated method stub

    }

    //键的一个值被打印输出
    @Override
    public void keyTyped(KeyEvent arg0) {
        // TODO Auto-generated method stub

    }

}