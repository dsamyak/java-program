/*Design a java program that creates class student with attributes roll number, name, branch 
and year that uses constructor. Accept the input values from the user and keep count of number of 
objects created using static variable.
 */
//practical no 7
import java.util.*;
public class student
{
   public int roll,year;
    public String branch;
    static int  count=0;
    student(int roll,String branch,int year)
    {
        this.branch=branch;
        this.roll=roll;
        this.year=year;
        this.count++;

    }

    public static void main(String[] args)
    {
        int roll,year,ch;
        String branch;
        Scanner scanner = new Scanner(System.in);
        
        do
        {
        System.out.print("Enter the choice \n1.Insert student data\n2.display the count of student\n3.exit\n");
        ch=scanner.nextInt();
            switch (ch) 
            {
                case 1:
                System.out.println("Enter the roll number, branch and year:");
                roll = scanner.nextInt();
                branch=scanner.next();
                year = scanner.nextInt();
                student s1=new student(roll,branch,year);
                break;
                case 2:
                System.out.println("Count of Student Data Is:"+count);
                break;
                case 3:
                break;
            } 
        }while(ch!=3);
    }
 }