public class Employee {

    private String fullName;
    private int departmentNo;
    private double salary;
    private int id;

    public Employee(String fullName, int departmentNo, double salary) {
        this.fullName = fullName;
        this.departmentNo = departmentNo;
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartmentNo() {
        return departmentNo;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public int setId(int id) {
        return this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartmentNo(int departmentNo) {
        this.departmentNo = departmentNo;
    }
    @Override
    public String toString() {
       return id+" "+fullName+" "+"from department No:"+departmentNo+". Salary:"+salary;
    }


}
