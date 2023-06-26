public class USDToBDT implements CurrencyConverter{
    public double convert(double amount){
        return Math.ceil(amount * 108.18 * 100) / 100;
    }
}
