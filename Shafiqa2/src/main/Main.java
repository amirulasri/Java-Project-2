package main;
public class Main {
    public static void main(String[] args) {
        Karnivor myKarn = new Karnivor("harimau", 30, 120);
        Herbivor myHerb = new Herbivor("Grass", 40, 40, 130);
        
        System.out.println(myKarn.toString());
        System.out.println(myHerb.toString());
    }
}
