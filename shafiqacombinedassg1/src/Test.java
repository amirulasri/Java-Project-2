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

interface Pet {
    public void Play ();
}

class Spider extends Animal {
    public Spider () {
        super(8);
    }
    
    @Override
    public void Eat (){
        System.out.println("How and what spider eat: \n1.spiders eat insects and they inject their prey with poison using their fangs. The poison turns the insides of insect to a watery goop and the spider just sucks it up");
    }
}

class Cat extends Animal implements Pet{
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

class HelloPet implements Pet{
    private String name = "Virtual Pet";

    @Override
    public void Play() {
        System.out.println("How to play ("+name+"): \n1. Playing with cat by feeding,take your pet out for a walk,by clicking on buttons");
    }
    
}



public class Test {
    public static void main(String[] args) {
        Cat c = new Cat("Fluffy");
        Animal a = new Spider();
        HelloPet t = new HelloPet();

        //Demonstrate different implementations of an interface 
        c.Play();
        t.Play();
        
        //Demostrate virtual method invocation 
        c.Eat();
        a.Eat();
        a.Walk();
    }
}
