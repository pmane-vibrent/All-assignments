import java.util.Scanner;

public class Ass3 {
    public static void main(String[]args){

        String name="I am learning Java";
        String rname="";
        char[] ch=name.toCharArray();
        int len=name.length();

        for(int i=len-1;i>=0;i--)
        {
            rname += name.charAt(i);
        }
        System.out.println(name);
        System.out.println(rname);
    }
}
