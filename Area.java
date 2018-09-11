import java.util.Scanner;
 public class Area {
  int length;
  int breadth;
   public int CalculateArea()
  {
      int l,b;
      l=this.length;
      b=this.breadth;
      return l*b;
  }
   public static void main(String[] args)
  {
      Area obj1=new Area();
      Scanner obj2=new Scanner(System.in);
       System.out.println("Enter length:");
      obj1.length=obj2.nextInt();
      System.out.println("Enter breadth:");
       obj1.breadth=obj2.nextInt();
      System.out.println("Area of Rectangle:"+obj1.CalculateArea());
  }
} 