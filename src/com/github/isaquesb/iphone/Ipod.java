package com.github.isaquesb.iphone;

public class Ipod implements MusicPlayer {
    @Override
    public void play() {
        System.out.println("Playing music on Ipad");
    }

    @Override
    public void pause() {
        System.out.println("Pausing music on Ipad");
    }

    @Override
    public void selectMusic(String musicPath) {
        System.out.println("Selecting music on Ipad: " + musicPath);
    }
}
