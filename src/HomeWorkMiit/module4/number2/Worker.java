package HomeWorkMiit.module4.number2;

import java.util.Locale;

public class Worker extends Human {
    private double weekSalary;
    private double workHoursPerDay;

    public Worker(String firstName, String lastName, double weekSalary, double workHoursPerDay) throws Exception {
        super(firstName, lastName);
        if (lastName.length() <= 3) throw new Exception("Expected length more than 3 symbols!\n" +
                "Argument: lastName");
        this.setWeekSalary(weekSalary);
        this.setWorkHoursPerDay(workHoursPerDay);
    }

    private void setWeekSalary(double weekSalary) throws Exception {
        if (weekSalary < 10.0d) throw new Exception("Expected value mismatch! Argument:\n" +
                "weekSalary");
        this.weekSalary = weekSalary;
    }

    private void setWorkHoursPerDay(double workHoursPerDay) throws Exception {
        if (workHoursPerDay < 1 || workHoursPerDay > 12) throw new Exception("Expected value mismatch! Argument:\n" +
                "workHoursPerDay");
        this.workHoursPerDay = workHoursPerDay;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Week salary: " + String.format(Locale.UK,"%.2f", weekSalary) + '\n' +
                "Hours per day: " + String.format(Locale.UK,"%.2f", workHoursPerDay) + '\n' +
                "Salary per hour: " + String.format(Locale.UK,"%.2f", weekSalary / (7 * 10)) + '\n';
    }
}
