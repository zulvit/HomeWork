package HomeWorkMiit.module3.number5;

public class Main {
    public static void main(String[] args) {
        try {
            Chicken chicken = new Chicken("Maria", 6);
            System.out.println(chicken);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
