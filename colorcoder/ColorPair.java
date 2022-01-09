package colorcoder;


import static colorcoder.GetPairs.MajorColorNames;
import static colorcoder.GetPairs.MinorColorNames;

public class ColorPair {

    private Colors majorColor;
    private Colors minorColor;

    public ColorPair(Colors major, Colors minor) {
        majorColor = major;
        minorColor = minor;
    }

    public Colors getMajor() {
        return majorColor;
    }

    public Colors getMinor() {
        return minorColor;
    }

    String ToString() {
        String colorPairStr = String.valueOf(MajorColorNames[majorColor.getIndex()]);
        colorPairStr += " ";
        colorPairStr += String.valueOf(MinorColorNames[minorColor.getIndex()]);
        return colorPairStr;
    }
}
