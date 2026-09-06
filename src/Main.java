//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int clientOS = 1; // Изменить значение для теста

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        int clientOS2 = 0; // Изменить значение для теста
        int clientDeviceYear = 2014; // Изменить значение для теста

        if (clientDeviceYear < 2015) {
            if (clientOS2 == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (clientOS2 == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else {
            if (clientOS2 == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (clientOS2 == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }

        int year = 2021; // Изменить значение для теста

        if (year > 1584 && ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))) {
            System.out.println(year + " год является високосным");
        } else if (year > 1584) {
            System.out.println(year + " год не является високосным");
        } else {
            System.out.println("Год не может быть меньше 1585");
        }

        int deliveryDistance = 95; // Изменить значение для теста
        int deliveryDays = 0;

        if (deliveryDistance <= 20) {
            deliveryDays = 1;
        } else if (deliveryDistance <= 60) {
            deliveryDays = 2;
        } else if (deliveryDistance <= 100) {
            deliveryDays = 3;
        } else {
            System.out.println("Доставка недоступна");
        }
        System.out.println("Потребуется дней: " + deliveryDays);

        int monthNumber = 12; // Изменить значение для теста

        switch (monthNumber) {
            // Зимние месяцы
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;

            // Весенние месяцы
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;

            // Летние месяцы
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;

            // Осенние месяцы
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;

            default:
                System.out.println("Некорректный номер месяца");
                break;
        }
    }
}