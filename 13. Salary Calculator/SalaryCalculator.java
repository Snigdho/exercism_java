// https://exercism.org/tracks/java/exercises/salary-calculator

public class SalaryCalculator {

    private static double BASE_SALARY = 1000;
    private static double PENALTY_SALARY_MULTIPLIER = 0.85;
    private static double DEFAULT_SALARY_MULTIPLIER = 1;
    private static int DEFAULT_BONUS_MULTIPLIER = 10;
    private static int ABOVE_20_BONUS_MULTIPLIER = 13;

    public double salaryMultiplier(int daysSkipped) {
        return daysSkipped >= 5
            ? PENALTY_SALARY_MULTIPLIER
            : DEFAULT_SALARY_MULTIPLIER;
    }

    public int bonusMultiplier(int productsSold) {
        return productsSold >= 20
            ? ABOVE_20_BONUS_MULTIPLIER
            : DEFAULT_BONUS_MULTIPLIER;
    }

    public double bonusForProductsSold(int productsSold) {
        return (double) productsSold * this.bonusMultiplier(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double salary =
            BASE_SALARY * this.salaryMultiplier(daysSkipped) +
            this.bonusForProductsSold(productsSold);
        return salary > 2000 ? 2000 : salary;
    }
}
