package main;
public class Spider extends Animal {
    public Spider () {
        super(8);
    }
    
    @Override
    public void Eat (){
        System.out.println("How and what spider eat: \n1.spiders eat insects and they inject their prey with poison using their fangs. The poison turns the insides of insect to a watery goop and the spider just sucks it up");
    }
}
