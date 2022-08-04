public class Main {
    public static  String getYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return "Год является високосным";
        } else {
            return "Год не является високосным";
        }
    }
    public static String getVersionForOs(int clientOs, int clientDeiceYear ) {
        if (clientOs == 0 && clientDeiceYear >= 2015) {
            return "Установите версию приложения для iOS по ссылке";
        }
        else if (clientOs == 0 && clientDeiceYear < 2015) {
            return "Установите  облегченную версию приложения для iOS по ссылке";
        }
        else if (clientOs == 1 && clientDeiceYear >= 2015) {
            return "Установите версию приложения для Android по ссылке";
        }
        else if (clientOs == 1 && clientDeiceYear < 2015) {
           return "Установите облегченную версию приложения для Android по ссылке";
        }
        return null;
    }
    public static String getDaysForDelivery (int distance) {
        if (distance < 20) {
            return "Потребуется 1 день";
        }
        if (distance >= 20 && distance < 60) {
           return "Потребуется 2 дня";
        }
        if (distance >= 60 && distance < 100) {
            return "Потребуется 3 дня";
        }
        return null;
    }

    public static void main(String[] args) {
    int thisYear = 2022;
        System.out.println(getYear(thisYear));


    int Os=1;
    int DeiceYear = 2018;
        System.out.println(getVersionForOs(Os, DeiceYear));


    int deliveryDistance = 95;
        System.out.println(getDaysForDelivery(deliveryDistance));
    }
}
