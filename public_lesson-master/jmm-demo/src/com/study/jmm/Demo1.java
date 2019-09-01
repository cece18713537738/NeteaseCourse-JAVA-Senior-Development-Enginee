package com.study.jmm;

import java.util.concurrent.TimeUnit;

/** JAVA程序运行梳理 */
public class Demo1 {
    // 状态标识
    private static boolean is = true;

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (Demo1.is) {
                    /*
                     * synchronized (this) { i++; }
                     */
                    i++;
                }
                System.out.println(i);
            }

        }).start();

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Demo1.is = false; // 设置is为false，使上面的线程结束while循环
        System.out.println("被置为false了.");

    }
}
