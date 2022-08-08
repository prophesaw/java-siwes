import java.util.Scanner;

public class Demo{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name");
        String name = sc.nextLine();
        int sp = 0;
        int a;
        for (a=0;a<name.length();a++){
            if(name.charAt(a)==' '){ 
                sp++;
            }
        }
        System.out.println(sp);
    }
}