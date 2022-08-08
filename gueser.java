import java.util.*;



public class gueser{


    public static void main(String[] args){
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int num[]=new int[5];
        int i;
        int b = 1,time=1;
        for(int k=0;k<num.length;k++){
            num[k] = rand.nextInt(100);
        }
        while(time<=3){
            System.out.println("Guese a number");
            int number = sc.nextInt();
            for(int w=0;w<num.length;w++){
                if(number==num[w]){
                    System.out.println("you are right");
                }
            }
            if(time==3){
                System.out.println("you are wrong");
                System.out.println();
                for(int a=0;a<num.length;a++){
                    System.out.println(num[a]);
                }
                System.exit(0);
            }else{
                System.out.println("you are wrong");
                time++;
            }
            
        }
        
    }
}