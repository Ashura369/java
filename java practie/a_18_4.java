

import java.util.*;
import bank.*;
// import bank.account;


class Shape {
   public void area() {
       System.out.println("Displays Area of Shape");
   }
}
class Triangle extends Shape {
   public void area(int h, int b) {
       System.out.println((1/2)*b*h);
   }  
}
class Circle extends Shape {
   public void area(int r) {
       System.out.println((3.14)*r*r);
   }  
}


public class a_18_4 {
    public static void main(String[] args) {
        account ac1 = new account();
        ac1.name = "Pradhan";
   }
}
