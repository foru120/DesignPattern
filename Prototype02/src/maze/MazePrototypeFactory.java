package maze;

public class MazePrototypeFactory implements MazeFactory {

    private Maze _prototypeMaze;
    private Wall _prototypeWall;
    private Room _prototypeRoom;
    private Door _prototypeDoor;

    public MazePrototypeFactory(Maze maze, Wall wall, Room room, Door door) {
        this._prototypeMaze = maze;
        this._prototypeWall = wall;
        this._prototypeRoom = room;
        this._prototypeDoor = door;
    }

    public Maze makeMaze() throws CloneNotSupportedException {
        return (Maze) _prototypeMaze.clone();
    }

    public Room makeRoom() throws CloneNotSupportedException {
        return (Room) _prototypeRoom.clone();
    }

    public Wall makeWall() throws CloneNotSupportedException {
        return (Wall) _prototypeWall.clone();
    }

    public Door makeDoor(Room r1, Room r2) throws CloneNotSupportedException {
        Door door = (Door) _prototypeDoor.clone();
        door.initialize(r1, r2);
        return door;
    }
}
