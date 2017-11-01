package com.bingo.code.example.interrupt;

class ATask implements Runnable{
  
    private double d = 0.0;  
      
    public void run() {  
        //死循环执行打印"I am running!" 和做消耗时间的浮点计算  
        while (true) {  
            System.out.println("I am running!");  
              
            for (int i = 0; i < 900000; i++) {  
                d =  d + (Math.PI + Math.E) / d;  
            }  
            //给线程调度器可以切换到其它进程的信号  
            Thread.yield();  
        }  
    }  
}

class ATask1 implements Runnable{

    private double d = 0.0;

    public void run() {
        //死循环执行打印"I am running!" 和做消耗时间的浮点计算
        try {
            while (true) {
                System.out.println("I am running!");

                for (int i = 0; i < 900000; i++) {
                    d =  d + (Math.PI + Math.E) / d;
                }
                //休眠一断时间,中断时会抛出InterruptedException
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("ATask.run() interrupted!");
        }
    }
}

class ATask2 implements Runnable{

    private double d = 0.0;

    public void run() {

        //检查程序是否发生中断
        while (!Thread.interrupted()) {
            System.out.println("I am running!");

            for (int i = 0; i < 900000; i++) {
                d = d + (Math.PI + Math.E) / d;
            }
        }

        System.out.println("ATask.run() interrupted!");
    }
}

class ATask3 implements Runnable{

    private double d = 0.0;

    public void run() {

        /*
        在point1之前处point2之后发生中断会产生两种不同的结果，可以通过修改InterruptTaskTest main()里的Thread.sleep()的时间来达到在point1之前产生中断或在point2之后产生中断.
        如果在point1之前发生中断，程序会在调用Thread.sleep()时抛出InterruptedException从而结束线程．这和在Thread.sleep()时被中断是一样的效果.
         */
        try {
            //检查程序是否发生中断
            while (!Thread.interrupted()) {
                System.out.println("I am running!");
                //point1 before sleep
                Thread.sleep(20);
                //point2 after sleep
                System.out.println("Calculating");
                for (int i = 0; i < 900000; i++) {
                    d = d + (Math.PI + Math.E) / d;
                }
            }

        } catch (InterruptedException e) {
            System.out.println("Exiting by Exception");
        }

        System.out.println("ATask.run() interrupted!");
    }
}

public class InterruptTaskTest {  
      
    public static void main(String[] args) throws Exception{  
        //将任务交给一个线程执行  
        Thread t = new Thread(new ATask());  
        t.start();  
          
        //运行一断时间中断线程  
        Thread.sleep(100);  
        System.out.println("****************************");  
        System.out.println("Interrupted Thread!");  
        System.out.println("****************************");  
        t.interrupt();  
    }  
}   