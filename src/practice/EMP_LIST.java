
package practice;

import java.util.ArrayList;


public class EMP_LIST {
    private ArrayList<EMPLOYEE> list = new ArrayList<>();

    public void AddNewEmpFullTime() {
        EMP_FULLTIME empFull = new EMP_FULLTIME();
        empFull.Input();
        list.add(empFull);
        
    }
    public void AddNewEmpPartTime(){
        EMP_PARTTIME empPart = new EMP_PARTTIME();
        empPart.Input();
        list.add(empPart);
    }

   

    public void Delete(String empID) {
        list.removeIf(employee -> employee.getEmpID().equals(empID));
    }

    public EMPLOYEE Find(String empID) {
        for (EMPLOYEE employee : list) {
            if (employee.getEmpID().equals(empID)) {
                employee.Output();
                return employee;
            }
        }
        return null;
    }

    public void DisplayMenu() {
        for (EMPLOYEE employee : list) {
            employee.Output();
        }
        
    }
}
