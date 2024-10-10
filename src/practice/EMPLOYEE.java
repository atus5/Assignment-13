package practice;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

abstract class EMPLOYEE implements IEMPLOYEE {

    private String empID;
    private String empName;
    private Date empDateOfBirth;
    private LocalDate startDate;

    public EMPLOYEE(String empID, String empName, Date empDateOfBirth, LocalDate startDate) {
        this.empID = empID;
        this.empName = empName;
        this.empDateOfBirth = empDateOfBirth;
        this.startDate = startDate;
    }

    public Date getEmpDateOfBirth() {
        return empDateOfBirth;
    }

    public void setEmpDateOfBirth(Date empDateOfBirth) {
        this.empDateOfBirth = empDateOfBirth;
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

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public int CalculateSeniority() {
        int thisYear = LocalDate.now().getYear();
        int startYear = getStartDate().getYear() + 1900;
        return (thisYear - startYear);
    }

    public abstract void Input();

    public abstract void Output();
}
