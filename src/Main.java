public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int monthlyPaymentOneYear = (int) service.calculate(1_000_000,1,9.99);
        System.out.println(monthlyPaymentOneYear);

        int monthlyPaymentTwoYear = (int) service.calculate(1_000_000,2,9.99);
        System.out.println(monthlyPaymentTwoYear);

        int monthlyPaymentThreeYear = (int) service.calculate(1_000_000,3,9.99);
        System.out.println(monthlyPaymentThreeYear);
    }
}