class Box1{
    double width;
    double height;
    double depth;
}

public class BoxDemo1 {
    public static void main(String[] args) {
        Box1 mybox1 = new Box1();
        Box1 mybox2 = new Box1();
        double vol1, vol2;

        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        vol1 = mybox1.width * mybox1.height * mybox1.depth;
        vol2 = mybox2.width * mybox2.height * mybox2.depth;

        System.out.println("Volume is " + vol1);
        System.out.println("Volume is " + vol2);
    }
}
