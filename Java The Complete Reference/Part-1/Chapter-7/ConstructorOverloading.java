class Box{
    double width;
    double height;
    double depth;

    // constructor used when all dimensions specified
    Box(double width, double height, double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // constructor used when no dimensions specified
    Box(){
        width = -1;
        height = -1;
        depth = -1;
    }

    // constructor used when cube is created
    Box(double len){
        width = height = depth = len;
    }

    // compute and return volume
    double volume(){
        return width * height * depth;
    }
}

public class ConstructorOverloading {
    public static void main(String[] args){
        Box obj1 = new Box(10, 20, 15);
        Box obj2 = new Box();
        Box obj3 = new Box(7);

        double vol;

        // get volume of first box
        vol = obj1.volume();
        System.out.println("Volume of Box1 = " + vol);

        // get volume of second box
        vol = obj2.volume();
        System.out.println("Volume of Box2 = " + vol);

        // get volume of cube
        vol = obj3.volume();
        System.out.println("Volume of Box3 = " + vol);
    }    
}
