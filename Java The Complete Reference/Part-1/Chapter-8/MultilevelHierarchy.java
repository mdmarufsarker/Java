class Boxx{
    private double width;
    private double height;
    private double depth;

    // construct clone of an object
    Boxx(Boxx ob){
        width = ob.width;
        height = ob.height;
        depth = ob.height;
    }

    // constructor used when all dimension specified
    Boxx(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    // constructor used when no dimension specified
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

class BoxxWeight extends Boxx{
    double weight;

    // construct clone of an object
    BoxxWeight(BoxxWeight ob){
        super(ob);
        weight = ob.weight;
    }

    // constructor used when all parameters are specified
    BoxxWeight(double w, double h, double d, double m){
        super(w, h, d);
        weight = m;
    }

    // default constructor
    BoxxWeight(){
        super();
        weight = -1;
    }

    // constructor used when cube is created
    BoxxWeight(double len, double m){
        super(len);
        weight = m;
    }
}

class Shipment extends BoxxWeight{
    double cost;

    // construct clone of an object
    Shipment(Shipment ob){
        super(ob);
        cost = ob.cost;
    }

    // constructor used when all parameters are specified
    Shipment(double w, double h, double d, double m, double c){
        super(w, h, d, m);
        cost = c;
    }

    // default constructor
    Shipment(){
        super();
        cost = -1;
    }

    // constructor used when cube is created
    Shipment(double len, double m, double c){
        super(len, m);
        cost = c;
    }
}

public class MultilevelHierarchy {
    public static void main(String[] args) {
        Shipment spm1 = new Shipment(10, 20, 15, 10, 3.41);
        Shipment spm2 = new Shipment(2, 3, 4, 0.76, 1.28);

        double vol;

        vol = spm1.volume();
        System.out.println("Volume of shipment 1 is " + vol);
        System.out.println("Weight of shipment 1 is " + spm1.weight);
        System.out.println("Shipping cost: $" + spm1.cost);
        System.out.println();

        vol = spm2.volume();
        System.out.println("Volume of shipment 1 is " + vol);
        System.out.println("Weight of shipment 1 is " + spm2.weight);
        System.out.println("Shipping cost: $" + spm2.cost);
        System.out.println();
    }
}
