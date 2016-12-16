package com.apollo.test.thread;

/**
 * Created by yp-tc-2651 on 16/12/16.
 */
public class Thread2 implements Runnable {

    private int countNumber;

    public Thread2() {
    }

    @Override
    public void run() {
        System.out.println("thread:" + Thread.currentThread().getName() + ",run.");
        for (int i = 0; i < 6; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + countNumber++);
            try {
                Thread.sleep((int) Math.random() * 100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("thread:" + Thread.currentThread().getName() + ",end.");
    }

    public static void main(String[] args) {
        Thread2 thread = new Thread2();
        Thread thread1 = new Thread(thread, "C");
        Thread thread2 = new Thread(thread, "D");

        thread1.start();
        thread2.start();
        System.out.println("main thread: end.");

    }
}
