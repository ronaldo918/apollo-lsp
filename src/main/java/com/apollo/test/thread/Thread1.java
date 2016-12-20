package com.apollo.test.thread;

/**
 * Created by yp-tc-2651 on 16/12/16.
 */
public class Thread1 extends Thread {


    private int countNumber;

    public Thread1() {
    }


    public void run() {
        System.out.println("thread:" + Thread.currentThread().getName() + ",run.");
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + countNumber++);
            try {
                Thread.sleep((int) Math.random() * 100 );
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("thread:" + Thread.currentThread().getName() + ",end.");
    }

    public static void main(String[] args) {

        Thread1 thread1 = new Thread1();
        Thread1 thread2 = new Thread1();
        thread1.setName("A");
        thread2.setName("B");
        thread1.start();
        thread2.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName() + " thread: end.");
    }
}
