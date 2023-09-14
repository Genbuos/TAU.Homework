package chapter9;
//extends forms an inheritence relationship with the person class
public class Employee extends Person{
    //Employee can have additional properties that are specific to  employee



    private String employeeId;
    private String title;

    public Employee(){
        //Because we are inheriting from the person class the person constructor will be called first,
        // but if we want the employee constructor to be called first we can explicitly state that
        // by using the "super" keyword which will call to the constructor of the super class
        // and passing the required arguments to any other constructor that we want to call-9b

//        super("Jordy");
        System.out.println("In Employee default constructor");
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
