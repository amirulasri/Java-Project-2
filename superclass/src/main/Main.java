package main;

import java.util.Scanner;

/**
 *
 * @author amiru
 */
public class Main {

    public static void main(String[] args) {
        
        String name;
        double salary;
        String field;
        int level_of_expertise;

        Instructor[] instructorArr = new Instructor[2];
        
        Scanner userinput = new Scanner(System.in);
        for (int i = 0; i < instructorArr.length; i++) {
            System.out.println("Enter detail for Employee " + (i + 1));
            System.out.print("Employee name: ");
            name = userinput.nextLine();
            System.out.print("Employee salary: ");
            salary = userinput.nextDouble();
            System.out.print("Instructor field: ");
            userinput.nextLine();
            field = userinput.nextLine();
            System.out.print("Instructor expertise level: ");
            level_of_expertise = userinput.nextInt();
            userinput.nextLine();

            //NEW OBJECT DECLARE
            instructorArr[i] = new Instructor(name, salary, field, level_of_expertise);
            System.out.println("\n");
        }

        System.out.println("--All Saved Data--");
        for (int i = 0; i < instructorArr.length; i++) {
            System.out.println("Data " + (i+1));
            System.out.println(instructorArr[i].toString());
            System.out.println("Category: "+instructorArr[i].getCategory() + "\n");
        }
        
        //FIND WHO IN COMPUTER SCIENCE
        int computercount = 0;
        for (int i = 0; i < instructorArr.length; i++){
            String course = instructorArr[i].getfield();
            if(course.equalsIgnoreCase("Computer Science")){
                computercount++;
            }
        }
        
        System.out.println("Number of who in computer science: " + computercount);
    }
}
