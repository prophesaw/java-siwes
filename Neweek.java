import java.util.*;




public class Neweek{


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your fullname");
        String myvar = sc.nextLine();
        String anvar = myvar.trim();
        int a,b;
        System.out.print(Character.toUpperCase(anvar.charAt(0))+".");
        for(a=0; a<anvar.lastIndexOf(" ");a++){
            if(anvar.charAt(a)==' '){
               int c = a + 1;
                System.out.print(Character.toUpperCase(anvar.charAt(c))+".");

            }
        }
        int op = anvar.lastIndexOf(' ') + 1;
        for(b=op;b<anvar.length();b++){
            System.out.print(Character.toUpperCase(anvar.charAt(b)));

        }
        
    }
}