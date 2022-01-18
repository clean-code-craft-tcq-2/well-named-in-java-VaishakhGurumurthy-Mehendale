package colorcoder;


import static colorcoder.TestPairs.testNumberToPair;
import static colorcoder.TestPairs.testPairToNumber;

public class Main {

    public static void main(String[] args) {
        testNumberToPair(4, MajorColors.WHITE, MinorColors.BROWN);
        testNumberToPair(5, MajorColors.WHITE, MinorColors.SLATE);

        testPairToNumber(MajorColors.BLACK, MinorColors.ORANGE, 12);
        testPairToNumber(MajorColors.VIOLET, MinorColors.SLATE, 25);
    }
}
