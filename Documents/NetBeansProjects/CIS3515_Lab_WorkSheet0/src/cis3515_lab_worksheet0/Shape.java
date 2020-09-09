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
public class Shape {
    
    private String name;
    
    public Shape(String name){
        this.name = name; 
    }
    
    /** returns name of shape **/
    public String getName(){
        return name;
    }
    
    /** returns area **/
    public double getArea(){
        return 0.0;
    }
    
    public void printDimensions(){
        System.out.println("This is a Shape. No dimensions");
    }
}
