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
public class ETriangle extends Shape {
    
    private double sideE = 0;
    
    public ETriangle(String name){
        super(name);
    }
    
    public void setETriDimensions(double e){
        this.sideE = e;
    }
    
    @Override
    public void printDimensions(){
        System.out.println("This is a square.\nSide Length = " +sideE);
        
    }
    
    @Override
    public double getArea(){
        double side = ((this.sideE + this.sideE + this.sideE)/2);
        return (Math.sqrt(side*(side - this.sideE)*(side-this.sideE)*(side-this.sideE)));
    }
    
    
}
