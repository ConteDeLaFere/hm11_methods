import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1(2024);
        task2(1, LocalDate.now().getYear());
        int days = task3(120);
        if (days == -1) {
            System.out.println("Доставки нет");
        } else {
            System.out.println("Потребуется дней: " + days);
        }
    }

    public static void task1(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.printf("%d год - високосный год\n", year);
        } else {
            System.out.printf("%d год - невисокосный год\n", year);
        }
    }

    public static void task2(int operatingSystem, int year) {
        if (operatingSystem > 1 || operatingSystem < 0) {
            throw new IllegalArgumentException("Нет такой ОС");
        }
        int clientDeviceYear = 2015;
        if (year >= clientDeviceYear) {
            if (operatingSystem == 0) {
                System.out.println("Устанавливается приложение на IOS");
            } else {
                System.out.println("Устанавливается приложение на Android");
            }
        } else {
            if (operatingSystem == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
    }

    public static int task3(int deliveryDistance) {
        if (deliveryDistance < 20) {
            return 1;
        } else if (deliveryDistance < 60) {
            return 2;
        } else if (deliveryDistance < 100) {
            return 3;
        } else {
            return -1;
        }
    }
}