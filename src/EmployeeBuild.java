public class EmployeeBuild {

    public Employee  employeeBuild(int tabNumber,String name,int phoneNumber,int experience) {
        Employee employee = new Employee(tabNumber,name,phoneNumber,experience);
        return employee;
    }
}
