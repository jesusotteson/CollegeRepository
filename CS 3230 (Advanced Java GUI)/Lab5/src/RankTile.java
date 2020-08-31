public class RankTile extends Tile {

	private static final long serialVersionUID = 1L;
	protected int rank;

    public RankTile(int rank) {
        this.rank = rank;
    }

    public boolean matches(Tile otherTile) {
        return super.matches(otherTile) && this.rank == ((RankTile) otherTile).rank;
    }
}