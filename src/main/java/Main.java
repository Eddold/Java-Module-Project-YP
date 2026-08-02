
// Пользовался ИИ только когда путался с фигурными скобками и порядками команд, были ошибки где некоторые команды должны были быть внутри цикла. Только в этом случае попросил ИИ подстроить мой код правильно
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
                    scanner.nextLine(); // очищаем буфер

                    if (carSpeed > 0 && carSpeed <= 250) {
                        break;
                    } else {
                        System.out.println("Ошибка: скорость должна быть от 1 до 250 км/ч.");
                    }
                } else {
                    System.out.println("Ошибка: введите число.");
                    scanner.nextLine(); // очищаем неверный ввод
                }
            }

            Car car = new Car(carName, carSpeed);
            race.leader(car);
        }

        System.out.println("Самая быстрая машина: " + race.winner);
    }
}