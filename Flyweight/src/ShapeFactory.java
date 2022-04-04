import java.util.HashMap;

public class ShapeFactory {
    private static final HashMap<String, Circle> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);

        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("==== 새로운 객체 생성 : " + color + "색 원 ====");
        }

        return circle;
    }
}
