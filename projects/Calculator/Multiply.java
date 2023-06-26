package projects.Calculator;

public class Multiply implements Operate{
    public Double getResult(Double... numbers){
        Double res = 1.0;

        for (Double number : numbers) {
            res *= number;
        }

        return res;
    }
}
