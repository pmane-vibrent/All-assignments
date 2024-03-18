public class lab3 {


    static int tax;
    String name;
    int product_id;

    public static void update(int newtax){
        tax=newtax;

    }
    public void printInfo(String name,int product_id){
        update(10);
        this.name=name;
        this.product_id=product_id;

    }

    public static void main(String[] args){

        lab3 l1=new lab3();
        l1.printInfo("Prathmesh",10);
        System.out.println("name:\t"+l1.name+"\nPid\t"+ l1.product_id+"\ntax\t"+tax);
    }

}
