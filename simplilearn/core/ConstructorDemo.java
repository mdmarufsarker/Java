public class ConstructorDemo {
    int width;
    int height;
    int depth;

    ConstructorDemo(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    ConstructorDemo(int width, int height) {
        this.width = width;
        this.height = height;
        this.depth = 0;
    }

    ConstructorDemo(int dimension) {
        this.width = dimension;
        this.height = dimension;
        this.depth = dimension;
    }

    ConstructorDemo() {
        this.width = 0;
        this.height = 0;
        this.depth = 0;
    }

    public int volume() {
        return this.width * this.height * this.depth;
    }

    public static void main(String[] args) {
        ConstructorDemo box1 = new ConstructorDemo(10, 20, 30);
        ConstructorDemo box2 = new ConstructorDemo(10, 20);
        ConstructorDemo box3 = new ConstructorDemo(10);
        ConstructorDemo box4 = new ConstructorDemo();

        System.out.println("Volume of box1: " + box1.volume());
        System.out.println("Volume of box2: " + box2.volume());
        System.out.println("Volume of box3: " + box3.volume());
        System.out.println("Volume of box4: " + box4.volume());
    }
}
// Volume of box1: 6000
// Volume of box2: 0
// Volume of box3: 1000
// Volume of box4: 0