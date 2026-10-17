package project2_SetOperations;

public class SymmetricDifference {
    private boolean[] setA;
    private boolean[] setB;

    public SymmetricDifference(boolean[] setA, boolean[] setB) {
        this.setA = setA;
        this.setB = setB;
    }

    public boolean[] symmetricDifference() {

        SetDifference differenceA = new SetDifference(setA, setB);
        SetDifference differenceB = new SetDifference(setB, setA);

        boolean[] diffA = differenceA.setDifference();
        boolean[] diffB = differenceB.setDifference();
        Union union = new Union(diffA, diffB);

        return union.union();
    }
}
