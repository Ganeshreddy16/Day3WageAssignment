package org.WageDetails;

import java.util.Scanner;

public class WagesDetailsday3
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.println( "Check the Employee Number:" +
                "\n 1.Fulltime employee"+
                "\n 2.Parttime employee");


        int EmployeeNumber;
        EmployeeNumber=input.nextInt();

        int workingHours,Payperhour;
        double attcheck,Salary;

        switch(EmployeeNumber)
        {
            case 1:
                workingHours = 8;
                Payperhour = 20;
                attcheck = (Math.floor(Math.random() * 10) % 2);
                if (attcheck == 1) {
                    System.out.println("Employee is present");
                } else if (attcheck == 0) {
                    System.out.println("Employee is absent");
                }
                Salary = workingHours * Payperhour * attcheck;
                System.out.println("Employee Salary is " + Salary);
                break;

            case 2:
                workingHours = 3;
                Payperhour = 10;
                attcheck = (Math.floor(Math.random() * 10) % 2);
                if (attcheck == 1) {
                    System.out.println("Employee is present");
                } else if (attcheck == 0) {
                    System.out.println("Employee is absent");
                }
                Salary = workingHours * Payperhour * attcheck;
                System.out.println("Employee salary is " + Salary);
                break;

            default:
                System.out.println("Enter the correct Number ");

        }




    }
}
