import java.util.*;
public class Akalya {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("Enter your number:");
        int num =  a.nextInt();
        if (num >=18) 
        {
            System.out.println(num +" Eligible Person");
        }
        else
        {
            System.out.println(num +" Non Eligible Person");
        };
    }
}
