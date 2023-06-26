package AbstractDemo;

public abstract class GraphicObject{
    int x, y;

    GraphicObject() {
        System.out.println("GraphicObject constructor");
    }

    void moveTo(int newX, int newY) {
        System.out.println("Move to: " + newX + ", " + newY);
    }

    abstract void draw();
    abstract void resize();
    public static void main(String[] args) {
          
    }
}
