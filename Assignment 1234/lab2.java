public class lab2 {
    int day;
    int date;
    int year;

    public lab2(){
    day=2;
    date=1;
    year=2024;

    }
    public lab2(int day){
        this.day=day;

    }

    public static void main(String[] args)
    {

        lab2 cal1=new lab2();
        lab2 cal2=new lab2(1);
        System.out.println(cal1.day);
    }
}
