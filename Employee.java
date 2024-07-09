public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

class PayrollService {
    public double calculatePay(Employee employee) {
        // Lógica para calcular el salario
        return employee.getSalary();
    }
}

class EmployeeReport {
    public String generateReport(Employee employee) {
        // Lógica para generar un reporte del empleado
        return employee.getName();
    }
}

class EmployeRepository {
    public void saveToDatabase(Employee employee) {
        // Lógica para guardar el empleado en la base de datos
    }
}
