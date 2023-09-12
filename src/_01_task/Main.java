package _01_task;

import java.util.Scanner;
import java.util.Locale;

public class Main {

    static String CURRENCY = "UAH";
    static String[] days = new String[]{"Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday"};
    static double[] price = new double[5];
    static double minPrice;
    static double maxPrice;
    static Scanner sc;

    public static void main(String[] args) {

        sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        //Ввод данных
        System.out.printf("Enter the price value, %s:%n", CURRENCY);
        for (int i = 0; i < price.length; i++){
            System.out.printf("%s: ", days[i]);
            price[i] = sc.nextDouble();
        }
        sc.close();

        //Сортировка по возрастанию
        for (int i = 0; i < price.length; i++) {
            for (int j = 1; j < (price.length - i); j++) {
                if (price[j - 1] > price[j]) {
                    double temp = price[j - 1];
                    price[j - 1] = price[j];
                    price[j] = temp;
                }
            }
        }

        //Расчет min и max значений
        maxPrice = price[0];
        for (int i = 1; i < price.length; i++) {
            if (price[i] > maxPrice) {
                maxPrice = price[i];
            }
        }
        minPrice = price[0];
        for (int i = 1; i < price.length; i++) {
            if (price[i] < minPrice) {
                minPrice = price[i];
            }
        }

        //Вывод результатов
        System.out.print("-----------------------");
        System.out.printf("%nSorted price values, %s:", CURRENCY);
        for (double v : price) System.out.printf("%n%.2f", v);
        System.out.printf("%n-----------------------");
        System.out.printf("%nMinimal price for %d days is, %s: %.2f", days.length,
                CURRENCY, minPrice);
        System.out.printf("%nMaximal price for %d days is, %s: %.2f", days.length,
                CURRENCY, maxPrice);
    }

}