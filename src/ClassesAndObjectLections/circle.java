package ClassesAndObjectLections;

import java.awt.event.MouseAdapter;

public class circle {
    static  class Circle {
        double radius;

        Circle (double radius){
            this.radius = radius;
        }

        double getRadius (){
            return this.radius;
        }

        void setRadius (double radius){
            this.radius = radius;
        }

       double getArea(){
           return radius * radius * Math.PI;
       }

       void scale (double factor){
           radius *= factor;
       }
    }

    public static void main(String[] args) {
        Circle c = new Circle(5);
//        c.radius = 5;
        c.setRadius(7);
        System.out.println(c.getArea());

        Circle c2 = new Circle(10);
//        c2.radius = 10;
        c2.scale(2);
        System.out.println(c2.getArea());
    }
}
