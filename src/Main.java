import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        EmployeeBook employeeBook = new EmployeeBook();

        //id 1-5
        employeeBook.addEmployee("Oleg Petrovich Sakharov", 2, 30000);
        employeeBook.addEmployee("Ivan Alekseyevich Gorelov", 3, 35000);
        employeeBook.addEmployee("Zahar Nikolayevich Drugov", 4, 33000);
        employeeBook.addEmployee("Alexandr Alexandrovich Vlasov", 1, 39500);
        employeeBook.addEmployee("Sergey Leonidovich Bryantsev", 5, 31000);
        //id 6-10
        employeeBook.addEmployee("Mikhail Petrovich Koshkin", 3, 30500);
        employeeBook.addEmployee("Petr Olegovich Rostov", 1, 29000);
        employeeBook.addEmployee("Aleksey Gennadyevich Tolstov", 1, 29000);
        employeeBook.addEmployee("Leonid Leonidovich Fedotov", 4, 29500);
        employeeBook.addEmployee("Stepan Stepanovich Pustoy", 2, 28000);

        employeeBook.printEmployeesList();
        employeeBook.deleteEmployee("3");
        employeeBook.printEmployeesList();
        employeeBook.addEmployee("Vernite pasport pojaluysta, ya ne hochu tut rabotat",1,34000);
        employeeBook.printEmployeesList();
        employeeBook.editEmployeeRecord("3",5,-20000);
        employeeBook.printEmployeesList();
        employeeBook.printEmployeesListByDepartments();

        employeeBook.findMinSalaryEmpl();
        employeeBook.findMaxSalaryEmpl();
        employeeBook.checkForSalaryHigherThan(29000.0);
        employeeBook.checkForSalaryLowerThan(29000);
        employeeBook.sumSalaries();
        employeeBook.findAvrgSalary();
        employeeBook.indexSalary(4);
        employeeBook.getAllNames();

    }

}