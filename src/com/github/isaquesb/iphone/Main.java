package com.github.isaquesb.iphone;

public class Main {
    public static void main(String[] args) {
        Phone phone = new NativePhone();
        MusicPlayer musicPlayer = new Ipod();
        InternetNavigator internetNavigator = new Safari();

        Iphone iphone = new Iphone(phone, musicPlayer, internetNavigator);

        iphone.getPhone().call("123456789");
        iphone.getMusicPlayer().selectMusic("music.mp3");
        iphone.getInternetNavigator().openPage("http://www.apple.com");
    }
}
