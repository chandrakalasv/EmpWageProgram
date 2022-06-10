package com.bridgelab.emp;

import java.util.Scanner;

public class EmpWage {

    public static void main(String[] args) {
        System.out.println("welcome to employee wage program");
        WageComputation[] wage = new WageComputation[4];
        wage[0] = new WageComputation("TCS", 20, 100, 20);
        wage[1] = new WageComputation("HCL", 10, 200, 30);
        wage[2] = new WageComputation("INFOSYS", 8, 50, 40);
        wage[3] = new WageComputation("MIND-TREE", 16, 70, 50);

        for (int i = 0; i < wage.length; i++) {
            wage[i].display();
            System.out.println("Employee monthly wage is " + wage[i].calculateWage());
        }
    }
}