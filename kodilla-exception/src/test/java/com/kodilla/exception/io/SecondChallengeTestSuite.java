package com.kodilla.exception.io;

import com.kodilla.exception.test.SecondChallenge;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SecondChallengeTestSuite {

    @Test
    void testProbablyIWillThrowException() {
        // given
        SecondChallenge secondChallenge = new SecondChallenge();

        // when & then
        assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.9, 1.4));
        assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.0, 1.6));
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1.5, 1.5));
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2.0, 1.0));

    }
}
