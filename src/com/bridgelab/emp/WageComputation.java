package com.bridgelab.emp;

public class WageComputation implements IEmpWage {

    public String companyName;
    public int wagePerHour;
    public int workingHourPerMonth;
    public int workingDayPerMonth;
    int totalWage;
    int dailyWage;

    public WageComputation(String companyName, int wagePerHour, int workingHourPerMonth, int workingDayPerMonth) {
        this.companyName = companyName;
        this.wagePerHour = wagePerHour;
        this.workingHourPerMonth = workingHourPerMonth;
        this.workingDayPerMonth = workingDayPerMonth;
    }

    public int calculateWage() {
        int totalWorkingDay = 0;
        int totalFullTimeEmpWage = 0;
        int totalPartTimeEmpWage = 0;
        int workingHour = 0;
        int fullTimeWorkingHour = 0;
        int partTimeWorkingHour = 0;
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
        totalWage = totalFullTimeEmpWage + totalPartTimeEmpWage;
        return totalWage;
    }
    public int dailyWage() {
        dailyWage = (wagePerHour * 8);
        return dailyWage;
    }

    public void display() {
        System.out.println("company name is  " + companyName);
    }

    @Override
    public String toString() {
        return "\n" + companyName + "\nemp daily wage is " + dailyWage + "\nmonthly wage is " + totalWage;
    }
}

