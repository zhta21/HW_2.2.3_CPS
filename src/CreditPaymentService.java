public class CreditPaymentService {
    double calculate(int creditAmount,int creditPeriod, double creditRate) {
        double monthlyCreditRate = creditRate / 12 / 100;
        int monthlyCreditPeriod = creditPeriod * 12;
        double creditRatio = monthlyCreditRate + (monthlyCreditRate / (Math.pow((1 + monthlyCreditRate),monthlyCreditPeriod) - 1));
        int monthlyPayment = (int) (creditRatio * creditAmount);
        return monthlyPayment;
    }
}