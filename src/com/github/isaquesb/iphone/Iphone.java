package com.github.isaquesb.iphone;

public class Iphone {
    Phone phone;
    MusicPlayer musicPlayer;
    InternetNavigator internetNavigator;

    public Iphone(Phone phone, MusicPlayer musicPlayer, InternetNavigator internetNavigator) {
        this.phone = phone;
        this.musicPlayer = musicPlayer;
        this.internetNavigator = internetNavigator;
    }

    public Phone getPhone() {
        return phone;
    }

    public MusicPlayer getMusicPlayer() {
        return musicPlayer;
    }

    public InternetNavigator getInternetNavigator() {
        return internetNavigator;
    }
}
