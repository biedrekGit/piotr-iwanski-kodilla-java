package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publisher.SnapchatPublisher;
import com.kodilla.patterns.strategy.social.publisher.TwitterPublisher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User katarzyna = new Millenials("Katarzyna");
        User wiola = new YGeneration("Wiola");
        User dzesika = new ZGeneration("Dżesika");

        //When
        String katarzynaShares = katarzyna.sharePost();
        System.out.println("Katarzyna shares on " + katarzynaShares);
        String wiolaShares = wiola.sharePost();
        System.out.println("Wiola shares on " + wiolaShares);
        String dzesikaShares = dzesika.sharePost();
        System.out.println("Dżesika shares on " + dzesikaShares);

        //Then
        assertEquals("Facebook", katarzynaShares);
        assertEquals("Snapchat", wiolaShares);
        assertEquals("Twitter", dzesikaShares);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User katarzyna = new Millenials("Katarzyna");

        //When
        String katarzynaShares = katarzyna.sharePost();
        System.out.println("Katarzyna shares on " + katarzynaShares);
        katarzyna.setSocialPublisher(new SnapchatPublisher());
        katarzynaShares = katarzyna.sharePost();
        System.out.println("Katarzyna now shares on " + katarzynaShares);
        katarzyna.setSocialPublisher(new TwitterPublisher());
        katarzynaShares = katarzyna.sharePost();
        System.out.println("Katarzyna finally shares on " + katarzynaShares);

        //Then
        assertEquals("Twitter", katarzynaShares);
    }
}
