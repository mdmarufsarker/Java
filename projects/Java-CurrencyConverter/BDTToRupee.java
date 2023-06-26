public class BDTToRupee implements CurrencyConverter{
    public double convert(double amount){
        return Math.ceil(amount * 0.012 * 100) / 100;
    }
}
