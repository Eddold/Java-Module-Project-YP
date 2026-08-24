import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Race race = new Race();

        for (int i = 0; i < 3; i++) {

            String carName;

            while (true) {
                System.out.println("Введите название машины №" + (i + 1) + ":");
                carName = scanner.nextLine();

                if (!carName.isEmpty()) {
                    break;
                } else {
                    System.out.println("Ошибка: название не может быть пустым.");
                }
            }

            int carSpeed;

            while (true) {
                System.out.println("Введите скорость машины №" + (i + 1) + ":");

                if (scanner.hasNextInt()) {
                    carSpeed = scanner.nextInt();
                    scanner.nextLine();

                    if (carSpeed > 0 && carSpeed <= 250) {
                        break;
                    } else {
                        System.out.println("Ошибка: скорость должна быть от 1 до 250 км/ч.");
                    }
                } else {
                    System.out.println("Ошибка: введите число.");
                    scanner.nextLine();
                }
            }

            Car car = new Car(carName, carSpeed);
            race.leader(car);
        }

        System.out.println("Самая быстрая машина: " + race.winner);
    }
}
