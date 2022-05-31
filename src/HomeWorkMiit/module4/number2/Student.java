package HomeWorkMiit.module4.number2;

public class Student extends Human {
    private String facultyNumber;

    public Student(String firstName, String lastName, String facultyNumber) throws Exception {
        super(firstName, lastName);
        this.setFacultyNumber(facultyNumber);
    }

    private void setFacultyNumber(String facultyNumber) throws Exception {
        if (facultyNumber.length() < 5 || facultyNumber.length() > 10) {
            throw new Exception("Invalid faculty number!");
        }
        this.facultyNumber = facultyNumber;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Faculty number: " + facultyNumber + '\n';
    }
}
