package com.github.isaquesb.bootcamp;

public abstract class ContentAbstract implements Content {
    private String id;
    private String title;

    public ContentAbstract(String id, String title) {
        this.id = id;
        this.title = title;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getTitle() {
        return title;
    }
}
