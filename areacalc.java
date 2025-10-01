//practical n0. 6
public class areacalc {
     double area(float radius)
     {
        double circle=3.14*radius*radius;
        return circle;
     }

     double area(double  len, double breadth)
     {
        double rectangle=len*breadth;     
        return rectangle;
     }

     public static void main(String[] args) {
        
         areacalc obj1=new areacalc();
         areacalc obj2=new areacalc();

         double cir;
         cir= obj1.area(5.0f);//calling function
         
         System.out.println("Area of Circle:"+cir);

         double rec;
         rec= obj1.area(3.0d, 8.0d);
         System.out.println("Area of rectangle:"+rec);

         
     }
}
