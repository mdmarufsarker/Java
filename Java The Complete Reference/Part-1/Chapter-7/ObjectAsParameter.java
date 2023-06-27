class Boxx{
    double width;
    double height;
    double depth;

    // notice this constructor. It takes an object of type Boxx
    Boxx(Boxx b){
        width = b.width;
        height = b.height;
        depth = b.depth;
    }

    // constructor used when all dimensions specified
    Boxx(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    // constructor used when no dimensions specified
    Boxx(){
        width = -1;
        height = -1;
        depth = -1;
    }

    // constructor used when cube is created
    Boxx(double len){
        width = height = depth = len;
    }

    // compute and return volume
    double volume(){
        return width * height * depth;
    }
}

public class ObjectAsParameter {
    public static void main(String[] args) {
        Boxx myBoxx1 = new Boxx(10, 20, 15);
        Boxx myBoxx2 = new Boxx();
        Boxx myBoxx3 = new Boxx(7);
        Boxx myClone = new Boxx(myBoxx1);

        double vol;

        // get volume of boxx1
        vol = myBoxx1.volume();
        System.out.println("Box 1, volume = " + vol);

        // get volume of boxx2
        vol = myBoxx2.volume();
        System.out.println("Box 2, volume = " + vol);

        // get volume of cube
        vol = myBoxx3.volume();
        System.out.println("Box 3, volume = " + vol);

        // get volume of clone
        vol = myClone.volume();
        System.out.println("Volume of clone = " + vol); 
    }
}
