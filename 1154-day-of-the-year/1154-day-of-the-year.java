class Solution {
    public int dayOfYear(String date) {
        // 1. Extract year, month, and day from "YYYY-MM-DD"
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8, 10));

        // 2. Days in each month for a standard non-leap year
        int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // 3. Check for Leap Year and update February
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            daysInMonths[1] = 29;
        }

        // 4. Sum up days of all full months before the current month
        int daysPassed = day;
        for (int i = 0; i < month - 1; i++) {
            daysPassed += daysInMonths[i];
        }

        return daysPassed;
    }
}