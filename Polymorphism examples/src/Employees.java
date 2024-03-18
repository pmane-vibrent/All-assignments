public class Employees {

    private String name;
    private String address;
    private double salary;
    private String job;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Employees(String name, String address, double salary, String job) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.job = job;
    }

    public double calculateBonus(){
        return 0;
    }
    public String generateReport(){
        return "No Record";
    }

    public static void main(String[] args){

        Managers managers=new Managers("Prathmesh","Pune",30000,"Manging",2);
        Programmers programmers=new Programmers("Om","Hadpsar",25000,"Coding","JAVA");
        Developer developer=new Developer("Rudra","Katraj",40000,"Develop","xKotlin");

        System.out.println(managers.generateReport());
        System.out.println(programmers.generateReport());
        System.out.println(developer.generateReport());


        System.out.println("The Bonus of Manager is "+managers.calculateBonus()+" on salary of "+managers.getSalary());
        System.out.println("The Bonus of Programmer is "+programmers.calculateBonus()+" on salary of "+programmers.getSalary());
        System.out.println("The Bonus of Developer is "+developer.calculateBonus()+" on salary of "+developer.getSalary());

    }
}
class Managers extends Employees{
    private int projects;

    public Managers(String name, String address, double salary, String job,int projects) {
        super(name, address, salary, job);
        this.projects=projects;

    }


    public int getProjects() {
        return projects;
    }



    @Override
    public double calculateBonus() {
        return getSalary()*0.10;
    }

    @Override
    public String generateReport() {
        return getName()+" have "+getProjects()+" Under supervision";
    }
}

class Programmers extends Employees{
    private String language;
    public Programmers(String name, String address, double salary, String job, String language) {
        super(name, address, salary, job);
        this.language=language;
    }

    public String getLanguage() {
        return language;
    }

    public void setlanguage(String language) {
        this.language = language;
    }

    @Override
    public double calculateBonus() {
        return getSalary()*0.50;
    }

    @Override
    public String generateReport() {
        return getName()+" Uses "+getLanguage()+" for programming";
    }
}
class Developer extends Employees{
    private String language;
    public Developer(String name, String address, double salary, String job, String language) {
        super(name, address, salary, job);
        this.language=language;
    }

    public String getLanguage() {
        return language;
    }

    public void setlanguage(String language) {
        this.language = language;
    }

    @Override
    public double calculateBonus() {
        return getSalary()*0.50;
    }

    @Override
    public String generateReport() {
        return getName()+" Uses "+getLanguage()+" for Developing";
    }
}
