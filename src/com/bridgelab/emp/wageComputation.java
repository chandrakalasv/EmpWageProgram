package com.bridgelab.emp;

public class wageComputation {
    public  int wagePerHour = 20;
    public int fullTimeHour = 8;
    public int partTimeHour = 4;
    public int totalWorkingDay = 0;
    public int workingDayPerMonth = 20;
    public int totalFullTimeEmpWage = 0;
    public int totalPartTimeEmpWage = 0;
    public int workingHour = 0;
    public int workingHourPerMonth = 100;
    public int fullTimeWorkingHour = 0;
    public int partTimeWorkingHour = 0;

    public int empFullDayWage() {
        return wagePerHour * fullTimeHour;
    }

    public int empPartTimeWage() {
        return wagePerHour * partTimeHour;
    }

    public void isEmpPresent() {
        while (workingHour <= workingHourPerMonth && totalWorkingDay <= workingDayPerMonth) {
            int checkAttendence = (int) (Math.random() * 10) % 3;
            switch (checkAttendence) {
                case 1: {
                    int empFullDayWage = empFullDayWage();
                    totalFullTimeEmpWage = totalFullTimeEmpWage + empFullDayWage;
                    fullTimeWorkingHour = fullTimeWorkingHour + fullTimeHour;
                    System.out.println("emp is present and full time emp daily wage is" + " " + " " + fullTimeWorkingHour + " " + empFullDayWage);
                    break;
                }
                case 2: {
                    int empPartTimeWage = empPartTimeWage();
                    totalPartTimeEmpWage = totalPartTimeEmpWage + empPartTimeWage;
                    partTimeWorkingHour = partTimeWorkingHour + partTimeHour;
                    System.out.println("emp is present and part time emp daily wage is" + " " + " " + empPartTimeWage);
                    break;
                }
                case 0:
                    System.out.println("emp is absent");
                    break;
            }
            totalWorkingDay++;
        }
        System.out.println("total working day" + " " + totalWorkingDay);
        System.out.println("total working hours is" + " " + (fullTimeWorkingHour + partTimeWorkingHour));
        System.out.println("total monthly wage is" + " " + (totalFullTimeEmpWage + totalPartTimeEmpWage));
    }
}

