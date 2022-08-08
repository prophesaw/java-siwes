import java.util.*;

public class newtask{
    Scanner scan = new Scanner(System.in);
    Scanner sc = new Scanner(System.in);
    String proname;
    double proprice;
    int proqty;
    newtask pro[]=new newtask[100];
     int a=0;
    void add(){
        pro[a]=new newtask();
        System.out.println("product name:");
        pro[a].proname=sc.nextLine();
        System.out.println("product price:");
        pro[a].proprice=scan.nextDouble();
        System.out.println("product quantity:");
        pro[a].proqty=scan.nextInt();
        a++;
        home();
    }

    void fetch(){
        System.out.println("Enter product number");
        int search = scan.nextInt();
        System.out.println("NAME:" +pro[search].proname);
        System.out.println("PRICE:" +pro[search].proprice);
        System.out.println("QUANTITY:" +pro[search].proqty);
        home();
    }

    void home(){
        System.out.println("Enter 1 to add \n 2 to search");
        int ops =  scan.nextInt();
        if(ops==1){
            add();
        }else if(ops==2){
            fetch();
        }else{
            System.out.println("INDICATE 1 OR 2!!!");
        }
    }



    public static void main(String[] args){
        newtask npro = new newtask();
        npro.home();
    }
}