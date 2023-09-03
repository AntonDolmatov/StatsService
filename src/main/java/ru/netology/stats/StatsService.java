package ru.netology.stats;

public class StatsService {

    // Метод для расчета суммы всех продаж
    public long calculateTotalSales(long[] sales) {
        long totalSales = 0;
        for (long sale : sales) {
            totalSales = totalSales + sale ;
        }
        return totalSales;
    }

    // Метод для расчета средней суммы продаж в месяц
    public long calculateAverageSales(long[] sales) {
        long totalSales = calculateTotalSales(sales);
        return totalSales / sales.length;
    }

    // Метод для поиска номера месяца с максимальными продажами
    public int findMonthWithMaxSales(long[] sales) {
        long maxSales = sales[0];
        int month = 0;

        for (int i = 1; i < sales.length; i++) {
            if (sales[i] >= maxSales) {
                maxSales = sales[i];
                month = i;
            }
        }

        return month + 1;
    }

    // Метод для поиска номера месяца с минимальными продажами
    public int findMonthWithMinSales(long[] sales) {
        long minSales = sales[0];
        int month = 0;

        for (int i = 1; i < sales.length; i++) {
            if (sales[i] <= minSales) {
                minSales = sales[i];
                month = i;
            }
        }

        return month + 1;
    }

    // Метод для подсчета количества месяцев с продажами ниже среднего
    public int countMonthsBelowAverage(long[] sales) {
        long averageSales = calculateAverageSales(sales);
        int count = 0;

        for (long sale : sales) {
            if (sale < averageSales) {
                count++;
            }
        }

        return count;
    }

    // Метод для подсчета количества месяцев с продажами выше среднего
    public int countMonthsAboveAverage(long[] sales) {
        long averageSales = calculateAverageSales(sales);
        int count = 0;

        for (long sale : sales) {
            if (sale > averageSales) {
                count++;
            }
        }

        return count;
    }

}