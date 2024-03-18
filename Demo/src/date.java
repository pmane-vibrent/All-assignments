import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class date {

    public static void main(String[] args){
        ArrayList<LocalDate> date=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a new date (YYYY-MM-DD):");
        String newDateString = sc.next();

// Convert the user input to a LocalDate object
        LocalDate newDate = LocalDate.parse(newDateString);
        date.add(newDate);
        System.out.println(date);

    }
}
