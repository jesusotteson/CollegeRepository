import java.util.Arrays;

abstract public class PictureTile extends Tile {
    private String name;

    public PictureTile(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        String[] validNames = {"Chrysanthemum", "Orchid", "Plum", "Bamboo", "Spring",
                "Summer", "Fall", "Winter"};
        for (String s : validNames) {
            if(Arrays.asList(validNames).contains(s)) return name;
        }
            return "Invalid Picture Tile";
    }
}