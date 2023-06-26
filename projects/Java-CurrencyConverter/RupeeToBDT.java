public class RupeeToBDT implements CurrencyConverter{
    public double convert(double amount){
        return Math.ceil(amount * 1.32 * 100) / 100;
    }
}
