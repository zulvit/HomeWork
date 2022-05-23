package HomeWorkMiit.module4.number2;

public class Student extends Human {
    private String facultyNumber;

    public Student(String firstName, String lastName, String facultyNumber) {
        super(firstName, lastName);
        this.setFacultyNumber(facultyNumber);
    }

    private void setFacultyNumber(String facultyNumber) {
        this.facultyNumber = facultyNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "facultyNumber='" + facultyNumber + '\'' +
                '}';
    }
}
