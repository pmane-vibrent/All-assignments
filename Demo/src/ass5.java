import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;


class exe implements exerice,operations{

    public void calall(){
        double calburn=0;
        double supcalburn=0;
        Scanner sc=new Scanner(System.in);

        calburn=calculator(calburn,walking,1.5);
        calburn=calculator(calburn,running,2.5);
        calburn=calculator(calburn,cycling,3.5);


        int exit=0;
        while (exit==0){
            System.out.println("Summary type\n1. Aggregate Mode\n2. Detailed mode\3.Exit");
            int ch=sc.nextInt();
            switch (ch){
                case 1:{
                    System.out.println("The total calories burn is " + calburn);
                    System.out.println("The total calories burn using aggregated is " + supcalburn);

                    break;

                }
                case 2:{

                    double cal=0;
                    cal=calculator(cal,walking,1.5);
                    System.out.println("Calories through walking is " +cal);
                    cal=0;
                    cal=calculator(cal,running,2.5);
                    System.out.println("Calories through running is " +cal);
                    cal=0;
                    cal=calculator(cal,cycling,3.5);
                    System.out.println("Calories through cycling is " +cal);
                    printall();
                    System.out.println("The total calories burn is " + calburn);
                    break;
                }
                case 3:{exit=1;break;}
                default:{break;}

            }
        }


    }
    public void printall(){
        System.out.println("Time spend on Walking in min "+walking);
        System.out.println("Time spend on Running in min"+running);
        System.out.println("Time spend on Cycling in min"+cycling);
    }
    public double calculator(double sum,ArrayList<Integer> action,double factor){
        for(int i=0;i<action.size();i++)
            sum+=action.get(i)*factor;


        return sum;
    }
}
class countCal {

    String name;
    ArrayList<LocalDate> date=new ArrayList<>();
    ArrayList<exe> exer=new ArrayList<>();
    Scanner sc=new Scanner(System.in);
    int timeindex=0;



}
public class ass5 {

    public static void main(String[] args){

        ArrayList<countCal> count=new ArrayList<>();
        int choice=1;
        int person=0;
        String tname;
        Scanner sc=new Scanner(System.in);
        while(choice==1)
        {
            System.out.println("____________________________________________________________________\n____________________________________________________________________\nSystem for Count Calories\n____________________________________________________________________\n____________________________________________________________________\n1. Create User\n2. Display Users\n3. Exit\n");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:{
                    count.add(new countCal());
                    System.out.println("Enter the name of the User :");
                    tname=sc.next();
                    count.get(person).name=tname;
                    person++;
                    break;
                }
                case 2:{
                    for(int i=0;i<person;i++) {
                        String pname = count.get(i).name;
                        int j=i+1;
                        System.out.println(j+"."+pname);
                    }
                    int cr;
                    System.out.println("\nEnter the user ID");
                    cr=sc.nextInt();
                    cr=cr-1;
                    System.out.println("Name of user :"+count.get(cr).name);
                    System.out.println("1.Enter date\n2.Calculate\nEnter choice: ");
                    int cho=sc.nextInt();
                    switch (cho) {
                        case 1: {
                            try {
                                System.out.println("Enter a new date (YYYY-MM-DD):");
                                String newDateString = sc.next();
                                LocalDate newDate = LocalDate.parse(newDateString);
                                count.get(cr).date.add(newDate);
                                System.out.println(count.get(cr).date);
                                count.get(cr).timeindex++;
                                count.get(cr).exer.add(new exe());
                            }catch (DateTimeParseException e) {
                                System.out.println("Invalid date format. Please enter a valid date in the format YYYY-MM-DD.");
                            } catch (Exception e) {
                                System.out.println("An unexpected error occurred: " + e.getMessage());
                            }
                            break;
                        }
                        case 2:{
                            System.out.println(count.get(cr).date);
                            String[] dateString=new String[count.get(cr).date.size()];
                            dateString=count.get(cr).date.stream().map(LocalDate::toString).toArray(String[]::new);
                            int len= dateString.length;
                            System.out.println("Enter the Date you want to calculate :");
                            for(int i=0;i<len;i++)
                            {
                                System.out.println(i+1 +" "+dateString[i]);
                            }
                            int stringindex=sc.nextInt();
                            System.out.println("You are entering information for ");
                            System.out.println(dateString[--stringindex]);

                            int ex;
                            int exit=0;
                            int min=0;

                            while(exit==0) {
                                System.out.println("____________________________________________________________________\nEnter time for\n ____________________________________________________________________\n1. Walking\n2. Running\n3.Cycling\n4.Calory count\n5.Exit");
                                ex=sc.nextInt();
                                switch (ex) {

                                    case 1: {
                                        System.out.println("Enter time for walking in min :");
                                        min=sc.nextInt();
                                        count.get(cr).exer.get(stringindex).walking.add(min);
                                        System.out.println(count.get(cr).exer.get(stringindex).walking);
                                        break;

                                    }
                                    case 2: {
                                        System.out.println("Enter time for running in min :");
                                        min=sc.nextInt();
                                        count.get(cr).exer.get(stringindex).running.add(min);
                                        System.out.println(count.get(cr).exer.get(stringindex).running);
                                        break;
                                    }
                                    case 3: {
                                        System.out.println("Enter time for cycling in min :");
                                        min=sc.nextInt();
                                        count.get(cr).exer.get(stringindex).cycling.add(min);
                                        System.out.println(count.get(cr).exer.get(stringindex).cycling);
                                        break;
                                    }
                                    case 4: {
                                        count.get(cr).exer.get(stringindex).calall();
                                        break;
                                    }
                                    case 5: {
                                        exit = 1;
                                        break;
                                    }
                                    default: {
                                    }
                                }
                            }


                            break;
                        }
                    }
                    break;
                }
                case 3:{
                    choice=2;
                    break;
                }
                default:{
                    System.out.println("\nPress valid choice\n");
                    break;
                }
            }
        }


    }


}
