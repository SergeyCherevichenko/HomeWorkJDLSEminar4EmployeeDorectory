import java.lang.reflect.Array;
/*
Создать справочник сотрудников
Необходимо:
Создать класс справочник сотрудников, который содержит внутри
коллекцию сотрудников - каждый сотрудник должен иметь следующие атрибуты:
Табельный номер
Номер телефона
Имя
Стаж
Добавить метод, который ищет сотрудника по стажу (может быть список)
Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)
Добавить метод, который ищет сотрудника по табельному номеру
Добавить метод добавления нового сотрудника в справочник

 */
public class Main {
    public static void main(String[] args) {
        EmployeeDirectory employeeDirectory = new EmployeeDirectory();
        employeeDirectory.addEmployee(1,"Сергей",909190458,19);
        employeeDirectory.addEmployee(2,"Михаил",339025262,3);
        employeeDirectory.addEmployee(3,"Елена",333559055,2);
        employeeDirectory.addEmployee(55,"Рустам",909873412,22);
        employeeDirectory.addEmployee(100,"Равшан",905671213,8);
        employeeDirectory.addEmployee(45,"Альберт",908763421,19);
        employeeDirectory.setPhoneNumber("Сергей",909427262);
        employeeDirectory.setPhoneNumber("Сергей",512);
        employeeDirectory.setPhoneNumber("Равшан",2271);
        System.out.println("Список сотрудников");
        System.out.println(employeeDirectory.toString());
        System.out.println("++++++++++++++++");
        System.out.println(" поиск по стажу");
        System.out.println(employeeDirectory.findEmployeeByExperience(19).toString());
        System.out.println("______________________");
        System.out.println(employeeDirectory.findEmployeeByExperience(8).toString());
        System.out.println("+++++++++++++++++++++");
        System.out.println("Возврат номера телефона по имени ");
        System.out.println(employeeDirectory.findPhoneNumberByName("Сергей"));
        System.out.println("_____________________");
        System.out.println(employeeDirectory.findPhoneNumberByName("Альберт"));
        System.out.println("++++++++++++++++++++++++++");
        System.out.println("Сотрудник(имя) по табельному номеру");
        System.out.println(employeeDirectory.findNameByTabNumber(100));
        System.out.println("____________________________");
        System.out.println(employeeDirectory.findNameByTabNumber(55));
        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.println("добавляем сотрудника");
        employeeDirectory.addEmployee(1002,"Оля",712541242,10);
        employeeDirectory.addEmployee(1003,"Robby",785643210,5);
        System.out.println(employeeDirectory.toString());
    }
}