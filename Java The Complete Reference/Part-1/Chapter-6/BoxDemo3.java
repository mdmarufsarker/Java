class Box3{
    double width;
    double height;
    double depth;

    void volume(){
        System.out.print("Volume is ");
        System.out.println(width * height * depth);
    }

    void setDim(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
}

public class BoxDemo3 {
    public static void main(String[] args) {
        Box3 mybox1 = new Box3();
        Box3 mybox2 = new Box3();

        mybox1.setDim(10, 20, 15);
        mybox2.setDim(3, 6, 9);

        mybox1.volume();
        mybox2.volume();
    }
}
