package com.github.isaquesb.bootcamp;

public class Course extends ContentAbstract implements HasXp {

    protected int hours;

    public Course(String id, String title, int hours) {
        super(id, title);
        this.hours = hours;
    }

    @Override
    public int getXp() {
        return this.hours * HasXp.XP_PER_HOUR;
    }
}
