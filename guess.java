
import java.util.Scanner;

public class guess{
    public static void main(String[] args) {
        int a=10;
        System.out.println("you have 3 chance to guess the number");
        for(int i=0;i<3;i++)
        {
        
        System.out.println("Guss the number");
        Scanner x= new Scanner(System.in);
        int b=x.nextInt();
        System.out.println(+b);
        if(b==a)
        {
            System.out.println("right guess");
        }
        else 
        {
            if(b<a)
            {
            System.out.println("the number is smaller than aactual number");
            }
            else
            {
                System.out.println("the number is greater than aactual number");
            }
            
        }
        }
}
}

