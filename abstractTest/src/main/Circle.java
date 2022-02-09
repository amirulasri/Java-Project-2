/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author amiru
 */
public class Circle extends TwoD {
    private double radius;
    public Circle(){
        super();
        radius = 0;
    }
    
    //SETTER
    public void setRadius(double radius){
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        area = Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void calculatePerimeter() {
        perimeter = 2 * Math.PI * radius;
    }

    @Override
    public String display() {
        return "Radius: " + radius + "\nArea: " + area + "\nPerimeter: " + perimeter;
    }
    
    
}
