package project2_SetOperations;

public class Union {
    private boolean[] a = new boolean[10];
    private boolean[] b = new boolean[10];

    public boolean[] union(){
        boolean[] c = new boolean[10];
        for (int i = 0; i < 10; i++){
            c[i] = a[i] || b[i];
        }
        return c;
    }
}
