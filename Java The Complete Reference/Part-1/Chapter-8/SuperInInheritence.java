class Boox{
    double width;
    double height;
    double depth;

    // Construct clone of an object
    Boox(Boox ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // Constructor used when all dimensions specified
    Boox(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    // Constructor used when no dimensions specified
    Boox(){
        width = -1;
        height = -1;
        depth = -1;
    }

    // Constructor used when cube is created
    Boox(double len){
        width = height = depth = len;
    }

    // Compute and return volume
    double volume(){
        return width * height * depth;
    }
}

class BooxWeight extends Boox{
    double weight;

    // Construct clone of an object
    BooxWeight(BooxWeight ob){
        super(ob);
        weight = ob.weight;
    }

    // Constructor when all parameters are specified
    BooxWeight(double w, double h, double d, double m){
        super(w, h, d);
        weight = m;
    }

    // Default constructor
    BooxWeight(){
        super();
        weight = -1;
    }

    // Constructor used when cube is created
    BooxWeight(double len, double m){
        super(len);
        weight = m;
    }
}

public class SuperInInheritence {
    public static void main(String[] args) {
        BooxWeight myBox1 = new BooxWeight(10, 20, 15, 34.3);
        BooxWeight myBox2 = new BooxWeight(2, 3, 4, 0.076);
        BooxWeight myBox3 = new BooxWeight();
        BooxWeight myCube = new BooxWeight(3, 2);
        BooxWeight myClone = new BooxWeight(myBox1);

        double vol;

        vol = myBox1.volume();
        System.out.println("Volume of myBox1 is " + vol);
        System.out.println("Weight of myBox1 is " + myBox1.weight);
        System.out.println();

        vol = myBox2.volume();
        System.out.println("Volume of myBox2 is " + vol);
        System.out.println("Weight of myBox2 is " + myBox2.weight);
        System.out.println();

        vol = myBox3.volume();
        System.out.println("Volume of myBox3 is " + vol);
        System.out.println("Weight of myBox3 is " + myBox3.weight);
        System.out.println();

        vol = myClone.volume();
        System.out.println("Volume of myClone is " + vol);
        System.out.println("Weight of myClone is " + myClone.weight);
        System.out.println();

        vol = myCube.volume();
        System.out.println("Volume of myCube is " + vol);
        System.out.println("Weight of myCube is " + myCube.weight);
        System.out.println();
    }
}