package maze;

public class Door implements MapSite {
    private Room _r1;
    private Room _r2;
    private boolean _isOpen;

    public Door() {
    }

    public Door(Door door) {
        this._r1 = door._r1;
        this._r2 = door._r2;
    }

    @Override
    public void Enter() {

    }

    public Room otherSideFrom(Room room) {
        return null;
    }

    public void initialize(Room r1, Room r2) {
        this._r1 = r1;
        this._r2 = r2;
    }

    public Door clone() {
        return new Door(this);
    }
}
