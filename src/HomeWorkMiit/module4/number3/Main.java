package HomeWorkMiit.module4.number3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] params = input.split(" ");

        int[] intParams = new int[params.length];
        for (int i = 0; i < params.length; i++) {
            intParams[i] = Integer.parseInt(params[i]);
        }

        switch (params.length) {
            case 1 -> {
                Polygon polygon;
                try {
                    polygon = new Circle(intParams);
                    System.out.println(polygon);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            case 3 -> {
                Polygon polygon;
                try {
                    polygon = new Triangle(intParams);
                    System.out.println(polygon);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            case 4 -> {
                int a = intParams[0]; //side 1
                int b = intParams[1]; //side 2
                int c = intParams[2]; //side 3
                int d = intParams[3]; //side 4
                try {
                    if (a == b && b == c && c == d) {
                        Polygon quadrilateral = new Rhombus(new int[]{a, b, c, d});
                        System.out.println(quadrilateral);
                    } else if (a == c || b == d) {
                        Polygon polygon = new Parallelogram(new int[]{a, b, c, d});
                        System.out.println(polygon);
                    } else {
                        Polygon polygon = new Quadrilateral(new int[]{a, b, c, d});
                        System.out.println(polygon);
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            default -> {
                Polygon polygon;
                try {
                    polygon = new Polygon(intParams);
                    System.out.println(polygon);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
