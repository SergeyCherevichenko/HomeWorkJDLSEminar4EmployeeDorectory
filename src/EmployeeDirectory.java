
import java.util.ArrayList;
import java.util.List;

public class EmployeeDirectory {
    private List<Employee> employeeList;
    private EmployeeBuild employeeBuild;

    public EmployeeDirectory() {
        employeeList = new ArrayList<>();
        employeeBuild = new EmployeeBuild();
    }

    public void addEmployee(int tabNumber, String name, int phoneNumber, int experience) {
        Employee employee = employeeBuild.employeeBuild(tabNumber, name, phoneNumber, experience);
        employeeList.add(employee);
    }

    public List<Employee> findEmployeeByExperience(int experience) {
        List<Employee> findEmployee = new ArrayList<>();
        for (Employee e : employeeList) {
            if (Integer.valueOf(experience).equals(e.getExperience())) {
                findEmployee.add(e);
            }
        }
        return findEmployee;
    }

    public List<Integer> findPhoneNumberByName(String name) {
        for (Employee e : employeeList) {
            if (name.equals(e.getNameEmployee())) {
                return e.getPhoneNumber();
            }
        }
        return null;
    }

    public String findNameByTabNumber(int tabNumber) {
        for (Employee e : employeeList) {
            if (e.getTabNumber() == tabNumber) {
                return e.getNameEmployee();
            }

            }
        return null;
        }
        public void setPhoneNumber(String name,int number){
        for (Employee e:employeeList){
            if(e.getNameEmployee().equals(name)){
                e.setPhoneNumber(number);
            }
        }
        }


    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (Employee e: employeeList){
            str.append(e.getTabNumber()).append(": ").append(e.getNameEmployee())
                    .append(", телефон номер(а):  ").append(e.getPhoneNumber()).append(", стаж: ")
                    .append(e.getExperience()).append("\n");

        }
        return str.toString();
    }
}



