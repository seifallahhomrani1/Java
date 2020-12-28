package oop;

public class Main {
    public static void main(String[] args){


        //creating new instance of the class pen
        Pen p = new Pen();


        //printing out the pen default value
        System.out.println(p.color);
        System.out.println(p.type);
        System.out.println(p.clicked);


        //Clicking the pen
        p.click();
        //Checking if the pen is clicked or not
        System.out.println(p.clicked);
        
        



    }
    

    
}
