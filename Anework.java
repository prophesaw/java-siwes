import java.util.*;

public class Anework{


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name");
        String user = sc.nextLine();
        if (user != null){
            System.out.println("enter any alphabet in the name entered");
            String search = sc.nextLine();
            int i = user.indexOf(search);
            int nim = i + 1;
            if(i==-1){
                System.out.println("the alphabet is not in your name");
            }else{
                System.out.println("the index is " + i);
                System.out.println("your position is " + nim);
            }
        }else{System.out.println("Re you cant leave here blank");}
    }
}