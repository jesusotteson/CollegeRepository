public class CircleTile extends RankTile {
    public CircleTile(int rank) {
        super(rank);
    }

    @Override
    public String toString() {
        if (rank > 9 || rank < 1) return "Invalid Circle Tile";
        return "Circle " + rank;
    }
}