package colorcoder;


import static colorcoder.GetPairs.MajorColorNames;
import static colorcoder.GetPairs.MinorColorNames;

public class ColorPair {

    private MajorColors majorColor;
    private MinorColors minorColor;

    public ColorPair(MajorColors major, MinorColors minor) {
        majorColor = major;
        minorColor = minor;
    }

    public MajorColors getMajor() {
        return majorColor;
    }

    public MinorColors getMinor() {
        return minorColor;
    }

    String ToString() {
        String colorPairStr = MajorColorNames[majorColor.getIndex()].toString();
        colorPairStr += " ";
        colorPairStr += MinorColorNames[minorColor.getIndex()].toString();
        return colorPairStr;
    }
}
