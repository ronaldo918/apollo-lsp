package com.apollo.test.thread;

/**
 * Created by yp-tc-2651 on 16/12/20.
 */
public class TestSynchronized {
    public void test1() {
        synchronized (TestSynchronized.class) {
            int i = 5;
            while (i-- > 0) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ie) {
                    ie.printStackTrace();
                }
            }
        }
    }

    public static void test2() {
        synchronized (TestSynchronized.class) {
            System.out.println("test2 start");
            int i = 5;
//            while (i-- > 0) {
            while (i-- > 0) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ie) {
                    ie.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        final TestSynchronized myt2 = new TestSynchronized();
        Thread test1 = new Thread(new Runnable() {
            public void run() {
                myt2.test1();
            }
        }, "test1");
        Thread test2 = new Thread(new Runnable() {
            public void run() {
                myt2.test2();
            }
        }, "test2");
        test1.start();
        test2.start();
//         TestRunnable tr=new TestRunnable();
//         Thread test3=new Thread(tr);
//         test3.start();
    }
}
