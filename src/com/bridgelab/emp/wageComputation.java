package com.bridgelab.emp;

public class wageComputation {
    public static int wagePerHour = 20;
    public int fullDayHour = 8;
    public int partTimeHour = 4;

    public int empFullDayWage() {
        return wagePerHour * fullDayHour;
    }
    public int empPartTimeWage() {
        return wagePerHour * partTimeHour;
    }

    public void isEmpPresent() {
        int checkAttendence = (int) (Math.random() * 10) % 3;
        if (checkAttendence == 1) {
            int empFullDayWage = empFullDayWage();
            System.out.println("emp is present and full time emp daily wage is" + " " + empFullDayWage);
        } else if (checkAttendence == 2) {
            int empPartTimeWage = empPartTimeWage();
            System.out.println("emp is present and part time emp daily wage is" + " " + empPartTimeWage);
        } else
            System.out.println("emp is absent");
        }
    }

