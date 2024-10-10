
package practice;

import java.time.LocalDate;
import java.time.Period;


abstract class EMPLOYEE implements IEMPLOYEE{
     private String empID;
    private String empName;
    private LocalDate empDateOfBirth;
    private LocalDate startDate;

    public EMPLOYEE(String empID, String empName, LocalDate empDateOfBirth, LocalDate startDate) {
        this.empID = empID;
        this.empName = empName;
        this.empDateOfBirth = empDateOfBirth;
        this.startDate = startDate;
    }

    public EMPLOYEE() {
    }

    @Override
    public String toString() {
        return "" + "empID=" + empID + ", empName=" + empName + ", empDateOfBirth=" + empDateOfBirth + ", startDate=" + startDate;
    }

    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public LocalDate getEmpDateOfBirth() {
        return empDateOfBirth;
    }

    public void setEmpDateOfBirth(LocalDate empDateOfBirth) {
        this.empDateOfBirth = empDateOfBirth;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public int CalculateSeniority() {
        return Period.between(startDate, LocalDate.now()).getYears();
    }

    public abstract void Input();
    public abstract void Output();
}
