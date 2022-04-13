package main;
abstract class Animal {
    protected int legs;
    
    protected Animal (int legs){
        this.legs = legs;
    }
    
    public void Walk () {
        System.out.println("Number of legs: " + legs);
    }
    
    public abstract void Eat ();
}