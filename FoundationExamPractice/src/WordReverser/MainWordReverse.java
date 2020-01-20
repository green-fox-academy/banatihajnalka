package WordReverser;

import static WordReverser.WordReverser.wordReverser;

public class MainWordReverse {

    public static void main(String[] args) throws StringDoesNotExists {

        String toBeReversed = "lleW ,enod taht saw ton taht drah";
        String reversedSentence = wordReverser(toBeReversed);

        System.out.println(reversedSentence);
    }
}
