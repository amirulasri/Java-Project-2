package main;

/**
 *
 * @author amiru
 */
public class Instructor extends Employee {
    private String field;
    private int level_of_expertise;
    
    //CONTRUCTOR WITHOUT PARAMETER
    public Instructor(){
        super();
        field = "";
        level_of_expertise = 0;
    }
    
    //CONSTRUCTOR WITH PARAMETER
    public Instructor(String name, double salary, String field, int level_of_expertise){
        super(name, salary);
        this.field = field;
        this.level_of_expertise = level_of_expertise;
    }
    
    //PROCESSOR
    public char getCategory(){
        char category = '-';
        if(field.equalsIgnoreCase("Computer Science")){
            if((level_of_expertise >= 1) && (level_of_expertise <=3)){
                category = 'B';
            }else if((level_of_expertise >= 4) && (level_of_expertise <= 5)){
                category = 'A';
            }
        }else if(field.equalsIgnoreCase("Business")){
            if((level_of_expertise >= 1) && (level_of_expertise <=4)){
                category = 'B';
            }else if(level_of_expertise >= 5){
                category = 'A';
            }
        }
        return category;
    }
    
    //MUTATOR
    public void setallinstructordata(String field, int level_of_expertise){
        this.field = field;
        this.level_of_expertise = level_of_expertise;
    }
    
    public void setfield(String field){
        this.field = field;
    }
    
    public void setlevelofexpertise(int level_of_expertise){
        this.level_of_expertise = level_of_expertise;
    }
    
    //ACCESSOR
    public String getfield(){
        return field;
    }
    
    public int getlevelofexpertise(){
        return level_of_expertise;
    }
    
    public String toString(){
        return "Name: " + super.getname() + "\nSalary: " + super.getsalary() + "\nField: " + field + "\nExpertise level: " + level_of_expertise;
    }
}
