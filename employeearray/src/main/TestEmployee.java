/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author amirul asri
 */
public class TestEmployee {
    public static void main(String[] args) {
        
    }
}

class Employee{
    private String name;
    private int age;
    private String gender;
    private double salary;
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setGender(String gender){
        this.gender = gender;
    }
    
    public String getGender(){
        return gender;
    }
    
    public void setSalary(double salary){
        this.salary = salary;
    }
    
    public double getSalary(){
        return salary;
    }
    
    @Override
    public String toString(){
        return "Name: " + name + "\nAge: " + age + "\nGender: " + gender + "\nSalary: " + salary;
    }
}