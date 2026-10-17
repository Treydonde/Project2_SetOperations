package project2_SetOperations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntersectionTest {

    @Test
    void subsetsAreEqual_AndAllTrue() {
        boolean[] first = {
                true, true, true, true, true,
                true, true, true, true, true
        };
        boolean[] second = {
                true, true, true, true, true,
                true, true, true, true, true
        };

        Intersection intersection = new Intersection(first, second);

        boolean[] expected = {
                true, true, true, true, true,
                true, true, true, true, true
        };

        assertArrayEquals(expected, intersection.intersection());
    }

    @Test
    void subsetsAreEqual_AndAllFalse() {
        boolean[] first = {
                false, false, false, false, false,
                false, false, false, false, false
        };
        boolean[] second = {
                false, false, false, false, false,
                false, false, false, false, false
        };

        Intersection intersection = new Intersection(first, second);

        boolean[] expected = {
                false, false, false, false, false,
                false, false, false, false, false
        };

        assertArrayEquals(expected, intersection.intersection());
    }

    @Test
    void subsetsHaveSomeValuesInCommon() {
        boolean[] first = {
                true, false, true, false, true,
                false, true, false, true, false
        };

        boolean[] second = {
                true, true, false, false, true,
                true, false, false, true, true
        };

        Intersection intersection = new Intersection(first, second);

        boolean[] expected = {
                true, false, false, false, true,
                false, false, false, true, false
        };

        assertArrayEquals(expected, intersection.intersection());
    }

    @Test
    void subsetsHaveNoValuesInCommon() {
        boolean[] first = {
                true, true, true, true, true,
                false, false, false, false, false
        };

        boolean[] second = {
                false, false, false, false, false,
                true, true, true, true, true
        };

        Intersection intersection = new Intersection(first, second);

        boolean[] expected = {
                false, false, false, false, false,
                false, false, false, false, false
        };

        assertArrayEquals(expected, intersection.intersection());
    }

    @Test
    void oneSubsetIsAllTrueAndIntersectionEqualsOtherSubset() {
        boolean[] first = {
                true, true, true, true, true,
                true, true, true, true, true
        };

        boolean[] second = {
                true, false, true, false, true,
                false, true, false, true, false
        };

        Intersection intersection = new Intersection(first, second);

        boolean[] expected = {
                true, false, true, false, true,
                false, true, false, true, false
        };

        assertArrayEquals(expected, intersection.intersection());
    }
}