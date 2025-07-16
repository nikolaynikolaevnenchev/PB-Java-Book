import java.util.Scanner;

public class SpeedInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double speedLimit = Double.parseDouble(scanner.nextLine());
        if (speedLimit <= 10){
            System.out.println("slow");
        }else if (speedLimit > 10 && speedLimit <= 50){
            System.out.println("average");
        }else if (speedLimit > 50 && speedLimit <= 150){
            System.out.println("fast");
        }else if (speedLimit > 150 && speedLimit <= 1000){
            System.out.println("ultra fast");
        }else {
            System.out.println("extremely fast");
        }
    }
}
