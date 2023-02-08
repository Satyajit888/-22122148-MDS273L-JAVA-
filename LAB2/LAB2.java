import java.util.Scanner;

public class LAB2 {
    
    public static void main(String[] args) {
        String[] names = new String[1024]; 
        int count = 0;

        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Enter a name");
            System.out.println("2. Search for a name");
            System.out.println("3. Remove a name");
            System.out.println("4. Show all names");
            System.out.println("5. Exit");
            System.out.println("0. Press '0' to continue");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter a name: ");
                    String name = sc.nextLine();
                    boolean isValid = true;
                    for (int i = 0; i < count; i++) {
                        if (names[i].equals(name)) {
                            System.out.println("Name already exists. Try again.");
                            isValid = false;
                            break;
                        }
                    }
                    if (!isValid) {
                        break;
                    }
                    if (name.isEmpty() || name.length() > 100) {
                        System.out.println("Invalid name. Try again.");
                        break;
                    }
                    names[count++] = name;
                    System.out.println("Name added successfully.");
                    break;
                case 2:
                    System.out.print("Enter a name to search: ");
                    name = sc.nextLine();
                    boolean found = false;
                    for (int i = 0; i < count; i++) {
                        if (names[i].equals(name)) {
                            System.out.println("Name found.");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Name not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter a name to remove: ");
                    name = sc.nextLine();
                    found = false;
                    for (int i = 0; i < count; i++) {
                        if (names[i].equals(name)) {
                            for (int j = i; j < count - 1; j++) {
                                names[j] = names[j + 1];
                            }
                            count--;
                            System.out.println("Name removed successfully.");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Name not found.");
                    }
                    break;
                case 4:
                    System.out.println("All names:");
                    for (int i = 0; i < count; i++) {
                        System.out.println(names[i]);
                    }
                    break;
                case 0:
                    System.out.println("Exiting the program...");
                    break;
                }
            }
            while (choice != 5);
    System.out.println("Exiting program...");
  }
}

