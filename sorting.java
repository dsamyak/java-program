//Create a class Person with attributes name, age, and address. Create minimum 2 objects of this class and print their information.
public class sorting{

    public static void main(String[] args) {
        
        int[] a={50,40,30,20,10};

        for(int i=0;i<a.length-1;i++)
        {
            for (int j=0;j<a.length-1-i; j++) 
            {
                if(a[j+1]<a[j])
                {
                   int temp=a[j];
                   a[j]=a[j+1];
                   a[j+1]=temp; 
                }
            }
        }
        for (int i = 0; i <a.length; i++) 
        {
            System.out.println(a[i]);
        }
    }
}