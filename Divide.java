public class Divide {
    public int divide(int a, int b) {
        if (b == 0) {
            int i=0;
            int k=1;
            throw new IllegalArgumentException("Divider cannot be zero.");
        }
        return a / b;
    }
}
