import java.util.Arrays;
import java.util.Comparator;

public class EmployeeBook {

    private Employee[] employees = new Employee[10];

//    public void EmployeeBook(Employee[] employees) {
//        this.employees = employees;
//    }

    public void addEmployee(String fullName, int departmentNo, double salary){
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = new Employee(fullName,departmentNo,salary);
                employees[i].setId(i + 1);
                System.out.println(fullName + " is added to employee book");
                System.out.println("=========================================");
                break;
            }
        }
    }
    public void deleteEmployee(String fullNameOrId) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i]!=null && (employees[i].getFullName().equals(fullNameOrId) || fullNameOrId.equals(Integer.toString(employees[i].getId())))) {
                System.out.println(employees[i].getFullName()+" deleted from employee book");
                System.out.println("=========================================");
                employees[i] = null;
            }

        }

    }
    public void editEmployeeRecord(String fullNameOrId,int departmentNo) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i]!=null && (employees[i].getFullName().equals(fullNameOrId) || fullNameOrId.equals(Integer.toString(employees[i].getId())))) {
               employees[i].setDepartmentNo(departmentNo);
                System.out.println("Record of "+employees[i].getFullName()+" is edited. New Dept No:"+departmentNo);
                System.out.println("=========================================");
            }
        }
    }
    public void editEmployeeRecord(String fullNameOrId,double salary) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i]!=null && (employees[i].getFullName().equals(fullNameOrId) || fullNameOrId.equals(Integer.toString(employees[i].getId())))) {
                employees[i].setSalary(salary);
                System.out.println("Record of "+employees[i].getFullName()+" is edited. New Salary:"+salary);
                System.out.println("=========================================");
            }
        }
    }
    public void editEmployeeRecord(String fullNameOrId,int departmentNo, double salary) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i]!=null && (employees[i].getFullName().equals(fullNameOrId) || fullNameOrId.equals(Integer.toString(employees[i].getId())))) {
                employees[i].setDepartmentNo(departmentNo);
                employees[i].setSalary(salary);
                System.out.println("Record of "+employees[i].getFullName()+" is edited. New Dept No:"+departmentNo+". New Salary:"+salary);
                System.out.println("=========================================");
            }
        }
    }
    public void printEmployeesList() {
        System.out.println("Employees list:");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].toString());

            }
        }System.out.println("=========================================");
    }

    public void printDepartmentList(int departmentNo) {
        Employee[] tmp = new Employee[employees.length];
        for (int i = 0; i < tmp.length; i++) {
            if (employees[i]!=null && employees[i].getDepartmentNo() == departmentNo) {
                tmp[i] = employees[i];
            }
        }
        int count = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i]!=null && employees[i].getDepartmentNo() == departmentNo) {
                count++;
            }
        }
        Employee[] department = new Employee[count];
        Arrays.sort(tmp, Comparator.nullsLast(null));
        for (int i = 0; i<department.length;i++) {
            if (tmp[i]!=null) {
                department[i] = tmp[i];
            }
        }

        for (int i = 0; i < department.length; i++) {
            if (department[i] != null) {
                System.out.println(department[i].toString().replace(" from department No:"+department[i].getDepartmentNo()+". ",". "));
            }
        }System.out.println("----------------------------------");
    }

    public void printEmployeesListByDepartments() {
        System.out.println("Employees list by departments:");
        int highestDeptNo = Integer.MIN_VALUE;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i]!=null && employees[i].getDepartmentNo() > highestDeptNo) {
                highestDeptNo = employees[i].getDepartmentNo();
            }
        }
        int lowestDeptNo = Integer.MAX_VALUE;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i]!=null && employees[i].getDepartmentNo() < lowestDeptNo) {
                lowestDeptNo = employees[i].getDepartmentNo();
            }
        }
        for (int i = lowestDeptNo; i <= highestDeptNo; i++) {
            System.out.println("Department No "+i+":");
            printDepartmentList(i);
        }
    }

    public double sumSalaries() {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                sum += employees[i].getSalary();
            }
        }
        System.out.println("Sum of salaries:"+sum);
        System.out.println("=========================================");
        return sum;
    }

    public void findMinSalaryEmpl() {
        double minSalary = Integer.MAX_VALUE;
        Employee employee = null;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getSalary() < minSalary) {
                    minSalary = employees[i].getSalary();
                    employee = employees[i];
                }
            }
        }
        System.out.println("Employee with lowest salary:\n"+employee.toString());
        System.out.println("=========================================");

    }

    public void findMaxSalaryEmpl() {
        Employee employee = null;
        double maxSalary = Integer.MIN_VALUE;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getSalary() > maxSalary && employees[i] != null) {
                    maxSalary = employees[i].getSalary();
                    employee = employees[i];
                }
            }
        }
        System.out.println("Employee with highest salary:\n"+employee.toString());
        System.out.println("=========================================");
    }

    public void findAvrgSalary() {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                sum += employees[i].getSalary();
            }
        }
        double avrgSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                avrgSalary = sum / (i + 1);
            }

        }
        System.out.println("Average salary: "+avrgSalary);
        System.out.println("=========================================");
    }

    public void getAllNames() {
        System.out.println("Employees names only:");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].getFullName());
            }
        }        System.out.println("=========================================");

    }

    public void indexSalary(double rate) {
        System.out.println("Indexed salary. Rate is " + rate + "%");
        for (Employee employee : employees
        ) {
            if (employee != null) {
                employee.setSalary(employee.getSalary() + employee.getSalary() / 100 * rate);
            }
        }
        printEmployeesList();
    }
    public void checkForSalaryLowerThan(double givenSalary) {
        System.out.println("Employees with salary lower than "+givenSalary);
        for (Employee employee:employees
        ) {
            if (employee.getSalary()<givenSalary) {
                System.out.println(employee.getId()+" "+employee.getFullName()+". "+employee.getSalary());
            }
        }System.out.println("=========================================");
    }

    public void checkForSalaryHigherThan(double givenSalary) {
        System.out.println("Employees with salary higher than "+givenSalary);
        for (Employee employee:employees
        ) {
            if (employee.getSalary()>givenSalary) {
                System.out.println(employee.getId()+" "+employee.getFullName()+". "+employee.getSalary());
            }
        }System.out.println("=========================================");
    }

}
