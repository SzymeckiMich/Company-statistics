import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

//        Employee[] employees = new Employee[3];
//        employees[0] = new Employee("Jan", "Kowalki", "123456789", "Managment", 6000);
//        employees[1] = new Employee("Paweł", "Klocek", "000000000", "Magasine", 5000);
//        employees[2] = new Employee("Michał", "Klocekeke", "0000004564", "Managment", 5000);
//        FileUtils.save(employees, "pracownicy.txt");

        try {
            File file = new File("pracownicy.txt");
            Employee[] employee2 = FileUtils.employeesArray(file);
//            FileUtils.showInfo(employee2);
            FileUtils.statsToCSV(employee2);
        }
        catch (FileNotFoundException ex){
            System.err.println("Input file not exist");
        }



//        System.out.println("Employees on management: " + CompanyUtils.howMuchEmployeesOnSection(employee2,
//                "Management"));
//        System.out.println("Avarage salary: "  + CompanyUtils.avarageSalary(employee2));
//        System.out.println("Min salary: " + CompanyUtils.minSalary(employee2));
//        System.out.println("Max salary: " + CompanyUtils.maxSalary(employee2));


    }
}
