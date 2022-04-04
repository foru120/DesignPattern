public class Circle extends Shape {
    public Circle(Drawing drawing) {
        super(drawing);
    }

    @Override
    public void draw() {
        System.out.println("Circle draw extend");
    }
}
