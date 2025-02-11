package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CalculateStatisticsTestSuite {

    @Mock
    private Statistics statisticsMock;

    private List<String> generateListOfNUsers(int usersQuantity) {
        List<String> resultList = new ArrayList<>();
        for (int n = 1; n <= usersQuantity; n++) {
            String theUser = "User" + n;
            resultList.add(theUser);
        }
        return resultList;
    }

    @Test
    void testCalculateStatistic0Posts() {
        //Given
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        List<String> fiveUsers = generateListOfNUsers(5);
        when(statisticsMock.usersNames()).thenReturn(fiveUsers);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        int expectedAveragePostsPerUser = 0;
        int expectedAverageCommentsPerUser = 0;
        int expectedAverageCommentsPerPost = 0;

        //Then
        assertEquals(expectedAveragePostsPerUser, calculateStatistics.getAveragePostsPerUser());
        assertEquals(expectedAverageCommentsPerUser, calculateStatistics.getAverageCommentsPerUser());
        assertEquals(expectedAverageCommentsPerPost, calculateStatistics.getAverageCommentsPerPost());
    }

    @Test
    void testCalculateStatistic1000Posts0Comments() {
        //Given
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        List<String> fiveUsers = generateListOfNUsers(5);
        when(statisticsMock.usersNames()).thenReturn(fiveUsers);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(0);

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        int expectedAveragePostsPerUser = 1000 / 5;
        int expectedAverageCommentsPerUser = 0 / 5;
        int expectedAverageCommentsPerPost = 0 / 1000;

        //Then
        assertEquals(expectedAveragePostsPerUser, calculateStatistics.getAveragePostsPerUser());
        assertEquals(expectedAverageCommentsPerUser, calculateStatistics.getAverageCommentsPerUser());
        assertEquals(expectedAverageCommentsPerPost, calculateStatistics.getAverageCommentsPerPost());
    }

    @Test
    void testCalculateStatistic1000Posts500Comments() {
        //Given
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        List<String> fiveUsers = generateListOfNUsers(5);
        when(statisticsMock.usersNames()).thenReturn(fiveUsers);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(500);

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        int expectedAveragePostsPerUser = 1000 / 5;
        int expectedAverageCommentsPerUser = 500 / 5;
        int expectedAverageCommentsPerPost = 500 / 1000;

        //Then
        assertEquals(expectedAveragePostsPerUser, calculateStatistics.getAveragePostsPerUser());
        assertEquals(expectedAverageCommentsPerUser, calculateStatistics.getAverageCommentsPerUser());
        assertEquals(expectedAverageCommentsPerPost, calculateStatistics.getAverageCommentsPerPost());
    }

    @Test
    void testCalculateStatistic1000Posts1500Comments() {
        //Given
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        List<String> fiveUsers = generateListOfNUsers(5);
        when(statisticsMock.usersNames()).thenReturn(fiveUsers);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(1500);

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        int expectedAveragePostsPerUser = 1000 / 5;
        int expectedAverageCommentsPerUser = 1500 / 5;
        int expectedAverageCommentsPerPost = 1500 / 1000;

        //Then
        assertEquals(expectedAveragePostsPerUser, calculateStatistics.getAveragePostsPerUser());
        assertEquals(expectedAverageCommentsPerUser, calculateStatistics.getAverageCommentsPerUser());
        assertEquals(expectedAverageCommentsPerPost, calculateStatistics.getAverageCommentsPerPost());
    }

    @Test
    void testCalculateStatistic0Users() {
        //Given
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        List<String> noUsers = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(noUsers);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        int expectedAveragePostsPerUser = 0;
        int expectedAverageCommentsPerUser = 0;
        int expectedAverageCommentsPerPost = 0;

        //Then
        assertEquals(expectedAveragePostsPerUser, calculateStatistics.getAveragePostsPerUser());
        assertEquals(expectedAverageCommentsPerUser, calculateStatistics.getAverageCommentsPerUser());
        assertEquals(expectedAverageCommentsPerPost, calculateStatistics.getAverageCommentsPerPost());
    }

    @Test
    void testCalculateStatistic100Users() {
        //Given
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        List<String> hundredUsers = generateListOfNUsers(100);
        when(statisticsMock.usersNames()).thenReturn(hundredUsers);
        when(statisticsMock.postsCount()).thenReturn(500);
        when(statisticsMock.commentsCount()).thenReturn(1500);

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        int expectedAveragePostsPerUser = 500 / 100;
        int expectedAverageCommentsPerUser = 1500 / 100;
        int expectedAverageCommentsPerPost = 1500 / 500;

        //Then
        assertEquals(expectedAveragePostsPerUser, calculateStatistics.getAveragePostsPerUser());
        assertEquals(expectedAverageCommentsPerUser, calculateStatistics.getAverageCommentsPerUser());
        assertEquals(expectedAverageCommentsPerPost, calculateStatistics.getAverageCommentsPerPost());
    }


}
