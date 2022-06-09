package com.bridgelab.emp;

public class wageComputation {
    public static int wagePerHour = 20;
    public int fullTimeHour = 8;
    public int partTimeHour = 4;
    public int workingDay = 0;
    int totalFullTimeEmpWage = 0;
    int totalPartTimeEmpWage = 0;

    public int empFullDayWage() {
        return wagePerHour * fullTimeHour;
    }

    public int empPartTimeWage() {
        return wagePerHour * partTimeHour;
    }

    public void isEmpPresent() {
        while(workingDay <= 20) {
            int checkAttendence = (int) (Math.random() * 10) % 3;
            switch (checkAttendence) {
                case 1: {
                    int empFullDayWage = empFullDayWage();
                    totalFullTimeEmpWage = totalFullTimeEmpWage + empFullDayWage;
                    System.out.println("emp is present and full time emp daily wage is" + " " + empFullDayWage);
                    break;
                }
                case 2: {
                    int empPartTimeWage = empPartTimeWage();
                    totalPartTimeEmpWage = totalPartTimeEmpWage + empPartTimeWage;
                    System.out.println("emp is present and part time emp daily wage is" + " " + empPartTimeWage);
                    break;
                }
                case 0:
                    System.out.println("emp is absent");
                    break;
            }
            workingDay++;
        }
        System.out.println("total working day" + " " + workingDay);
        System.out.println("total monthly wage is" + " " + (totalFullTimeEmpWage+totalPartTimeEmpWage));
    }
}

