/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis3515_lab_worksheet0;

/**
 *
 * @author hyaci
 */
public class Square extends Shape {
   
    //private String name;
    private double length = 0;
    private double height = 0; 
    
    public Square(String name){
        super(name);  
    }
    
    public void setSQDimensions(double l, double h){
        this.length = l;
        this.height = h;
    }
    
    @Override
    public void printDimensions(){
        System.out.println("This is a square.\n Length: " +length+ "\n Height: " +height);
    }
    
    @Override
    public double getArea(){
        return (this.length * this.height);
    }
   
    
    
 
}
