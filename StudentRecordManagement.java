import java.util.LinkedList;
import java.util.Scanner;
 
public class StudentRecordManagement {
    LinkedList<Record> list;
 
    public StudentRecordManagement()
    {
        list = new LinkedList<>();
    }
 
    // Adding Record
    // @param record
    public void add(Record record)
    {
        if (!find(record.getIdNumber())) {
            list.add(record);
        }
        else {
            System.out.println("Record already exists in the Record list");
        }
    }
 
    // @param idNumber
    //  @return
    public boolean find(int idNumber)
    {
        for (Record l : list) {
            if (l.getIdNumber() == idNumber) {
 
                System.out.println(l);
                return true;
            }
        }
        return false;
    }
    // Delete Record
    // @param recIdNumber
    public void delete(int recIdNumber)
    {
        Record recordDel = null;
 
        // Iterating record list
        for (Record ll : list) {
 
            // Finding record to be deleted by id Number
            if (ll.getIdNumber() == recIdNumber) {
                recordDel = ll;
            }
        }
        if (recordDel == null) {
            System.out.println("Invalid record Id");
        }
        else {
            list.remove(recordDel);
            System.out.println(
                "Successfully removed record from the list");
        }
    }
    // @param idNumber
    // @return
    public Record findRecord(int idNumber)
    {
 
        // Iterate Record list
        // using for each loop
        for (Record l : list) {
 
            // Checking record by id Number.
            if (l.getIdNumber() == idNumber) {
                return l;
            }
        }
 
        return null;
    }
    // @param id
    // @param input
    public void update(int id, Scanner input)
    {
 
        if (find(id)) {
            Record rec = findRecord(id);
 
            // Display message only
            System.out.print(
                "What is the new Student id Number ? ");
            int idNumber = input.nextInt();
 
            // Display message only
            System.out.print(
                "What is the new Student contact Number ");
            int contactNumber = input.nextInt();
            input.nextLine();
 
            // Display message only
            System.out.print(
                "What is the new Student Name ? ");
            String name = input.nextLine();
 
            rec.setIdNumber(idNumber);
            rec.setName(name);
            rec.setContactNumber(contactNumber);
            System.out.println(
                "Record Updated Successfully");
        }
        else {
            System.out.println("Record Not Found in the Student list");
        }
    }
    public void display()
    {
        if (list.isEmpty()) {
            System.out.println("The list has no records\n");
        }
        for (Record record : list) {
            System.out.println(record.toString());
        }
    }
}
