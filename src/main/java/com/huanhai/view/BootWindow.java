package com.huanhai.view;

import javax.swing.*;
import java.awt.*;

/**
 * @version 1.0
 * @Description: 主窗口
 * @Author: 覃波
 * @Date: 2019/6/26
 */
public class BootWindow {

   private JFrame frame;

   private int width=800;

   private int height=600;

   private String title="幻海";

   public JFrame createWindow(String titledef){
      if(titledef!=null && !"".equals(titledef)){
         frame=new JFrame(titledef);
      }else {
         frame=new JFrame(title);
      }
      frame.setSize(width,height);
      frame.setLocationRelativeTo(null);
      frame.setBackground(Color.GRAY);
      frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      frame.setVisible(true);
      return frame;
   }

}
