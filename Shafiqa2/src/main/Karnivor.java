package main;
public class Karnivor extends Animal implements DietMeal{
    private String name;
    
    public Karnivor(String Name, int age, double weight){
        super(age, weight);
        this.name = Name;
    }
    
    public String toString(){
        return "Name: " + name + "\nAge: " + age + "\nWeight: " + weight;
    }

    @Override
    public void whatToEat() {
        System.out.println("");
    }
}