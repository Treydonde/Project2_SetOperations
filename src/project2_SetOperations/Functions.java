package project2_SetOperations;

/**
 *
 *
 * @author Benajamin Shaw
 */
public class Functions {

    private float[] first = new float[10];
    private float[] second = new float[10];

    /**
     *
     * @param first
     * @param second
     */
    public Functions(float[] first, float[] second) {
        this.first = first;
        this.second = second;
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
}
