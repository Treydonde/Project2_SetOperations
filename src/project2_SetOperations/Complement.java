package project2_SetOperations;

public class Complement {
    private boolean[] universe;
    private boolean[] set;

    public Complement(boolean[] universe, boolean[] subset) {
        this.universe = universe;
        this.set = subset;
    }

    public boolean[] complement() {
        boolean[] complement = new boolean[universe.length];
        for (int i = 0; i < universe.length; i++) {
            complement[i] = universe[i] && !set[i];
        }
        return complement;
    }
}
