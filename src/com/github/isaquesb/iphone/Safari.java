package com.github.isaquesb.iphone;

public class Safari implements InternetNavigator {
    @Override
    public void openPage(String url) {
        System.out.println("Opening page: " + url);
    }

    @Override
    public void newTab() {
        System.out.println("Opening new tab");
    }

    @Override
    public void refreshPage() {
        System.out.println("Refreshing page");
    }
}
