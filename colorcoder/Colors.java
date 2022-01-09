package colorcoder;

public enum Colors {

    //Major colors set
    WHITE(0, "Major"),
    RED(1,"Major"),
    BLACK(2,"Major"),
    YELLOW(3,"Major"),
    VIOLET(4,"Major"),

    //Minor colors set
    BLUE(0, "Minor"),
    ORANGE(1,"Minor"),
    GREEN(2,"Minor"),
    BROWN(3,"Minor"),
    SLATE(4,"Minor");
    private final int index;
    private final String state;

    Colors(int index, String state) {
        this.index = index;
        this.state = state;
    }

    int getIndex() {
        return index;
    }

    String getState(){
        return state;
    }

    public static Colors fromIndex(int index) {
        for (Colors color : Colors.values()) {
            if (color.getIndex() == index) {
                return color;
            }
        }
        return null;
    }

}
