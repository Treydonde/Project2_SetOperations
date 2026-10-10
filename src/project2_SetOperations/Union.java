package project2_SetOperations;

/**
 * Union takes a and b and takes the union between both values in
 * the respective arrays.  a[i] + b[i]
 *
 * @author Benajmin Shaw
 */
public class Union {
    private boolean[] first = new boolean[10];
    private boolean[] second = new boolean[10];

    /**
     * constructor takes in two boolean arrays
     *
     * @param first
     * @param second
     */
    public Union(boolean[] first, boolean[] second) {
        this.first = first;
        this.second = second;
    }

    /**
     * union takes the union between both boolean arrays
     *
     * @return a + b
     */
    public boolean[] union() {
        boolean[] union = new boolean[10];
        for (int i = 0; i < 10; i++) {
            // (first || second) == (a + b)
            union[i] = first[i] || second[i];
        }
        return union;
    }
}