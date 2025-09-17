import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/* Random word picker */
public class RandomWord {

    /*
     * Reads a sequence of words from standard input and prints one of those words
     * uniformly at random
     * 
     * @param args sequence of words
     */
    public static void main(String[] args) {

        int index = 0; // keep track of how many words have been read
        String champion = ""; // hold the current randomly selected word

        // This loop runs as long as there are more words to read from standard input
        while (!StdIn.isEmpty()) {
            String word = StdIn.readString();
            boolean update = StdRandom.bernoulli(1.0 / (index + 1));
            // If update is true, replace the current champion with the new word.
            if (update) {
                champion = word;
            }
            index++;
        }
        // Print the randomly selected word
        StdOut.println(champion);
    }

}