package project2_SetOperations;

/**
 * The function class
 *
 *
 */
public class Functions {

    private float[] first = new float[10];
    private float[] second = new float[10];

    /**
     *
     * @param first
     * @param second
     */
    public Functions() {
        this.first = first;
        this.second = second;
    }

    /**
     *
     * @return
     */
    public float[] union() {

        float[] union = new float[10];

        for (int i = 0; i < 10; i++) {

            union[i] = Math.max(first[i], second[i]);
        }
        return union;
    }

    /**
     *
     * @return
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
            multiDiff[i] = first[i] - second[i];

            multiDiff[i] = (multiDiff[i] < 0) ? 0 : multiDiff[i];
        }
        return multiDiff;
    }

    /**
     * Does the complement of the value that is given in
     *
     * @param comp
     * @return comp
     */
    public float[] complement(float[] comp) {

        for (int i = 0; i < 10; i++) {
            comp[i] = 1 - comp[i];
        }

        return comp;
    }

    public float[] symmetricDifference() {
        float[] symmDiff = new float[first.length];

        for (int i = 0; i < first.length; i++) {
            symmDiff[i] = Math.abs(first[i] - second[i]);
        }

        return symmDiff;
    }
}