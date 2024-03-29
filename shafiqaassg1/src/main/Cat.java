package main;
public class Cat extends Animal implements Pet{
    private String name;
    
    public Cat (String n){
        super(4);
        this.name = n;
    }
    
    @Override
    public void Play (){
        System.out.println("How cat ("+name+") play: \n1. Cats like movement so the toy must be one that can move in rapid and unpredictable ways, just like a mouse or bird");
    }
    
    @Override
    public void Walk(){
        System.out.println("How cat ("+name+") walk: \n1.Cats are digitigrade; that is, they walk on their toes and the ball of the foot." + "\nNumber of legs: " + super.legs);
    }
    
    @Override
    public void Eat (){
        System.out.println("How and what cat ("+name+") eat: \n1. cat is eating meat, he'll use his incisors to shred the meat into chunks, but he'll also use the papillae on his tongue");
    }
}
