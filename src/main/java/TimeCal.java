import java.util.Scanner;

public class TimeCal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the distance: ");
        double distance = scanner.nextDouble();
        System.out.println("Enter the speed: ");
        double speed = scanner.nextDouble();
        System.out.println("Time to reach the destination: " + calTime(distance, speed));
    }

    public static double calTime(double x, double v) {
        return x/v;
    }
}
