package main;
abstract class Animal {
    protected int legs;
    
    protected Animal (int legs){
        this.legs = legs;
    }
    
    public void Walk () {
        System.out.println("The animal have: "+ legs +".This animals walks like Hopping is the movement for rabbits due to their powerful hind legs");
    }
    
    public abstract void Eat ();
}
