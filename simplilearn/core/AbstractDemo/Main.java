package AbstractDemo;

public class Main {
    public static void main(String[] args) {
        // GraphicObject[] objects = {new Rectangle(), new Circle()};
        // for (GraphicObject object : objects) {
        //     object.draw();
        //     object.resize();
        // }

        Rectangle r = new Rectangle();
        r.draw();
        r.resize();

        Circle c = new Circle();
        c.draw();
        c.resize();
    }
}
// GraphicObject constructor
// Draw a rectangle
// Resize a rectangle
// GraphicObject constructor
// Draw a circle
// Resize a circle




// java doesn't support multiple inheritance, so you can't extend multiple classes. But you can implement multiple interfaces. You can also extend a class and implement an interface at the same time.