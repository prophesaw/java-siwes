import java.util.*;

public class reverse{


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter some words");
        String word = sc.nextLine();
        int n;
        String d = "";
        for(n=word.length()-1;n>=0;n--){
            d+=word.charAt(n);
        }
        System.out.println(d);
        if(word.equals(d)){
            System.out.println("they are equal");
        }else{
            System.out.println("not equal");
        }
            
    }
}