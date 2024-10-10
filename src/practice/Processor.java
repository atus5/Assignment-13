package practice;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EMP_LIST list = new EMP_LIST();
        int choice = 0;
        try {
            do {
                System.out.println("oAddNewFull, \n"
                        + "oAddNewPart\n"
                        + "oUpdate information of emplyee based on EmpID; \n"
                        + "oDelete an employee based on EmpID;\n"
                        + "oFind an employee based on EmpID;\n"
                        + "oThe menu of the program allows the user to select the functions");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();
                sc.nextLine();
                switch (choice) {
                    case 1:
                        list.AddNewEmpFullTime();
                        break;
                    case 2:
                        list.AddNewEmpPartTime();
                        break;
                    case 3:
                        System.out.println("Updating....");
                        break;
                    case 4:
                        System.out.println("Enter id to delete: ");
                        String empID = sc.nextLine();
                        list.Delete(empID);
                        break;
                    case 5:
                        System.out.println("Enter id to find: ");
                        empID = sc.nextLine();
                        list.Find(empID);
                        break;
                    case 6:
                        list.DisplayMenu();
                        break;
                    case 7:
                        list.caculateSalary();
                        break;
                    default:
                        throw new AssertionError();
                }
            } while (true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
