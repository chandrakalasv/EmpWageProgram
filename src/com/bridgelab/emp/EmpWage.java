package com.bridgelab.emp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EmpWage {

    public static void main(String[] args) {
        System.out.println("welcome to employee wage program");
        ArrayList<IEmpWage> companies = new ArrayList<IEmpWage>();
        companies.add(new WageComputation("TCS", 20, 100, 20));
        companies.add(new WageComputation("HCL", 10, 200, 30));
        companies.add(new WageComputation("INFOSYS", 8, 50, 40));
        companies.add(new WageComputation("MIND-TREE", 16, 70, 50));

        for (IEmpWage wageComputation : companies) {
            wageComputation.display();
            System.out.println("employee daily wage is " + wageComputation.dailyWage());
            System.out.println("employee monthly wage is " + wageComputation.calculateWage());
       }
        System.out.println(companies);
    }
}