package maze;

public class BombedWall extends Wall {
    private boolean _bomb;

    public BombedWall() {

    }

    public BombedWall(BombedWall bombedWall) {
        super(bombedWall);
        this._bomb = bombedWall._bomb;
    }

    public boolean hasBomb() {
        return false;
    }

    @Override
    public Wall clone() {
        return new BombedWall(this);
    }
}
