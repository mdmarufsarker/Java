abstract class Fig{
    double height;
    double width;

    Fig(double h, double w){
        height = h;
        width = w;
    }

    // area is now an abstract method
    abstract double area();
}

class Rectanglee extends Fig{
    Rectanglee(double h, double w){
        super(h, w);
    }

    // override area for triangle
    double area(){
        System.out.println("Inside area for triangle");
        return height * width / 2;
    }
}

class Trianglee extends Fig{
    Trianglee(double h, double w){
        super(h, w);
    }

    // override area for rectangle
    double area(){
        System.out.println("Inside area for rectangle");
        return height * width;
    }
}

public class AbstractAreas {
    public static void main(String[] args) {
        // Fig f = new Fig(10, 10) // illigal now #abstract class
        Rectanglee r = new Rectanglee(9, 5);
        Trianglee t = new Trianglee(10, 8);

        Fig f;
        f = r;
        System.out.println("Area is = " + f.area());

        f = t;
        System.out.println("Area is = " + f.area());
    }
}
