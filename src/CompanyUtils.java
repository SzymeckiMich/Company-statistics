import java.util.Scanner;

public class CompanyUtils {

    public static double averageSalary(Employee[] employees) {
        double salarySum = 0;
        for (int i = 0; i < employees.length; i++) {
            salarySum += employees[i].getSalary();
        }
        return salarySum / employees.length;
    }

    public static double minSalary(Employee[] employees) {
        double minSalary = employees[0].getSalary();
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
            }
        }
        return minSalary;
    }

    public static double maxSalary(Employee[] employees) {
        double maxSalary = employees[0].getSalary();
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
            }
        }
        return maxSalary;
    }

    public static int howMuchEmployeesOnSection(Employee[] employees, String section) {
        int count = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSection().equals(section)) {
                count++;
            }
        }
        return count;
    }
}
