
import java.util.Scanner;
public class addition{
    int a;
    int b;
    void sum()
    {
        System.out.println("Sum is " +(a*a+b*b-2*a*b));
    }
    

    public static void main(String args[]){
      Scanner value = new Scanner(System.in);
      addition ad =new addition();
       ad.a  =value.nextInt();
       ad.b  =value.nextInt();
       ad.sum(); 
    }   
}