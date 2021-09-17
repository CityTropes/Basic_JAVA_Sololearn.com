import java.util.Scanner;

abstract class Shape {
    int width;
    abstract void area();
}
//your code goes here
class Square extends Shape{
    public int area1;
    public Square(int x){
        width = x;
    }
    public void area(){
        area1 = width*width;
        System.out.println(area1);
    }
}

class Circle extends Shape{
    public double area2;
    public Circle(int y){
        width = y;
    }
    public void area(){
        area2 = Math.PI*width*width;
        System.out.println(area2);
    }
}

public class Shapes {
    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        Square a = new Square(x);
        Circle b = new Circle(y);
        a.area();
        b.area();
    }
}

//sololearn.com Module 5: Shapes