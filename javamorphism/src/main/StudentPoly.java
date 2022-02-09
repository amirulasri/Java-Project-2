/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author amiru
 */
public class StudentPoly extends PersonPoly {
    private String matric_id;
    private double cgpa;
    
    public StudentPoly(){
        super();
        matric_id = "Not available";
        cgpa = 0.00;
    }
    
    public StudentPoly(String n, int a, String matric_id, double cgpa){
        super(n,a);
        this.matric_id = matric_id;
        this.cgpa = cgpa;
    }
    public String getID(){
        return matric_id;
    }
    public double getcgpa(){
        return cgpa;
    }
    public String getName(){
        return ("Student Name: " + super.getName());
    }
    public String toString(){
        return(super.toString() +"\nId: " + matric_id + "\ncgpa: " + cgpa);
    }
}
