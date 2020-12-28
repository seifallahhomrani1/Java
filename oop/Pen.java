package oop;

public class Pen {
    String color = "blue"; 
    String type = "gel"; 
    int point = 10; 


    boolean clicked = false; 
    
    public  void click(){
        clicked = true;
    }

    public  void unclick() {
        clicked = false;
    }
    
}