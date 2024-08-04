package com.github.isaquesb.bootcamp;

public class Subscription {
    private String id;
    private Dev dev;
    private Content content;
    private boolean finished = false;

    public Subscription(String id, Dev dev, Content content) {
        this.id = id;
        this.dev = dev;
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public Dev getDev() {
        return dev;
    }

    public Content getContent() {
        return content;
    }

    public boolean isFinished() {
        return finished;
    }

    public void finish() {
        this.finished = true;
        if (this.content instanceof HasXp) {
            this.dev.addXp(((HasXp) this.content).getXp());
        }
    }
}
