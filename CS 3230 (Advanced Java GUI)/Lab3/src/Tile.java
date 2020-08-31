abstract public class Tile {
    public boolean matches(Tile other) {
        return other != null && other.getClass() == this.getClass();
    }
}