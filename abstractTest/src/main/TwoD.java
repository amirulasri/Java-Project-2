/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author amiru
 */
public abstract class TwoD {
    protected double area;
    protected double perimeter;
    
    public TwoD(){
        area = 0;
        perimeter = 0;
    }
    
    public double getArea(){
        return area;
    }
    
    public double getPerimeter(){
        return perimeter;
    }
    
    abstract public void calculateArea();
    
    abstract public void calculatePerimeter();
    
    abstract public String display();
}
