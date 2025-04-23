import java.util.Scanner;

class Employee {
    int Empid, Salary;
    String Name, Address;
    Employee(int empid, String name, int salary, String address) {
        this.Empid = empid;
        this.Salary = salary;
        this.Name = name;
        this.Address = address;
    }
    void display() {
        System.out.println("Employee name: " + Name +
                           "\nEmployee id: " + Empid +
                           "\nEmployee salary: " + Salary +
                           "\nEmployee address: " + Address);
    }
}
class Teacher extends Employee {
    String Department, Subject;

    Teacher(int empid, String name, String address, String department, int salary, String subject) {
        super(empid, name, salary, address);
        this.Department = department;
        this.Subject = subject;
    }
    void display() {
        super.display();
        System.out.println("Department name: " + Department +
                           "\nEmployee subject: " + Subject);
    }
}
class Showdetails {
    public static void main(String args[]) {
        int n, id, salary;
        String name, address, department, subject;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        n = sc.nextInt();
        sc.nextLine(); 
        Teacher[] T = new Teacher[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEmployee: " + (i + 1));
            System.out.print("Enter the employee id: ");
            id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter the employee name: ");
            name = sc.nextLine();
            System.out.print("Enter the employee salary: ");
            salary = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter the employee address: ");
            address = sc.nextLine();
            System.out.print("Enter the employee department: ");
            department = sc.nextLine();
            System.out.print("Enter the employee subject: ");
            subject = sc.nextLine();
            T[i] = new Teacher(id, name, address, department, salary, subject);
        }
        System.out.println("\nDetails of employees:");
        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Employee " + (i + 1) + " ---");
            T[i].display();
        }
        sc.close();
    }
}
