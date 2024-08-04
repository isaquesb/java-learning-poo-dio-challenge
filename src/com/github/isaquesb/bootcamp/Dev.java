package com.github.isaquesb.bootcamp;

import java.util.LinkedHashSet;

public class Dev {
    private String id;
    private String name;
    private int xp;
    private LinkedHashSet<Subscription> subscriptions = new LinkedHashSet<>();

    public Dev(String id, String name, int xp) {
        this.id = id;
        this.name = name;
        this.xp = xp;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getXp() {
        return xp;
    }

    public void addXp(int xp) {
        this.xp += xp;
    }

    public Subscription subscribe(Content content) {
        Subscription subscription = new Subscription(content.getId() + "-" + this.id, this, content);
        subscriptions.add(subscription);
        return subscription;
    }

    public LinkedHashSet<Subscription> getSubscriptions() {
        return subscriptions;
    }
}
