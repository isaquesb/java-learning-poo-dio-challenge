package com.github.isaquesb.bootcamp;

import java.util.LinkedHashSet;

public class Bootcamp extends ContentAbstract implements HasXp {

    protected LinkedHashSet<Course> courses = new LinkedHashSet<>();

    public Bootcamp(String id, String title) {
        super(id, title);
    }

    public Bootcamp addCourse(Course course) {
        courses.add(course);
        return this;
    }

    @Override
    public int getXp() {
        return courses.stream().mapToInt(Course::getXp).sum();
    }
}
