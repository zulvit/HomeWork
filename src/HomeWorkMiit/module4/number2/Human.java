package HomeWorkMiit.module4.number2;

public class Human {
    private String firstName;
    private String lastName;

    public Human(String firstName, String lastName) throws Exception {
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }

    private void setFirstName(String firstName) throws Exception {
        if (firstName.length() < 4) {
            throw new Exception("Expected length at least 4 symbols!\n" +
                    "Argument: firstName");
        }
        boolean flag = true;
        char firstSymbol = firstName.charAt(0);
        for (char i = 'A'; i <= 'Z'; i++) {
            if (firstSymbol == i) {
                flag = false;
                break;
            }
        }
        if (flag) throw new Exception("Expected upper case letter! Argument:\n" +
                "firstName");
        this.firstName = firstName;
    }

    private void setLastName(String lastName) throws Exception {
        if (lastName.length() < 3) {
            throw new Exception("Expected upper case letter! Argument: lastName");
        }
        boolean flag = true;
        char firstSymbol = lastName.charAt(0);
        for (char i = 'A'; i <= 'Z'; i++) {
            if (firstSymbol == i) {
                flag = false;
                break;
            }
        }
        if (flag) throw new Exception("Expected upper case letter! Argument:\n" +
                "lastName");
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "First Name: " + firstName + '\n' +
                "Last Name: " + lastName + '\n';
    }
}
