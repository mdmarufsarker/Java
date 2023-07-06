interface AreaCalculate{
    public void name();
    public void calculateArea();
}

class Circle implements AreaCalculate{
    private double r;

    Circle(double r){
        this.r = r;
    }

    public void name(){
        System.out.println("Circle");
    }

    public void calculateArea(){
        System.out.println("Area of Circle = " + (3.1416 * r * r));
    }
}

class Rectangle implements AreaCalculate{
    private double l, w;

    Rectangle(double l, double w){
        this.l = l;
        this.w = w;
    }

    public void name(){
        System.out.println("Rectangle");
    }

    public void calculateArea(){
        System.out.println("Area of Rectangle = " + (l * w));
    }
}

class Square implements AreaCalculate{
    private double l;

    Square(double l){
        this.l = l;
    }

    public void name(){
        System.out.println("Square");
    }

    public void calculateArea(){
        System.out.println("Area of Square = " + (l * l));
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        AreaCalculate[] area = new AreaCalculate[3];
        area[0] = new Circle(5);
        area[1] = new Rectangle(5, 10);
        area[2] = new Square(5);

        for(int i = 0; i < 3; i++){
            area[i].name();
            area[i].calculateArea();
        }
    }
}
