package main;
public class Cat extends Animal implements Pet{
    private String name;
    
    public Cat (String n){
        super(4);
        this.name = n;
    }
    
    @Override
    public void Play (){
        System.out.println("How cat ("+name+") play: \n1.");
    }
    
    @Override
    public void Walk(){
        System.out.println("How cat ("+name+") walk: \n1." + "\nNumber of legs: " + super.legs);
    }
    
    @Override
    public void Eat (){
        System.out.println("How and what cat ("+name+") eat: \n1.");
    }
}