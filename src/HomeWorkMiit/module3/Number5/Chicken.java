package HomeWorkMiit.module3.Number5;

public class Chicken {
    private String name;
    private int age;

    public Chicken(String name, int age) throws Exception {
        setName(name);
        setAge(age);
    }

    private void setName(String name) throws Exception {
        if (name == null || name.equals("") || name.equals(" ")) {
            throw new Exception("Name cannot be empty.");
        } else {
            this.name = name;
        }
    }

    private void setAge(int age) throws Exception {
        if (age < 0 || age > 15) {
            throw new Exception("Age should be between 0 and 15");
        } else {
            this.age = age;
        }
    }

    public String productPerDay() {
        return String.valueOf(calculateProductPerDay());
    }

    private double calculateProductPerDay() {
        if (this.age < 6) return 2;
        if (this.age < 12) return 1;
        return 0.75;
    }

    @Override
    public String toString() {
        return "Chicken " + name
                + " (age " + age + ")" +
                " can produce " + productPerDay() +
                " eggs per day.";
    }
}
