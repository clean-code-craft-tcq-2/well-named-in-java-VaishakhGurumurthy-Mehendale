package colorcoder;


import static colorcoder.TestPairs.testNumberToPair;
import static colorcoder.TestPairs.testPairToNumber;

public class Main {

    public static void main(String[] args) {
        testNumberToPair(4, Colors.WHITE, Colors.BROWN);
        testNumberToPair(5, Colors.WHITE, Colors.SLATE);

        testPairToNumber(Colors.BLACK, Colors.ORANGE, 12);
        testPairToNumber(Colors.VIOLET, Colors.SLATE, 25);
    }
}
