package main;

/**
 *
 * @author amiru
 */
public class Employee {
    protected String name;
    protected double salary;
    
    //CONTRUCTOR WITHOUT PARAMETER
    public Employee(){
        name = null;
        salary = 0;
    }
    
    //CONSTRUCTOR WITH PARAMETER
    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    
    //MUTATOR - SET VALUE INTO OBJECT/CLASS 
    public void setallemployeedata(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    
    public void setname(String name){
        this.name = name;
    }
    
    public void setsalary(double salary){
        this.salary = salary;
    }
    
    //ACCESSOR
    public String getname(){
        return name;
    }
    
    public double getsalary(){
        return salary;
    }
    
    public String toString(){
        return "Employee Name: " + name + "\nSalary: " + salary;
    }
    
}
