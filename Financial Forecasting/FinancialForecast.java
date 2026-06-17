public class FinancialForecast {

    static double forecast(double currentValue,
                           double growthRate,
                           int years) {

        // Base Case
        if(years == 0) {
            return currentValue;
        }

        // Recursive Case
        return forecast(
                currentValue,
                growthRate,
                years - 1)
                * (1 + growthRate);
    }

    public static void main(String[] args) {

        double currentValue = 10000;
        double growthRate = 0.10;
        int years = 3;

        double result =
            forecast(
                currentValue,
                growthRate,
                years);

        System.out.println(
            "Future Value = " + result);
    }
}