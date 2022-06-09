package com.bridgelab.emp;

public class wageComputation {
    public static int wagePerHour = 20;
    public int fullDayHour = 8;

    public int empFullDayWage() {
        return wagePerHour * fullDayHour;
    }

    public void isEmpPresent() {
        int checkAttendence = (int) (Math.random() * 10) % 2;
        if (checkAttendence == 1) {
            int empFullDayWage = empFullDayWage();
            System.out.println("emp is present and full time emp daily wage is" + " " + empFullDayWage);
        } else if (checkAttendence == 0) {
            System.out.println("emp is absent");
        }
    }
}
