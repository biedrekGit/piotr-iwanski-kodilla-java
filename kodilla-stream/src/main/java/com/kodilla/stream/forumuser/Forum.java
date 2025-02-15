package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(1, "User001", 'M', LocalDate.of(1986,1,27), 15));
        userList.add(new ForumUser(2, "User002", 'F', LocalDate.of(1987,12,27), 123));
        userList.add(new ForumUser(3, "User003", 'F', LocalDate.of(1991,2,23), 0));
        userList.add(new ForumUser(4, "User004", 'M', LocalDate.of(1995,4,12), 52));
        userList.add(new ForumUser(5, "User005", 'M', LocalDate.of(2016,6,2), 89));
        userList.add(new ForumUser(6, "User006", 'F', LocalDate.of(2004,11,4), 145));
        userList.add(new ForumUser(7, "User007", 'M', LocalDate.of(2015,5,18), 0));
        userList.add(new ForumUser(8, "User008", 'F', LocalDate.of(1989,4,4), 23));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }
}
