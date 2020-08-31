abstract public class RankTile extends Tile {
    protected int rank;

    public RankTile(int rank) {
        this.rank = rank;
    }

    public boolean matches(Tile otherTile) {
        return super.matches(otherTile) && this.rank == ((RankTile) otherTile).rank;
    }
}