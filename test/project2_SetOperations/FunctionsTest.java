package project2_SetOperations;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class FunctionsTest {

    private static final float DELTA = 0.0001f;

    private final float[] firstA = {
            0, 0, 0, 0, 0,
            0, 0, 0, 0, 0
    };

    private final float[] secondA = {
            1, 1, 1, 1, 1,
            1, 1, 1, 1, 1
    };

    private final float[] firstB = {
            1, 0, 1, 0, 1,
            0, 1, 0, 1, 0
    };

    private final float[] secondB = {
            0, 1, 1, 0, 0,
            1, 1, 0, 0, 1
    };

    private final float[] firstC = {
            1, 1, 0, 0, 1,
            1, 0, 0, 1, 1
    };

    private final float[] secondC = {
            1, 0, 1, 0, 1,
            0, 1, 0, 1, 0
    };

    /*~~~~~~~~~~~~~~~~~ SET TESTS ~~~~~~~~~~~~~~~~~~~~~~*/
    // -------------------------------------------------
    // Tests for set union
    // -------------------------------------------------

    @Test
    public void testUnionWithAllZerosAndOnes() {
        Functions functions = new Functions(firstA, secondA);

        float[] expected = {
                1, 1, 1, 1, 1,
                1, 1, 1, 1, 1
        };

        assertArrayEquals(expected, functions.union(), DELTA);
    }

    @Test
    public void testUnionBinaryArraysB() {
        Functions functions = new Functions(firstB, secondB);

        float[] expected = {
                1, 1, 1, 0, 1,
                1, 1, 0, 1, 1
        };

        assertArrayEquals(expected, functions.union(), DELTA);
    }

    @Test
    public void testUnionBinaryArraysC() {
        Functions functions = new Functions(firstC, secondC);

        float[] expected = {
                1, 1, 1, 0, 1,
                1, 1, 0, 1, 1
        };

        assertArrayEquals(expected, functions.union(), DELTA);
    }

    // -------------------------------------------------
    // Tests for set intersection
    // -------------------------------------------------

    @Test
    public void testIntersectionWithAllZerosAndOnes() {
        Functions functions = new Functions(firstA, secondA);

        float[] expected = {
                0, 0, 0, 0, 0,
                0, 0, 0, 0, 0
        };

        assertArrayEquals(expected, functions.intersection(), DELTA);
    }

    @Test
    public void testIntersectionBinaryArraysB() {
        Functions functions = new Functions(firstB, secondB);

        float[] expected = {
                0, 0, 1, 0, 0,
                0, 1, 0, 0, 0
        };

        assertArrayEquals(expected, functions.intersection(), DELTA);
    }

    @Test
    public void testIntersectionBinaryArraysC() {
        Functions functions = new Functions(firstC, secondC);

        float[] expected = {
                1, 0, 0, 0, 1,
                0, 0, 0, 1, 0
        };

        assertArrayEquals(expected, functions.intersection(), DELTA);
    }

    // -------------------------------------------------
    // Tests for set difference
    // -------------------------------------------------

    @Test
    public void testDifferenceWithAllZerosAndOnes() {
        Functions functions = new Functions(firstA, secondA);

        float[] expected = {
                0, 0, 0, 0, 0,
                0, 0, 0, 0, 0
        };

        assertArrayEquals(expected, functions.difference(), DELTA);
    }

    @Test
    public void testDifferenceBinaryArraysB() {
        Functions functions = new Functions(firstB, secondB);

        float[] expected = {
                1, 0, 0, 0, 1,
                0, 0, 0, 1, 0
        };

        assertArrayEquals(expected, functions.difference(), DELTA);
    }

    @Test
    public void testDifferenceBinaryArraysC() {
        Functions functions = new Functions(firstC, secondC);

        float[] expected = {
                0, 1, 0, 0, 0,
                1, 0, 0, 0, 1
        };

        assertArrayEquals(expected, functions.difference(), DELTA);
    }

    // -------------------------------------------------
    // Tests for set complement
    // -------------------------------------------------

    @Test
    public void testComplementOfAllZeros() {
        Functions functions = new Functions(firstA, secondA);

        float[] expected = {
                1, 1, 1, 1, 1,
                1, 1, 1, 1, 1
        };

        assertArrayEquals(
                expected,
                functions.complement(firstA),
                DELTA
        );
    }

    @Test
    public void testComplementOfBinaryArrayB() {
        Functions functions = new Functions(firstB, secondB);

        float[] expected = {
                0, 1, 0, 1, 0,
                1, 0, 1, 0, 1
        };

        assertArrayEquals(
                expected,
                functions.complement(firstB),
                DELTA
        );
    }

    @Test
    public void testComplementOfBinaryArrayC() {
        Functions functions = new Functions(firstC, secondC);

        float[] expected = {
                0, 0, 1, 1, 0,
                0, 1, 1, 0, 0
        };

        assertArrayEquals(
                expected,
                functions.complement(firstC),
                DELTA
        );
    }

    // -------------------------------------------------
    // Tests for set symmetricDifference
    // -------------------------------------------------

    @Test
    public void testSymmetricDifferenceWithAllZerosAndOnes() {
        Functions functions = new Functions(firstA, secondA);

        float[] expected = {
                1, 1, 1, 1, 1,
                1, 1, 1, 1, 1
        };

        assertArrayEquals(
                expected,
                functions.symmetricDifference(),
                DELTA
        );
    }

    @Test
    public void testSymmetricDifferenceBinaryArraysB() {
        Functions functions = new Functions(firstB, secondB);

        float[] expected = {
                1, 1, 0, 0, 1,
                1, 0, 0, 1, 1
        };

        assertArrayEquals(
                expected,
                functions.symmetricDifference(),
                DELTA
        );
    }

    @Test
    public void testSymmetricDifferenceBinaryArraysC() {
        Functions functions = new Functions(firstC, secondC);

        float[] expected = {
                0, 1, 1, 0, 0,
                1, 1, 0, 0, 1
        };

        assertArrayEquals(
                expected,
                functions.symmetricDifference(),
                DELTA
        );
    }

    /*~~~~~~~~~~~~~~~~~ FUZZY SET TESTS ~~~~~~~~~~~~~~~~~~~~~~*/
    // -------------------------------------------------
    // Tests for union()
    // -------------------------------------------------

    @Test
    public void testFuzzyUnionCaseOne() {
        float[] first = {
                0.2f, 0.8f, 0.4f, 0.9f, 0.1f,
                0.5f, 0.7f, 0.3f, 0.6f, 0.0f
        };

        float[] second = {
                0.7f, 0.3f, 0.6f, 0.4f, 0.8f,
                0.2f, 0.9f, 0.5f, 0.1f, 1.0f
        };

        Functions functions = new Functions(first, second);

        float[] expected = {
                0.7f, 0.8f, 0.6f, 0.9f, 0.8f,
                0.5f, 0.9f, 0.5f, 0.6f, 1.0f
        };

        assertArrayEquals(expected, functions.union(), DELTA);
    }

    @Test
    public void testFuzzyUnionCaseTwo() {
        float[] first = {
                0.0f, 0.1f, 0.2f, 0.3f, 0.4f,
                0.5f, 0.6f, 0.7f, 0.8f, 1.0f
        };

        float[] second = {
                1.0f, 0.8f, 0.7f, 0.6f, 0.5f,
                0.4f, 0.3f, 0.2f, 0.1f, 0.0f
        };

        Functions functions = new Functions(first, second);

        float[] expected = {
                1.0f, 0.8f, 0.7f, 0.6f, 0.5f,
                0.5f, 0.6f, 0.7f, 0.8f, 1.0f
        };

        assertArrayEquals(expected, functions.union(), DELTA);
    }

    // -------------------------------------------------
    // Tests for intersection()
    // -------------------------------------------------

    @Test
    public void testFuzzyIntersectionCaseOne() {
        float[] first = {
                0.2f, 0.8f, 0.4f, 0.9f, 0.1f,
                0.5f, 0.7f, 0.3f, 0.6f, 0.0f
        };

        float[] second = {
                0.7f, 0.3f, 0.6f, 0.4f, 0.8f,
                0.2f, 0.9f, 0.5f, 0.1f, 1.0f
        };

        Functions functions = new Functions(first, second);

        float[] expected = {
                0.2f, 0.3f, 0.4f, 0.4f, 0.1f,
                0.2f, 0.7f, 0.3f, 0.1f, 0.0f
        };

        assertArrayEquals(expected, functions.intersection(), DELTA);
    }

    @Test
    public void testFuzzyIntersectionCaseTwo() {
        float[] first = {
                0.0f, 0.1f, 0.2f, 0.3f, 0.4f,
                0.5f, 0.6f, 0.7f, 0.8f, 1.0f
        };

        float[] second = {
                1.0f, 0.8f, 0.7f, 0.6f, 0.5f,
                0.4f, 0.3f, 0.2f, 0.1f, 0.0f
        };

        Functions functions = new Functions(first, second);

        float[] expected = {
                0.0f, 0.1f, 0.2f, 0.3f, 0.4f,
                0.4f, 0.3f, 0.2f, 0.1f, 0.0f
        };

        assertArrayEquals(expected, functions.intersection(), DELTA);
    }

    // -------------------------------------------------
    // Tests for complement()
    // -------------------------------------------------

    @Test
    public void testFuzzyComplementCaseOne() {
        float[] first = {
                0.2f, 0.8f, 0.4f, 0.9f, 0.1f,
                0.5f, 0.7f, 0.3f, 0.6f, 0.0f
        };

        float[] second = new float[10];

        Functions functions = new Functions(first, second);

        float[] expected = {
                0.8f, 0.2f, 0.6f, 0.1f, 0.9f,
                0.5f, 0.3f, 0.7f, 0.4f, 1.0f
        };

        assertArrayEquals(
                expected,
                functions.complement(first),
                DELTA
        );
    }

    @Test
    public void testFuzzyComplementCaseTwo() {
        float[] first = {
                0.0f, 0.1f, 0.2f, 0.3f, 0.4f,
                0.5f, 0.6f, 0.7f, 0.8f, 1.0f
        };

        float[] second = new float[10];

        Functions functions = new Functions(first, second);

        float[] expected = {
                1.0f, 0.9f, 0.8f, 0.7f, 0.6f,
                0.5f, 0.4f, 0.3f, 0.2f, 0.0f
        };

        assertArrayEquals(
                expected,
                functions.complement(first),
                DELTA
        );
    }

    /*~~~~~~~~~~~~~~~~~ MULTI-SET TESTS ~~~~~~~~~~~~~~~~~~~~~~*/
    // -------------------------------------------------
    // Tests for union()
    // -------------------------------------------------

    @Test
    public void testMultisetUnionCaseOne() {
        float[] first = {
                1, 0, 2, 3, 0,
                1, 4, 0, 2, 1
        };

        float[] second = {
                0, 2, 1, 1, 3,
                1, 2, 5, 0, 4
        };

        Functions functions = new Functions(first, second);

        float[] expected = {
                1, 2, 2, 3, 3,
                1, 4, 5, 2, 4
        };

        assertArrayEquals(expected, functions.union(), DELTA);
    }

    @Test
    public void testMultisetUnionCaseTwo() {
        float[] first = {
                0, 1, 0, 2, 4,
                3, 1, 2, 5, 0
        };

        float[] second = {
                2, 0, 1, 2, 1,
                0, 3, 1, 2, 6
        };

        Functions functions = new Functions(first, second);

        float[] expected = {
                2, 1, 1, 2, 4,
                3, 3, 2, 5, 6
        };

        assertArrayEquals(expected, functions.union(), DELTA);
    }

    @Test
    public void testMultisetUnionCaseThree() {
        float[] first = {
                5, 4, 3, 2, 1,
                0, 6, 2, 1, 3
        };

        float[] second = {
                1, 4, 5, 0, 2,
                7, 2, 3, 1, 1
        };

        Functions functions = new Functions(first, second);

        float[] expected = {
                5, 4, 5, 2, 2,
                7, 6, 3, 1, 3
        };

        assertArrayEquals(expected, functions.union(), DELTA);
    }

    // -------------------------------------------------
    // Tests for intersection()
    // -------------------------------------------------

    @Test
    public void testMultisetIntersectionCaseOne() {
        float[] first = {
                1, 0, 2, 3, 0,
                1, 4, 0, 2, 1
        };

        float[] second = {
                0, 2, 1, 1, 3,
                1, 2, 5, 0, 4
        };

        Functions functions = new Functions(first, second);

        float[] expected = {
                0, 0, 1, 1, 0,
                1, 2, 0, 0, 1
        };

        assertArrayEquals(expected, functions.intersection(), DELTA);
    }

    @Test
    public void testMultisetIntersectionCaseTwo() {
        float[] first = {
                0, 1, 0, 2, 4,
                3, 1, 2, 5, 0
        };

        float[] second = {
                2, 0, 1, 2, 1,
                0, 3, 1, 2, 6
        };

        Functions functions = new Functions(first, second);

        float[] expected = {
                0, 0, 0, 2, 1,
                0, 1, 1, 2, 0
        };

        assertArrayEquals(expected, functions.intersection(), DELTA);
    }

    @Test
    public void testMultisetIntersectionCaseThree() {
        float[] first = {
                5, 4, 3, 2, 1,
                0, 6, 2, 1, 3
        };

        float[] second = {
                1, 4, 5, 0, 2,
                7, 2, 3, 1, 1
        };

        Functions functions = new Functions(first, second);

        float[] expected = {
                1, 4, 3, 0, 1,
                0, 2, 2, 1, 1
        };

        assertArrayEquals(expected, functions.intersection(), DELTA);
    }

    // -------------------------------------------------
    // Tests for difference()
    // -------------------------------------------------

    @Test
    public void testMultisetDifferenceCaseOne() {
        float[] first = {
                1, 0, 2, 3, 0,
                1, 4, 0, 2, 1
        };

        float[] second = {
                0, 2, 1, 1, 3,
                1, 2, 5, 0, 4
        };

        Functions functions = new Functions(first, second);

        float[] expected = {
                1, 0, 1, 2, 0,
                0, 2, 0, 2, 0
        };

        assertArrayEquals(expected, functions.difference(), DELTA);
    }

    @Test
    public void testMultisetDifferenceCaseTwo() {
        float[] first = {
                0, 1, 0, 2, 4,
                3, 1, 2, 5, 0
        };

        float[] second = {
                2, 0, 1, 2, 1,
                0, 3, 1, 2, 6
        };

        Functions functions = new Functions(first, second);

        float[] expected = {
                0, 1, 0, 0, 3,
                3, 0, 1, 3, 0
        };

        assertArrayEquals(expected, functions.difference(), DELTA);
    }

    @Test
    public void testMultisetDifferenceCaseThree() {
        float[] first = {
                5, 4, 3, 2, 1,
                0, 6, 2, 1, 3
        };

        float[] second = {
                1, 4, 5, 0, 2,
                7, 2, 3, 1, 1
        };

        Functions functions = new Functions(first, second);

        float[] expected = {
                4, 0, 0, 2, 0,
                0, 4, 0, 0, 2
        };

        assertArrayEquals(expected, functions.difference(), DELTA);
    }

    // -------------------------------------------------
    // Tests for sum()
    // -------------------------------------------------

    @Test
    public void testMultisetSumCaseOne() {
        float[] first = {
                1, 0, 2, 3, 0,
                1, 4, 0, 2, 1
        };

        float[] second = {
                0, 2, 1, 1, 3,
                1, 2, 5, 0, 4
        };

        Functions functions = new Functions(first, second);

        float[] expected = {
                1, 2, 3, 4, 3,
                2, 6, 5, 2, 5
        };

        assertArrayEquals(expected, functions.sum(), DELTA);
    }

    @Test
    public void testMultisetSumCaseTwo() {
        float[] first = {
                0, 1, 0, 2, 4,
                3, 1, 2, 5, 0
        };

        float[] second = {
                2, 0, 1, 2, 1,
                0, 3, 1, 2, 6
        };

        Functions functions = new Functions(first, second);

        float[] expected = {
                2, 1, 1, 4, 5,
                3, 4, 3, 7, 6
        };

        assertArrayEquals(expected, functions.sum(), DELTA);
    }

    @Test
    public void testMultisetSumCaseThree() {
        float[] first = {
                5, 4, 3, 2, 1,
                0, 6, 2, 1, 3
        };

        float[] second = {
                1, 4, 5, 0, 2,
                7, 2, 3, 1, 1
        };

        Functions functions = new Functions(first, second);

        float[] expected = {
                6, 8, 8, 2, 3,
                7, 8, 5, 2, 4
        };

        assertArrayEquals(expected, functions.sum(), DELTA);
    }
}