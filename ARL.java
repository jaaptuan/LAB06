package Lab06;

import java.util.ArrayList;
import java.util.Date;

public class ARL {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>() ;

        list.add(new loan(500)) ;
        list.add(new Date()) ;
        list.add("ABC") ;
        list.add(new Circle(125)) ;
    }
    
}

class loan {
    private double loan;

    public loan(){
    }
    public loan(double amount){
        loan = amount;
    }
    public String toString(){
        return ("Loan Amount : " + loan);
    }
}

class Circle {
    private double radius ;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius ;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2) ;
    }

    public String toString() {
        return ("Area is : " + getArea()) ;
    }
}