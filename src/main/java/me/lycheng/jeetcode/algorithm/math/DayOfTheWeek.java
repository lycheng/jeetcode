package me.lycheng.jeetcode.algorithm.math;

/**
 * https://leetcode.com/problems/day-of-the-week/
 */
public class DayOfTheWeek {

    private String[] dayOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

    boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0)
            return true;
        return year % 400 == 0;
    }

    public String dayOfTheWeek(int day, int month, int year) {
        int[] monthDays = new int[]{31, isLeapYear(year)? 29: 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int diff = 0;
        for (int i = 1971; i < year; i++)
            diff += 365 + (isLeapYear(i)? 1: 0);

        for (int i = 1; i < month; i++)
            diff += monthDays[i - 1];

        diff += day - 1;

        // 1971-01-01 is Friday
        return dayOfWeek[(diff + 5) % 7];
    }
}
