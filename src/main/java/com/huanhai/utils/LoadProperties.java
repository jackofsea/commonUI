package com.huanhai.utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @version 1.0
 * @Description: 读取配置文件
 * @Author: 覃波
 * @Date: 2019/7/9
 */
public class LoadProperties {

    private ClassLoader cl = LoadProperties.class.getClassLoader();

    public Properties readPropertiesByClasspath(String fileName) {
        if(fileName==null || "".equals(fileName)){
            fileName="config.properties";
        }
        Properties p = new Properties();
        InputStream in = null;
        try {
            // 可根据不同的方式来获取InputStream
            //方式一：InputStream is=new FileInputStream(filePath);  这种方式需要properties文件的绝对路径
            // in = new BufferedInputStream(new FileInputStream("D:\tanyang\study-demo\example\src\main\java\com\ty\demo\example\properties\test.properties"));
            //方式三：通过PropertiesDemo.class.getClassLoader().getResourceAsStream(fileName)
            //  这个方式要求文件在classpath下
            //in = PropertiesDemo.class.getClassLoader().getResourceAsStream("test.properties");
            if (cl != null) {
                in = cl.getResourceAsStream(fileName);
            } else {
                in = ClassLoader.getSystemResourceAsStream(fileName);
            }
            p.load(in);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return p;
    }

    public static void main(String[] args) {
        new LoadProperties().readPropertiesByClasspath(null);
    }
}
