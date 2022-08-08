import java.util.*;

public class task1{


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ten = sc.nextInt();
        int i = ten/2;
        int r = ten%2;
        System.out.println(ten+" R "+r);
        for(int n=0;n<=ten;n++){
             while(ten>=1){
                int div = ten/2;
                ten=div;
                int rem = ten%2;
                System.out.println(div+" R "+rem);
                if (div==1){
                    System.exit(0);
                }
             }  
        }
    }
}
