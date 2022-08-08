import java.util.*;


public class Mypro{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String name = sc.nextLine();
        char inum[]= name.toCharArray();
        System.out.println("The number of character in your word is " + inum.length);
    }
}