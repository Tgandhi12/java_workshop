import java.util.HashSet;
import java.util.Set;

record Employee(long id, double salary) {
    private static long idGenerator = 100;
    private static final Set<Long> uniqueIds = new HashSet<>();

    public Employee {
        if (salary <= 0) throw new IllegalArgumentException("Salary must be positive!");
        uniqueIds.add(id);
    }

    public static Employee create(double salary) {
        return new Employee(++idGenerator, salary);
    }

    public static int getUniqueEmployeeCount() {
        return uniqueIds.size();
    }

    public static Set<Long> getAllIds() {
        return uniqueIds;
    }
}

public class Sixth {
    public static void main(String[] args) {
        Employee emp1 = Employee.create(50000.0);
        Employee emp1Updated = new Employee(emp1.id(), 60000.0);
        Employee emp2 = Employee.create(75000.0);

        System.out.println("Total Unique IDs: " + Employee.getUniqueEmployeeCount());
        System.out.println("List of Employee IDs: " + Employee.getAllIds());

        System.out.println(emp1.hashCode());
        System.out.println(emp1Updated.hashCode());
    }
}