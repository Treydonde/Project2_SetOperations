package project2_SetOperations;

/**
 * Intersection compiles the Intersection of two boolean
 * arrays that are given to it.
 * It processes as a * b which in the code is represented as
 * a && b
 *
 * @author Benjamin Shaw
 */
public class Intersection {

    private boolean[] first = new boolean[10];
    private boolean[] second = new boolean[10];

    /**
     * constructor takes in two boolean arrays
     *
     * @param second
     * @param first
     */
    public Intersection(boolean[] first, boolean[] second) {
        this.first = first;
        this.second = second;
    }

    /**
     * intersection takes both arrays and takes the intersection
     * between both of them.
     *
     * @return intersection
     */
    public boolean[] intersection(){
        boolean[] intersection = new boolean[10];
        for (int i = 0; i < 10; i++){
            // (first && second) == (a * b)
            intersection[i] = first[i] && second[i];
        }
        return intersection;
    }
}