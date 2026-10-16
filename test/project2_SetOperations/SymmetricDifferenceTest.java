package project2_SetOperations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SymmetricDifferenceTest {

    @Test
    void symmetricDifference() {
        boolean[] setA = {
                true, true, true, true, true,
                true, true, true, true, true
        };
        boolean[] setB = {
                true, true, true, true, true,
                true, true, true, true, true
        };

        SymmetricDifference symmDiff = new SymmetricDifference(setA, setB);

        boolean[] expected = {
                true, true, true, true, true,
                true, true, true, true, true
        };

        assertArrayEquals(expected, symmDiff.symmetricDifference());
    }
}