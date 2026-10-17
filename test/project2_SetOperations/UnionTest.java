package project2_SetOperations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnionTest {

    @Test
    void unionOfAllTrue_AndAllFalse_ReturnsAllTrue() {
        boolean[] first = {
                true, true, true, true, true,
                true, true, true, true, true
        };
        boolean[] second = {
                false, false, false, false, false,
                false, false, false, false, false
        };

        Union union = new Union(first, second);

        boolean[] expected = {
                true, true, true, true, true,
                true, true, true, true, true
        };

        assertArrayEquals(expected, union.union());
    }

    @Test
    void unionOfAllFalseArrays_ReturnsAllFalse() {
        boolean[] first = {
                false, false, false, false, false,
                false, false, false, false, false
        };

        boolean[] second = {
                false, false, false, false, false,
                false, false, false, false, false
        };

        Union union = new Union(first, second);

        boolean[] expected = {
                false, false, false, false, false,
                false, false, false, false, false
        };

        assertArrayEquals(expected, union.union());
    }

    @Test
    void unionOfAllTrueArrays_ReturnsAllTrue() {
        boolean[] first = {
                true, true, true, true, true,
                true, true, true, true, true
        };

        boolean[] second = {
                true, true, true, true, true,
                true, true, true, true, true
        };

        Union union = new Union(first, second);

        boolean[] expected = {
                true, true, true, true, true,
                true, true, true, true, true
        };

        assertArrayEquals(expected, union.union());
    }

    @Test
    void union_ReturnsTrue_WhenEitherArrayContainsTrue() {
        boolean[] first = {
                true, false, true, false, true,
                false, true, false, true, false
        };

        boolean[] second = {
                false, true, true, false, false,
                true, true, false, false, true
        };

        Union union = new Union(first, second);

        boolean[] expected = {
                true, true, true, false, true,
                true, true, false, true, true
        };

        assertArrayEquals(expected, union.union());
    }
}