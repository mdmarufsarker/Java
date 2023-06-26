public class USDToRupee implements CurrencyConverter{
    public double convert(double amount){
        return Math.ceil(amount * 81.92 * 100) / 100;
    }
}
