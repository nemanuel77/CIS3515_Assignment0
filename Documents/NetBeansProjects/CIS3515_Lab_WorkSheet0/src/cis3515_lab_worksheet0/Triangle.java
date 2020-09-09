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
public class Triangle extends Shape {
    private double sideA = 0;
    private double sideB = 0;
    private double sideC = 0;
    
    
    public Triangle(String name){
        super(name);
    }
    
    public void setTriDimensions(double a, double b, double c){
        this.sideA = a;
        this.sideB = b;
        this.sideC = c;
        
    }
    
    @Override
    public void printDimensions(){
        System.out.println("This is a Triangle.\nSide A = " +sideA + "\nSide B = " +sideB+ "\nSide C = " +sideC);
        
    }
    
    @Override
    public double getArea(){
        double side = ((this.sideA + this.sideB + this.sideC)/2);
        return (Math.sqrt(side*(side - this.sideA)*(side-this.sideB)*(side-this.sideC)));
        
    }
    
}
