package projects.Calculator;

public class Subtract implements Operate{
    public Double getResult(Double... numbers){
        Double res = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            res -= numbers[i];
        }

        return res;
    }
}
