package project2_SetOperations;

/**
 * Provides set, multiset, and fuzzy-set operations on two arrays.
 *
 * Group 2
 * Gustavo Cabral, Ben Shaw, Camilla Feitosa Nunes
 * Course and section (CS 2430, section ___)
 * Project name (Programming Project 2 – (term) 202_)
 */
public class Functions {

    private float[] first = new float[10];
    private float[] second = new float[10];

    /**
     * constructor with defensive copies
     * @param first
     * @param second
     */
    public Functions(float[] first, float[] second) {
        this.first = first.clone();
        this.second = second.clone();
    }

    /**
     * Calculates the union by taking the larger value
     *
     * @return a new array containing the union
     */
    public float[] union() {

        float[] union = new float[10];

        for (int i = 0; i < 10; i++) {

            union[i] = Math.max(first[i], second[i]);
        }
        return union;
    }

    /**
     * Calculates the intersection by taking the lower value
     *
     * @return a new array containing the intersection
     */
    public float[] intersection() {
        float[] intersection = new float[10];
        for (int i = 0; i < 10; i++)
            intersection[i] = Math.min(first[i], second[i]);

        return intersection;
    }

    /**
     *
     *
     * @return
     */
    public float[] difference() {
        float[] multiDiff = new float[10];
        for (int i = 0; i < 10; i++) {
            multiDiff[i] = Math.max(first[i] - second[i], 0);
        }
        return multiDiff;
    }

    /**
     * Does the complement of the value that is given in
     *
     * @param a
     * @return comp
     */
    public float[] complement(float[] a) {
        float[] result = new float[a.length];

        for (int i = 0; i < a.length; i++) {
            result[i] = 1 - a[i];
        }

        return result;
    }

    /**
     * Returns the symmetric difference of two float arrays
     * @return
     */
    public float[] symmetricDifference() {
        float[] symmDiff = new float[first.length];

        for (int i = 0; i < first.length; i++) {
            symmDiff[i] = Math.abs(first[i] - second[i]);
        }

        return symmDiff;
    }
}