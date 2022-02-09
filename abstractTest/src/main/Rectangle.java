/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author amiru
 */
public class Rectangle extends TwoD {    
    private double width;
    private double len;
    
    public Rectangle(){
        super();
        width = 0;
        len = 0;
    }
    
    //SETTER
    public void setWidth(double width){
        this.width = width;
    }
    
    public void setLength(double length){
        this.len = length;
    }

    @Override
    public void calculateArea() {
        area = len * width;
    }

    @Override
    public void calculatePerimeter() {
        perimeter = 2 * len + 2 * width;
    }

    @Override
    public String display() {
        return "Length: " + len + "\nWidth: " + width + "\nArea: "+ area + "\nPerimeter: "+ perimeter;
    }
}
