import java.io.*;
import java.util.Scanner;

public class FileUtils {

    public static void save(Employee[] employees, String fileName) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
        for (int i = 0; i < employees.length; i++) {
            bufferedWriter.write(employees[i].toCSV());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }

    public static Employee[] employeesArray(File file) throws FileNotFoundException {
        int lines = howMuchLines(file);
        Employee[] employees = new Employee[lines];
        Scanner scanner = new Scanner(file);
        for (int i = 0; i < employees.length; i++) {
            String line = scanner.nextLine();
            String[] split = line.split(";");
            double price = Double.parseDouble(split[4]);
            employees[i] = new Employee(split[0], split[1], split[2], split[3], price);
        }
        return employees;
    }

    public static int howMuchLines(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        int lines = 0;
        while (scanner.hasNextLine()) {
            lines++;
            scanner.nextLine();
        }
        return lines;
    }

    public static void showInfo(Employee[] employee2) {
        for (int i = 0; i < employee2.length; i++) {
            System.out.println(employee2[i].toString());
        }
    }

    public static void statsToCSV(Employee[] employees) throws IOException {
        File file = new File("CompanyStats.txt");
        if (!file.exists()) {
            file.createNewFile();
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            bufferedWriter.write("Average salary: " + CompanyUtils.averageSalary(employees));
            bufferedWriter.newLine();
            bufferedWriter.write("Min salary: " + CompanyUtils.minSalary(employees));
            bufferedWriter.newLine();
            bufferedWriter.write("Max salary: " + CompanyUtils.maxSalary(employees));
            bufferedWriter.newLine();
            bufferedWriter.write("All employees: " + employees.length);
            bufferedWriter.newLine();
            bufferedWriter.write("Employees on management: " + CompanyUtils.howMuchEmployeesOnSection(employees, "Management"));
            bufferedWriter.newLine();
            bufferedWriter.write("Employees on it: " + CompanyUtils.howMuchEmployeesOnSection(employees, "it"));
            bufferedWriter.newLine();
            bufferedWriter.write("Employees on Support: " + CompanyUtils.howMuchEmployeesOnSection(employees, "Support"));
            bufferedWriter.newLine();
            bufferedWriter.close();
        } else {
            System.err.println("File output already exist");
        }
    }
}
