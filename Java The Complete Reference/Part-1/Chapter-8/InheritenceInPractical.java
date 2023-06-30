class Box{
    double width;
    double height;
    double depth;

    Box(Box ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    Box(){
        width = -1;
        height = -1;
        depth = -1;
    }

    Box(double len){
        width = height = depth = len;
    }

    double volume(){
        return width * height * depth;
    }
}

class BoxWeight extends Box{
    double weight;

    BoxWeight(BoxWeight ob){
        super(ob);
        weight = ob.weight;
    }

    BoxWeight(double w, double h, double d, double m){
        super(w, h, d);
        weight = m;
    }

    BoxWeight(){
        super();
        weight = -1;
    }

    BoxWeight(double len, double m){
        super(len);
        weight = m;
    }
}

public class InheritenceInPractical {
    public static void main(String[] args) {
        BoxWeight myBox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight myBox2 = new BoxWeight(2, 3, 4, 0.076);
        double vol;
        vol = myBox1.volume();
        System.out.println("Volume of myBox1 is " + vol);
        System.out.println("Weight of myBox1 is " + myBox1.weight);
        System.out.println();
        vol = myBox2.volume();
        System.out.println("Volume of myBox2 is " + vol);
        System.out.println("Weight of myBox2 is " + myBox2.weight);
    }
}
