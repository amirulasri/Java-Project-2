/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author amiru
 */
public class PersonPoly {
    private String name;
    private int age;
    
    public PersonPoly(){
        name = "";
        age = 0;
    }
    public PersonPoly(String s, int a){
        name = s;
        age = a;
    }
    public void setPersonPoly(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String toString(){
        return ("\nName: " + name + "\nAge: "+ age);
    }
}
