package project2_SetOperations;

/**
 * SetDifference compiles the set difference of two boolean
 * arrays that are given to it.
 * It processes as a - b which in the code is represented as
 * a || !b
 *
 * @author Benjamin Shaw
 */
public class SetDifference {

    private boolean[] first = new boolean[10];
    private boolean[] second = new boolean[10];

    /**
     * constructor takes in two boolean arrays
     *
     * @param second
     * @param first
     */
    public SetDifference(boolean[] second, boolean[] first) {
        this.second = second;
        this.first = first;
    }

    /**
     * setDifference takes both arrays and takes the set
     * difference between both of them.
     *
     * @return setDiff
     */
    public boolean[] setDifference(){
        boolean[] setDiff = new boolean[10];
        for (int i = 0; i < 10; i++){
            // (first || !second) == (a - b)
            setDiff[i] = first[i] && !second[i];
        }
        return setDiff;
    }
}