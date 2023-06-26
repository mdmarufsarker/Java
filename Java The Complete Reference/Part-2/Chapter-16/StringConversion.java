class Box{
    double width;
    double height;
    double depth;

    Box(double w, double h, double d){
        this.width = w;
        this.height = h;
        this.depth = d;
    }

    public String toString(){
        return "Dimensions are " + width + " by " + depth + " by " + height + ".";
    }
}

public class StringConversion {
    public static void main(String[] args) {
        Box b = new Box(10, 12, 14);
        String s = "Box b: " + b;

        System.out.println(b);
        System.out.println(s);
    }
}
