package maze;

import var.Direction;

import java.util.HashMap;
import java.util.Map;

import static var.Direction.*;

public class Room implements MapSite, Cloneable {
    private Map<Direction, MapSite> _sides = new HashMap<>();
    private int _roomNo;

    public Room(int roomNo) {
        this._roomNo = roomNo;
        this._sides.put(NORTH, new Wall());
        this._sides.put(EAST, new Wall());
        this._sides.put(SOUTH, new Wall());
        this._sides.put(WEST, new Wall());
    }

    public MapSite getSide(Direction direction) {
        return this._sides.get(direction);
    }

    public void setSide(Direction direction, MapSite mapSite) {
        this._sides.put(direction, mapSite);
    }

    @Override
    public void Enter() {

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
