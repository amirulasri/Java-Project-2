package main;
public class HelloPet implements Pet{
    private String name = "Virtual Pet";

    @Override
    public void Play() {
        System.out.println("How to play ("+name+"): \n1. Playing with cat by feeding,take your pet out for a walk,by clicking on buttons");
    }
    
}
