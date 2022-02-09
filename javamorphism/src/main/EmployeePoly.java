/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author amiru
 */
public class EmployeePoly extends PersonPoly{
    private String staff_id;
    private double salary;
    
    public EmployeePoly(){
        super();
        staff_id = "Not available";
        salary = 0.00;
    }
    public EmployeePoly(String n, int a, String id, double salary){
        super(n,a);
        staff_id = id;
        this.salary = salary;
    }
    public String getID(){
        return staff_id;
    }
    public double getSal(){
        return salary;
    }
    public String getName(){
        return ("Employee Name: " + super.getName());
    }
    public String toString(){
        return (super.toString()+"\nStaff ID: "+staff_id+"\nSalary: "+salary);
    }
}
