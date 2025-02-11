package com.kodilla.testing.forum.statistics;

import java.util.List;
import java.util.Objects;

public class CalculateStatistics {

    private int usersCount;
    private int postsCount;
    private int commentsCount;
    private int averagePostsPerUser;
    private int averageCommentsPerUser;
    private int averageCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics) {
        List<String> usersNames = statistics.usersNames();
        this.usersCount = usersNames.size();
        this.postsCount = statistics.postsCount();
        this.commentsCount = statistics.commentsCount();
        if (this.usersCount != 0) {
            this.averagePostsPerUser = this.postsCount / this.usersCount;
            this.averageCommentsPerUser = this.commentsCount / this.usersCount;
        }
        if (this.postsCount != 0) {
            this.averageCommentsPerPost = this.commentsCount / this.postsCount;
        }
    }

    public void showStatistics() {
        System.out.println("Users count: " + usersCount);
        System.out.println("Posts count: " + postsCount);
        System.out.println("Comments count: " + commentsCount);
        System.out.println("Average number of posts per user: " + averagePostsPerUser);
        System.out.println("Average number of comments per user: " + averageCommentsPerUser);
        System.out.println("Average number of comments per post: " + averageCommentsPerPost);
    }

    public int getUsersCount() {
        return usersCount;
    }

    public int getPostsCount() {
        return postsCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public int getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public int getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public int getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CalculateStatistics that = (CalculateStatistics) o;
        return usersCount == that.usersCount && postsCount == that.postsCount && commentsCount == that.commentsCount && averagePostsPerUser == that.averagePostsPerUser && averageCommentsPerUser == that.averageCommentsPerUser && averageCommentsPerPost == that.averageCommentsPerPost;
    }

    @Override
    public int hashCode() {
        return Objects.hash(usersCount, postsCount, commentsCount, averagePostsPerUser, averageCommentsPerUser, averageCommentsPerPost);
    }
}
