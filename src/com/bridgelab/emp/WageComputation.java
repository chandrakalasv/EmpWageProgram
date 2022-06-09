package com.bridgelab.emp;

public class WageComputation {
    public static void isEmpPresent(int wagePerHour, int workingHourPerMonth, int workingDayPerMonth) {
        int fullTimeHour = 8;
        int partTimeHour = 4;
        int totalWorkingDay = 0;
        int totalFullTimeEmpWage = 0;
        int totalPartTimeEmpWage = 0;
        int workingHour = 0;
        int fullTimeWorkingHour = 0;
        int partTimeWorkingHour = 0;
        while ((workingHour <= workingHourPerMonth) && (totalWorkingDay <= workingDayPerMonth)) {
            int checkAttendence = (int) (Math.random() * 10) % 3;
            switch (checkAttendence) {
                case 1: {
                    int empFullDayWage = wagePerHour * fullTimeHour;
                    totalFullTimeEmpWage = totalFullTimeEmpWage + empFullDayWage;
                    fullTimeWorkingHour = fullTimeWorkingHour + fullTimeHour;
                    break;
                }
                case 2: {
                    int empPartTimeWage = wagePerHour * partTimeHour;
                    totalPartTimeEmpWage = totalPartTimeEmpWage + empPartTimeWage;
                    partTimeWorkingHour = partTimeWorkingHour + partTimeHour;
                    break;
                }
            }
            totalWorkingDay++;
        }
        System.out.println("total working day" + " " + totalWorkingDay);
        System.out.println("total working hours is" + " " + (fullTimeWorkingHour + partTimeWorkingHour));
        System.out.println("total monthly wage is" + " " + (totalFullTimeEmpWage + totalPartTimeEmpWage));
    }
}

