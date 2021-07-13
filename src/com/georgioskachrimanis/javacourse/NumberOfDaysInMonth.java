package com.georgioskachrimanis.javacourse;

public class NumberOfDaysInMonth {

    public static int getDaysInMonth(int month, int year) {
        if ((1 <= month && month <= 12) && (0 < year && year <= 9999)) {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    return 31;

                case 2:
                    if (LeapYear.isLeapYear(year)) {
                        return 29;
                    }
                    return 28;

                case 4:
                case 6:
                case 9:
                case 11:
                    return 30;

            }
        }

        return -1;
    }

}
