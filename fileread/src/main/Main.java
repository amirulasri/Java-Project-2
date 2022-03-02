/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("C:\\Users\\amiru\\Downloads\\example1.txt");
        //BufferedReader br = new BufferedReader(fr);
        Scanner in = new Scanner(fr);
        
        String name = "", salary2 = "";
        int salary = 0, totalSalary = 0;

        while(in != null){
            name = in.nextLine();
            salary2 = in.nextLine();
            
            salary = Integer.parseInt(salary2);
            
            System.out.println(name.toUpperCase());
            System.out.println(salary2);
            
            totalSalary = totalSalary + salary;
        }
        System.out.println("\nTotal salary is : " + totalSalary);
        System.out.println("\nThere is no more data inside the file!!");
        in.close();
    }
}
