package colorcoder;

public enum MinorColors {

    BLUE(0),
    ORANGE(1),
    GREEN(2),
    BROWN(3),
    SLATE(4);

    private final int index;

    MinorColors(int index) {
        this.index = index;
    }

    int getIndex() {
        return index;
    }

}
