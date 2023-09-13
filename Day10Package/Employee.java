package Day10Package;

public class Employee {
    public String employeeName;
    public int salary;
    public String employeeID;
    public int experience;
    public String stream;
    public int level;

    public Employee(String employeeName, int salary, String employeeID, int experience) {
        this.employeeName = employeeName;
        this.salary = salary;
        this.employeeID = employeeID;
        this.experience = experience;
    }

    public Employee(String employeeName, int salary, String employeeID) {
        this.employeeName = employeeName;
        this.salary = salary;
        this.employeeID = employeeID;
    }
    public Employee(String employeeID, String employeeName){
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }
    public Employee(String stream, int level) {
        this.stream = stream;
        this.level = level;
    }
        public String getEmployeeName() {
        return employeeName;
    }

    public int getSalary() {
        return salary;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public int getExperience() {
        return experience;
    }
    public void setExperience(int experience){
        this.experience = experience;
    }
}
