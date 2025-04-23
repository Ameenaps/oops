import java.util.Scanner;
class Area
{
  double calc(double r)
  {
     return Math.PI * (r * r);//circle
  }
    int calc(int side)
  {
     return side*side;    //square
  }
    int calc(int l,int b) //rectangle
  {
     return l*b;
  }
    double calc(double base,double h)
  {
     return 0.5*base*h; //triangle
  }
  public static void main(String args[])
  {
      Scanner sc=new Scanner(System.in);
      Area a=new Area();
      System.out.print("Enter the radius of circle :");
      double r=sc.nextInt();
      System.out.print("Area of circle =: "+a.calc(r));
      System.out.print("\nEnter the side of square :");
      int s=sc.nextInt();
      System.out.print("\nArea of square =: "+a.calc(s));
      System.out.print("\n Enter the length of rectangle :");
      int l=sc.nextInt();
      System.out.print("\n Enter the breadth of rectangle :");
      int b=sc.nextInt();
      System.out.print("\nArea of rectangle =: "+a.calc(l,b));
      System.out.print("\n Enter the base of triangle :");
      double base=sc.nextInt();
      System.out.print("\n Enter the height of triangle :");
      double h=sc.nextInt();
      System.out.print("\nArea of triangle =: "+a.calc(base,h));
    }
}
