import maze.Door;
import maze.Maze;
import maze.Room;

import static var.Direction.EAST;
import static var.Direction.WEST;

public class MazeGame {
    Maze createMaze() {
        Maze maze = new Maze();
        Room r1 = new Room(1);
        Room r2 = new Room(2);
        Door theDoor = new Door(r1, r2);

        maze.addRoom(r1);
        maze.addRoom(r2);

        r1.setSide(EAST, theDoor);
        r2.setSide(WEST, theDoor);

        return maze;
    }
}
