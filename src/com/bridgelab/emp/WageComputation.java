package com.bridgelab.emp;

public class WageComputation {
   public int totalWorkingDay = 0;
   public int totalFullTimeEmpWage = 0;
   public int totalPartTimeEmpWage = 0;
   public int workingHour = 0;
   public int fullTimeWorkingHour = 0;
   public int partTimeWorkingHour = 0;

   public WageComputation(String companyName, int wagePerHour, int workingHourPerMonth, int workingDayPerMonth) {
        while ((workingHour <= workingHourPerMonth) && (totalWorkingDay < workingDayPerMonth)) {
            int checkAttendence = (int) (Math.random() * 10) % 3;
            switch (checkAttendence) {
                case 1: {
                    int empFullDayWage = wagePerHour * 8;
                    totalFullTimeEmpWage = totalFullTimeEmpWage + empFullDayWage;
                    fullTimeWorkingHour = fullTimeWorkingHour + 8;
                    break;
                }
                case 2: {
                    int empPartTimeWage = wagePerHour * 4;
                    totalPartTimeEmpWage = totalPartTimeEmpWage + empPartTimeWage;
                    partTimeWorkingHour = partTimeWorkingHour + 4;
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

