package practice;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class EMP_FULLTIME extends EMPLOYEE implements IEMPLOYEE {

    Scanner sc = new Scanner(System.in);
    private double coefficientSalary;

    public EMP_FULLTIME() {
    }

   

    public EMP_FULLTIME(double coefficientSalary) {
        this.coefficientSalary = coefficientSalary;
    }

    @Override
    public String toString() {
        return "EMP_FULLTIME = {" + super.toString() + "coefficientSalary=" + coefficientSalary + '}';
    }

    public double getCoefficientSalary() {
        return coefficientSalary;
    }

    public void setCoefficientSalary(double coefficientSalary) {
        this.coefficientSalary = coefficientSalary;
    }

    @Override
    public double CalculateSalary() {
        return BASIC_SALARY * coefficientSalary + CalculateAllowance();
    }

    @Override
    public double CalculateAllowance() {
        int seniority = CalculateSeniority();
        if (seniority >= 10) {
            return 1000000;
        } else if (seniority >= 5) {
            return 500000;
        }
        return 0;
    }

    @Override
    public void Input() {
        System.out.print("Enter ID: ");
        setEmpID(sc.nextLine());

        System.out.print("Enter Name: ");
        setEmpName(sc.nextLine());

        System.out.print("Enter Date of Birth (dd/MM/yyyy): ");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date empDateOfBirth = sdf.parse(sc.nextLine());
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

        System.out.println("Enter coefficientSalary: ");
        coefficientSalary = sc.nextDouble();
    }

    @Override
    public void Output() {
        System.out.println(toString());
    }
}
