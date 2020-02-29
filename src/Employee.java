public class Employee {
    private String firstName;
    private String lastName;
    private String pesel;
    private String section;
    private double salary;

    public Employee(String firstName, String lastName, String pesel, String section, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
        this.section = section;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    String toCSV() {
        return firstName + ";" + lastName + ";" + pesel + ";" + section + ";" + salary;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + pesel + " " + section + " " + salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getSection() {
        return section;
    }
}
