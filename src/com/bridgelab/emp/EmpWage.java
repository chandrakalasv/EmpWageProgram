package com.bridgelab.emp;

import java.util.Scanner;

public class EmpWage {
    static Scanner choice = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("welcome to employee wage program");
        WageComputation[] wage = new WageComputation[4];
        int select;
        do {
            System.out.println("choose company name" + "\n 1. TCS" + "\n 2.HCL" + "\n 3. INFOSYS" + "\n 4. MIND-TREE");
            int companyName = choice.nextInt();
            switch (companyName) {
                case 1: {
                    wage[0] = new WageComputation("TCS", 20, 100, 20);
                    wage[0].display();
                    break;
                }
                case 2: {
                    wage[1] = new WageComputation("HCL", 10, 200, 30);
                    wage[1].display();
                    break;
                }
                case 3: {
                    wage[2] = new WageComputation("INFOSYS", 8, 50, 40);
                    wage[2].display();
                    break;
                }
                case 4: {
                    wage[3] = new WageComputation("MIND-TREE", 16, 70, 50);
                    wage[3].display();
                    break;
                }
                default:
                    System.out.println("please choose proper company");
            }
            System.out.println("are you wish to continue:" + "\n 1. continue" + "\n 2. exit");
            select = choice.nextInt();
        } while (select == 1);

    }
}