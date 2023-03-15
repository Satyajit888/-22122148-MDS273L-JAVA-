import java.util.*;

class Student {
    float reg_no;
    String nm, dept, email, cls;
    long phn_num;

    public Student(float reg_no, String nm, String dept, String email, String cls, Long phn_num) {
        this.cls = cls;
        this.dept = dept;
        this.email = email;
        this.nm = nm;
        this.phn_num = phn_num;
        this.reg_no = reg_no;
    }

    public void print() {
        System.out.println("Name and registration number of the student: " + this.nm + "-" + this.reg_no);
        System.out.println("Class and department: " + this.cls + "-" + this.dept);
        System.out.println("Contact details of the student: " + this.email + " and " + this.phn_num);
    }
}

public class LAB5 {
    private static final int MAX_STUDENTS = 100;
    private static final Student[] students = new Student[MAX_STUDENTS];
    private static int numStudents = 0;
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Add a student");
            System.out.println("2. Search for a student");
            System.out.println("3. Display all students");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    searchStudent();
                    break;
                case 3:
                    displayStudents();
                    break;
                case 0:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 0);
    }

    private static void addStudent() {
        if (numStudents == MAX_STUDENTS) {
            System.out.println("Sorry, the student database is full.");
            return;
        }
        else{
        System.out.println("Enter name and registration number of the student: ");
        String nm = scanner.next();
        float reg_no = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("Enter contact details-Email and phone number respectively: ");
        String email = scanner.next();
        long phn_num = scanner.nextLong();
        scanner.nextLine();
        System.out.println("Enter class and department: ");
        String cls = scanner.next();
        String dept = scanner.next();
        Student student = new Student(reg_no, nm, dept, email, cls, phn_num);
        students[numStudents] = student;
        numStudents++;
        System.out.println("Student added successfully.");
        }
    }

    private static void searchStudent() {
        System.out.println("Enter the registration number of the student to search: ");
        float reg_no = scanner.nextFloat();
        for (int i = 0; i < numStudents; i++) {
            if (students[i].reg_no == reg_no) {
                students[i].print();
                return;
            }
        }
        System.out.println("Student not found.");
    }

    private static void displayStudents() {
        if (numStudents == 0) {
            System.out.println("No students added yet.");
            return;
        }
        System.out.println("List of students:");
        for (int i = 0; i < numStudents; i++) {
            students[i].print();
        }
    }
}
