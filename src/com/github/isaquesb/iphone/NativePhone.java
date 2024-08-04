package com.github.isaquesb.iphone;

public class NativePhone implements Phone {
    @Override
    public void call(String number) {
        System.out.println("Calling " + number);
    }

    @Override
    public void handleCall() {
        System.out.println("Handling call");
    }

    @Override
    public void startVoiceMail() {
        System.out.println("Starting voice mail");
    }
}
