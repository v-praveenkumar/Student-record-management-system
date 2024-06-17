public class Record {
 
    // Instance variables
    private String name;
    private int idNumber;
    private int contactNumber;
    public Record() {}

    // @param name
    // @param idNumber
    // @param contactNumber
    public Record(String name, int idNumber,int contactNumber)
    {
        this.name = name;
        this.idNumber = idNumber;
        this.contactNumber = contactNumber;
    }
 
    // @return the value of contactNumber
    public int getContactNumber() { return contactNumber; }
 
    // @param contactNumber new value of contactNumber
    public void setContactNumber(int contactNumber)
    {
 
        this.contactNumber = contactNumber;
    }
    // @return the value of idNumber
    public int getIdNumber() { return idNumber; }

    // @param idNumber new value of idNumber
    public void setIdNumber(int idNumber)
    {
        this.idNumber = idNumber;
    }
 
    // @return the value of name
    public String getName() { return name; }
 
    // @param name new value of name
    public void setName(String name) { this.name = name; }
 
    // toString() Method
    // @return
    @Override public String toString()
    {
 
        // Returning the record
        return "Records{"
            + "name=" + name + ", idNumber=" + idNumber
            + ", contactNumber=" + contactNumber + '}';
    }
}
