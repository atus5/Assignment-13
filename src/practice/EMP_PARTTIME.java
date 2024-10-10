
package practice;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import java.util.Scanner;


public class EMP_PARTTIME extends EMPLOYEE implements IEMPLOYEE{
    Scanner sc = new Scanner(System.in);
    private int numberOfWorkdays;

    public EMP_PARTTIME() {
    }

    public EMP_PARTTIME(int numberOfWorkdays, String empID, String empName, LocalDate empDateOfBirth, LocalDate startDate) {
        super(empID, empName, empDateOfBirth, startDate);
        this.numberOfWorkdays = numberOfWorkdays;
    }

    public EMP_PARTTIME(int numberOfWorkdays) {
        this.numberOfWorkdays = numberOfWorkdays;
    }

    @Override
    public String toString() {
        return "EMP_PARTTIME{" + super.toString() + "numberOfWorkdays=" + numberOfWorkdays + '}';
    }

    public int getNumberOfWorkdays() {
        return numberOfWorkdays;
    }

    public void setNumberOfWorkdays(int numberOfWorkdays) {
        this.numberOfWorkdays = numberOfWorkdays;
    }

    @Override
    public double CalculateSalary() {
        return (BASIC_SALARY * numberOfWorkdays / 26) + CalculateAllowance();
    }

    @Override
    public double CalculateAllowance() {
        int seniority = CalculateSeniority();
        if (seniority >= 10) {
            return 500000;
        } else if (seniority >= 5) {
            return 300000;
        }
        return seniority;
    }

    @Override
    public void Input() {
       System.out.print("Enter ID: ");
        setEmpID(sc.nextLine());

        System.out.print("Enter Name: ");
        setEmpName(sc.nextLine());

        System.out.print("Enter Date of Birth (dd/MM/yyyy): ");
        String dobInput = sc.nextLine();
        try {
            LocalDate empDateOfBirth = LocalDate.parse(dobInput, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            setEmpDateOfBirth(empDateOfBirth);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.print("Enter Start Date (dd/MM/yyyy): ");
        String startDateInput = sc.nextLine();
        try {
            LocalDate startDate = LocalDate.parse(startDateInput, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            setStartDate(startDate);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.print("Enter Number of Workdays: ");
        numberOfWorkdays = sc.nextInt();
        setNumberOfWorkdays(numberOfWorkdays);
    }

    @Override
    public void Output() {
        System.out.println(toString());
    }
}
