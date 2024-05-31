import java.util.ArrayList;
import java.util.List;

public class Employee {

    private  int tabNumber;
    private List<Integer> phoneNumber;
    private int experience;
    private String nameEmployee;

    public Employee(int tabNumber, String nameEmployee,  int phoneNumberEmployee, int experienceWork) {
        this.tabNumber = tabNumber;
        this.nameEmployee = nameEmployee;
        phoneNumber = new ArrayList<>();
        phoneNumber.add(phoneNumberEmployee);
        this.experience = experienceWork;

    }

    public int getTabNumber() {
        return tabNumber;
    }

    public List<Integer> getPhoneNumber() {
        return phoneNumber;
    }

    public int  getExperience() {
        return experience;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setPhoneNumber(int number) {
        phoneNumber.add(number);
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "tabNumber=" + tabNumber +
                ", phoneNumber=" + phoneNumber +
                ", experience=" + experience +
                ", nameEmployee='" + nameEmployee + '\'' +
                '}';
    }
}
