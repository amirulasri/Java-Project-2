/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package objectoriented;

/**
 *
 * @author amirul asri
 */
public class main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        test2 message = new test2();
        //message.display();
        int nombor = message.getNombor();
        System.out.println(nombor);
        
        // TODO code application logic here
    }
    
}

class test2{
    private int nombor = 13;
    public void display(){
        System.out.println("OK!!!");
    }
    
    //ACCESSOR TO nombor VARIABLE
    public int getNombor(){
        return nombor;
    }
}
