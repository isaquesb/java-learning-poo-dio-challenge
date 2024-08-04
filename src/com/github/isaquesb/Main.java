package com.github.isaquesb;

import com.github.isaquesb.bootcamp.*;

public class Main {
    public static void main(String[] args) {

        Course gitCourse = new Course("git", "GIT", 10);
        Course javaCourse = new Course("java", "Java", 10);
        Bootcamp bootcamp = new Bootcamp("1", "Java Bootcamp");
        bootcamp
            .addCourse(javaCourse)
            .addCourse(gitCourse);

        Dev dev = new Dev("isaque", "Isaque", 0);
        Subscription sub = dev.subscribe(bootcamp);


        System.out.printf("Dev %s subscribed to %s\n", dev.getName(), bootcamp.getTitle());
        System.out.println();

        sub.finish();

        System.out.printf("Dev %s finished %s\n", dev.getName(), bootcamp.getTitle());
        System.out.printf("Dev %s has %d XP\n", dev.getName(), dev.getXp());
    }
}
