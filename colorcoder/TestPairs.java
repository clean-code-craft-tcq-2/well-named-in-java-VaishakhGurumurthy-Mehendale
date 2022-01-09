package colorcoder;

import static colorcoder.GetPairs.GetColorFromPairNumber;
import static colorcoder.GetPairs.GetPairNumberFromColor;

public class TestPairs {


    static void testNumberToPair(int pairNumber,
                                 Colors expectedMajor,
                                 Colors expectedMinor) {
        ColorPair colorPair = GetColorFromPairNumber(pairNumber);
        System.out.println("Got pair " + colorPair.ToString());
        assert (colorPair.getMajor() == expectedMajor);
        assert (colorPair.getMinor() == expectedMinor);

    }

    static void testPairToNumber(
            Colors major,
            Colors minor,
            int expectedPairNumber) {
        int pairNumber = GetPairNumberFromColor(major, minor);
        System.out.println("Got pair number " + pairNumber);
        assert (pairNumber == expectedPairNumber);
    }

}
