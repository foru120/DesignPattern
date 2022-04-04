public class Rectangle extends Shape {
    public Rectangle(Drawing drawing) {
        super(drawing);
    }

    @Override
    public void draw() {
        System.out.println("Rect draw extend");
    }
}
