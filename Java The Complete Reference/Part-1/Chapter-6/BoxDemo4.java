class Box4{
    double width;
    double height;
    double depth;

    Box4(double w, double h, double d){
        this.width = w;
        this.height = h;
        this.depth = d;
    }

    void volume(){
        System.out.print("Volume is ");
        System.out.println(width * height * depth);
    }
}

public class BoxDemo4 {
    public static void main(String[] args) {
        Box4 mybox1 = new Box4(10, 20, 15);
        Box4 mybox2 = new Box4(3, 6, 9);

        mybox1.volume();
        mybox2.volume();
    }
}
