package com.bingo.code.example.decoration;

public class AWorker implements Worker {

    private Worker worker;
    
    //通过些构造函数，AWorker就可以得到具体工种的引用，
    //为下面的doSomething()方法中加入A公司的特殊要求做准备
    public AWorker(Worker worker){
        this.worker = worker;
    }
    
    @Override
    public void doSomething() {
        System.out.println("您好！我是A公司的员工");
        worker.doSomething();
    }

}