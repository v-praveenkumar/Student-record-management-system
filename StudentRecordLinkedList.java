import java.util.Scanner;
 
public class StudentRecordLinkedList {
 
    public static void main(String[] args)
    {
 
        StudentRecordManagement student = new StudentRecordManagement();
        Record record = new Record();
        Scanner input = new Scanner(System.in);
        int option = 0;
        do {
            menu();
            option = input.nextInt();
            switch (option) {
            case 1:
 
                System.out.print("What is the Student id Number ? "); 
                int idNumber = input.nextInt();
                System.out.print("What is the Student contact Number ? ");
                int contactNumber = input.nextInt();
                input.nextLine();
                System.out.print("What is the Student Name ? ");
                String name = input.nextLine();
                record = new Record(name, idNumber,contactNumber);
                student.add(record);
                System.out.println(record.toString());
                break;
            case 2:
                System.out.print("What is the Student id number ? ");
                int sId = input.nextInt();
                student.delete(sId);
                break;
            case 3:
                System.out.print("What is the Student id number? ");
                int rIdNo = input.nextInt();
                student.update(rIdNo, input);
                break;
            case 4:
                System.out.print("What is the Student id ? ");
                int bookId = input.nextInt();
                if (!student.find(bookId)) {
                    System.out.println("Student id does not exist\n");
                }
                break;

            case 5:
                student.display();
                break;
            case 9:
                System.exit(0);
                break;
            default:
                System.out.println("\nInvalid input\n");
                break;
            }
        }
        while (option != 9);
    }
    public static void menu()
    {
        System.out.println("MENU");
        System.out.println("1: Add Student");
        System.out.println("2: Delete Student");
        System.out.println("3: Update Student");
        System.out.println("4: Search Student");
        System.out.println("5: Display Students");
        System.out.println("9: Exit program");
        System.out.print("Enter your selection : ");
    }
}
