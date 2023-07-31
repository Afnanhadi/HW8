public class Employee {
    private String id;
    private String name;
    private int salary;
    public void setId(String id){
        this.id=id;
    }public  String getId(){
        return id;
    }public void setName(String name){
        this.name=name;
    }public String getName(){
        return name;
    }public void setSalary(int salary){
        this.salary=salary;
    }public int getSalary(){
        return salary;

    }public void Employee(String id,String name,int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    public int getAnnualSalary(){
       int annual=salary*12;
        salary=annual;
        return salary;
    }public int raisedSalary(int percent){
       int r=salary*percent/100;
       salary=salary+r;
        return salary;
    }public String toString(){
        return "ID: "+id+"\n"+"Name: " +name+ "\nSalary: "+salary;
    }
    public static void main(String[] args) {
        System.out.println("Welcome this program Account:");
        Employee employee=new Employee();
        employee.Employee("44185923","Afnan",100);
        employee.getAnnualSalary();
        System.out.println("Employee Annual Salary:"+employee.getSalary());
        employee.raisedSalary(500);
        System.out.println("Employee Raised Salary:"+employee.getSalary());
         System.out.println(employee.toString());
    }
}
