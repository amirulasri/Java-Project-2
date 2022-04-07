package main;
public class Herbivor extends Animal implements DietMeal{
    private String Food;
    private int yearLive;
    
    public Herbivor(String Food, int yearLive, int age, double weight){
        super(age, weight);
        this.Food = Food;
        this.yearLive = yearLive;
    }
    
    public String toString(){
        return "Food: " + Food + "\nYear Live: " + yearLive + "\nAge: " + age + "\nWeight: " + weight;
    }

    @Override
    public void whatToEat() {
        
    }
}
