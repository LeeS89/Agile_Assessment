public class GrossPay {

    public double TotalGrossPay(double grossSales) throws InvalidValueException
    {
        double commission = grossSales * 0.09;
        double totalPay = commission + 200.00;

        if(grossSales < 100.00 || grossSales > 100000.00) {
            throw new InvalidValueException("Invalid grossSales entered");
        }
        return totalPay;
    }
}
