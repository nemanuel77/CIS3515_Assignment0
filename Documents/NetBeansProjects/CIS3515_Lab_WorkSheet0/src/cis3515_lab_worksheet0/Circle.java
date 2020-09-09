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
public class Circle extends Shape {
    
    double radius; 
    
    public Circle(String name){
        super(name);  
    }
    
     public void setCIRDimensions(double r){
        this.radius = r;
       
    }
     
      @Override
    public void printDimensions(){
        System.out.println("This is a circle.\n Radius: " +radius+ "\n");
    }
    
     @Override
    public double getArea(){
        return (Math.PI * this.radius * this.radius);
    }
    
    
}
