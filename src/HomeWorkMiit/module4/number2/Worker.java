package HomeWorkMiit.module4.number2;

public class Worker extends Human {
    private double weekSalary;
    private double workHoursPerDay;

    public Worker(String firstName, String lastName, double weekSalary, double workHoursPerDay) {
        super(firstName, lastName);
        this.setWeekSalary(weekSalary);
        this.setWorkHoursPerDay(workHoursPerDay);
    }

    private void setWeekSalary(double weekSalary) {
        this.weekSalary = weekSalary;
    }

    private void setWorkHoursPerDay(double workHoursPerDay) {
        this.workHoursPerDay = workHoursPerDay;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "weekSalary=" + weekSalary +
                ", workHoursPerDay=" + workHoursPerDay +
                '}';
    }
}
