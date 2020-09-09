/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis3515_lab_worksheet0;
import java.util.Scanner;

/**
 *
 * @author hyaci
 */
public class CIS3515_Lab_WorkSheet0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Please enter the name of your Square: ");
        String sq = kb.next();
        
        System.out.println("Please enter the length variable of your Square: ");
        double l = kb.nextInt();
        
        System.out.println("Please enter the height variable of your Square: ");
        double h = kb.nextInt();
        
        System.out.println("Please enter the name of your Circle: ");
        String cir = kb.next();
        
        System.out.println("Please enter the radius variable of your Circle: ");
        double rad = kb.nextInt();
        
        System.out.println("Please enter the name of your Triangle: ");
        String tri = kb.next();
        
        System.out.println("Please enter the dimension of Side A of your Triangle: ");
        double sA = kb.nextInt();
        
        System.out.println("Please enter the dimension of Side B of your Triangle: ");
        double sB = kb.nextInt();
        
        System.out.println("Please enter the dimension of Side C of your Triangle: ");
        double sC = kb.nextInt();
        
        
        System.out.println("Please enter the name of your Equilateral Triangle: ");
        String etri = kb.next();
        
        System.out.println("Please enter the dimension of a side for your Equilateral Triangle: ");
        double sideE = kb.nextInt();
        
        
        
        
   
        Square Square = new Square(sq);
        Square.setSQDimensions(l,h);
        
        Circle Circle = new Circle(cir);
        Circle.setCIRDimensions(rad);
        
        Triangle Triangle = new Triangle(tri);
        Triangle.setTriDimensions(sA, sB, sC);
        
        ETriangle ETriangle = new ETriangle(etri);
        ETriangle.setETriDimensions(sideE);
        
        
        
        
        
        System.out.println(Square.getName());
        Square.printDimensions();
        System.out.println("Area: " +Square.getArea());
        
        System.out.println(Circle.getName());
        Circle.printDimensions();
        System.out.println("Area: " + Circle.getArea());
        
        System.out.println(Triangle.getName());
        Triangle.printDimensions();
        System.out.println("Area: " +Triangle.getArea());
        
        System.out.println(ETriangle.getName());
        ETriangle.printDimensions();
        System.out.println("Area: " + ETriangle.getArea());
        
        
        
        
        
        
        
    }
    
}
