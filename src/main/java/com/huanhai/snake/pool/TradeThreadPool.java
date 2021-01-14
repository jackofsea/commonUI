package com.huanhai.snake.pool;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 *
 *  核心线程池
 *
 * @author 覃波
 * @version 1.0
 * @date 2020/5/28 19:30
 **/
public class TradeThreadPool {
    /**
     * 线程池数量,和CPU核心数有关
     */
    private int threadSize=17;

    public TradeThreadPool(int threadSize) {
        this.threadSize = threadSize;
    }

    public int getThreadSize() {
        return threadSize;
    }

    public static ThreadPoolExecutor getThreadPool(){
        TradeThreadPool threadPool=new TradeThreadPool(17);
        return new ThreadPoolExecutor(17,threadPool.getThreadSize(),0L, TimeUnit.MILLISECONDS,new LinkedBlockingQueue<Runnable>(),new TradeThreadFactory());
    }



}
