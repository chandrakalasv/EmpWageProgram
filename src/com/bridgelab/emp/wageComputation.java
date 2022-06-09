package com.bridgelab.emp;

public class wageComputation {
    public void isEmpPresent() {
        int checkAttendence = (int) (Math.random() * 10) % 2;
        if (checkAttendence == 1)
            System.out.println("emp is present");
        else if (checkAttendence == 0) {
            System.out.println("emp is absent");
        }
    }
}
