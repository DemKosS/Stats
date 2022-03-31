package ru.netology.stats;

public class StatsService {
    public int calcSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;

    }

    public int calcAverageSumInMonth(int[] sales) {
        return calcSum(sales) / sales.length;

    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;


        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int averageMin(int[] sales) {
        int monthCount = 0;
        int averageSale = calcAverageSumInMonth(sales);
        for (int sale : sales) {
            if (sale < averageSale) {
                monthCount = monthCount + 1;
            }

        }
        return monthCount;

    }

    public int averageMax(int[] sales) {
        int monthCount = 0;
        int averageSale = calcAverageSumInMonth(sales);
        for (int sale : sales) {
            if (sale > averageSale) {
                monthCount = monthCount + 1;
            }
        }
        return monthCount;
    }


}

