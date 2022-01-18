package colorcoder;

public enum MajorColors{

    WHITE(0),
    RED(1),
    BLACK(2),
    YELLOW(3),
    VIOLET(4);

    private final int index;

    MajorColors(int index) {
        this.index = index;

    }

    int getIndex() {
        return index;
    }


}
