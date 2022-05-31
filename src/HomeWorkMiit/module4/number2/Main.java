package HomeWorkMiit.module4.number2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();

        String[] userOneInfo = input1.split(" ");
        String[] userTwoInfo = input2.split(" ");

        Student student;
        Worker worker;
        try {
            student = new Student(userOneInfo[0], userOneInfo[1], userOneInfo[2]);
            worker = new Worker(userTwoInfo[0], userTwoInfo[1], Double.parseDouble(userTwoInfo[2]), Double.parseDouble(userTwoInfo[3]));
            System.out.print(student);
            System.out.println(worker);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
