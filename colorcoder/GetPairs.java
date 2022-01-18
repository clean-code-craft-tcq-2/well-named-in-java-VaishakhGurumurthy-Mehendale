package colorcoder;


import java.util.Arrays;
import java.util.stream.Collectors;

public class GetPairs {


    final static Object MajorColorNames[] =  MajorColors.values();
    final static Object MinorColorNames[] =  MinorColors.values();
    final static int numberOfMinorColors = (int)MinorColorNames.length;



    static ColorPair GetColorFromPairNumber(int pairNumber) {
        int zeroBasedPairNumber = pairNumber - 1;
        MajorColors majorColor = (MajorColors) fromIndex(MajorColorNames,zeroBasedPairNumber / numberOfMinorColors);
        MinorColors minorColor = (MinorColors) fromIndex(MinorColorNames,zeroBasedPairNumber % numberOfMinorColors);
        return new ColorPair(majorColor, minorColor);
    }

    static int GetPairNumberFromColor(MajorColors major, MinorColors minor) {
        return major.getIndex() * numberOfMinorColors + minor.getIndex() + 1;
    }

    static Object fromIndex(Object[] colors,int index){

        if(index > 4){
            return null;
        }
        Object color = colors[index];
        return color;

    }


}
