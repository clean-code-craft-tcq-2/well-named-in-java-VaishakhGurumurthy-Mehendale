package colorcoder;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GetPairs {


    final static Object MajorColorNames[] =  Arrays.stream(Colors.values()).filter(it -> it.getState()=="Major").toArray();
    final static Object MinorColorNames[] =  Arrays.stream(Colors.values()).filter(it -> it.getState()=="Minor").toArray();
    final static int numberOfMinorColors = (int)MinorColorNames.length;



    static ColorPair GetColorFromPairNumber(int pairNumber) {
        int zeroBasedPairNumber = pairNumber - 1;
        Colors majorColor =
                Colors.fromIndex(zeroBasedPairNumber / numberOfMinorColors);
        Colors minorColor =
                Colors.fromIndex(zeroBasedPairNumber % numberOfMinorColors);
        return new ColorPair(majorColor, minorColor);
    }

    static int GetPairNumberFromColor(Colors major, Colors minor) {
        return major.getIndex() * numberOfMinorColors + minor.getIndex() + 1;
    }


}
