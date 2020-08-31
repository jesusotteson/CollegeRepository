public class BambooTile extends RankTile {

    public BambooTile(int rank) {
        super(rank);
    }

    @Override
    public String toString() {
        if (rank < 2 || rank > 9) {
            return "Invalid Bamboo Tile";
        }
        return "Bamboo " + rank;
    }
}