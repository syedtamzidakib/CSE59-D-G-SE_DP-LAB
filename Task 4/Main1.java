class TeamMember {
    protected String name;
    public TeamMember(String name){
    this.name = name;
    }
    public void displayname(){
        System.out.println("Name:"+ name);}
    
}
class Employee extends TeamMember{
    public Employee(String name){
    super(name);
}
    public void calculateBonus(){
    System.out.println("Calculating standard Emp bonus..");
}
}
class Contractor extends TeamMember{
    public Contractor(String name){
        super (name);
    }
    public void work(){
        System.out.println(name+" is a contractor.");
    }
}
public class Main1{
    public static void main(String[] args) {
        Employee emp = new Employee("Alice");
        emp.displayname();
        emp.calculateBonus();
        
        Contractor contractor = new Contractor("John");
        contractor.displayname();
        contractor.work();
    }
}


