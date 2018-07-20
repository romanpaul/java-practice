package sequencealignment;

import java.util.Scanner;

/**
 *
 * @author Roman
 */
public class SequenceAlignment {

    public static String[] readSequence() {
        Scanner in = new Scanner(System.in);
        int sequenceLength;

        System.out.print("How many \"letters\" are in the sequence? ");
        sequenceLength = in.nextInt();

        String[] sequence = new String[sequenceLength];

        for (int i = 0; i < sequence.length; i++) {
            System.out.print("What is the next letter in the sequence? ");
            sequence[i] = in.next();

        }
        return sequence;

    }

    public static boolean[] alignSequences(String[] firstSequence, String[] secondSequence) {
        boolean[] results = new boolean[firstSequence.length];
        
        
        for (int i = 0; i < firstSequence.length && i < secondSequence.length; i++) {
            if (firstSequence[i].equals(secondSequence[i])) {
                results[i] = true;
            }
            else {
                results[i] = false;
            }
            double percent = i / results.length * 100;
            System.out.print("The sequences are " + percent + " identical \n");
        }
        return results;
    }


    public static void main(String[] args) {
        String[] firstSequence = readSequence();
        System.out.print("Now let's read in the second sequence. \n");
        String[] secondSequence = readSequence();
        alignSequences(firstSequence, secondSequence);
    }
}
