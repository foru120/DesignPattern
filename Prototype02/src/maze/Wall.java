package maze;

public class Wall implements MapSite {
    public Wall() {
    }

    public Wall(Wall wall) {
    }

    @Override
    public void Enter() {

    }

    public Wall clone() {
        return new Wall(this);
    }
}
