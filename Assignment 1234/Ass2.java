import java.util.Scanner;

public class Ass2 {

    public static void main(String[] args){

        int num1,num2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Num 1: ");
        num1=sc.nextInt();
        System.out.println("Enter the Num 2: ");
        num2=sc.nextInt();
        int sum=num1+num2;
        System.out.println("The Sum is "+sum);
    }
}
