import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        String champion = "";
        for (int i = 1; !StdIn.isEmpty(); i++) {
            String candidate = StdIn.readString();
            double p = 1.0 / i;
            if (StdRandom.bernoulli(p)) {
                champion = candidate;
            }
        }
        System.out.println(champion);
    }
}
