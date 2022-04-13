package main;

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
