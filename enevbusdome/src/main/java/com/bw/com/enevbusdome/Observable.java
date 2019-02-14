package com.bw.com.enevbusdome;

public class Observable implements IObservable{
    @Override
    public void register(IObserver iObserver) {

    }

    @Override
    public void cacelRegister(IObserver iObserver) {

    }

    @Override
    public void notifyMsg() {
        System.out.print("发送通知");
        System.out.print("休息哈");
    }

    public  void notifty(){
        System.out.print("hhh");
    }
}
