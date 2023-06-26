public class BDTToUSD implements CurrencyConverter{
    public double convert(double amount){
        return Math.ceil(amount * 0.0092 * 100) / 100;
    }
}
