import java.util.*;




public class Initializer{
    public static void main(String[] args){
        Scanner manda = new Scanner (System.in);
        System.out.println("Enter your first name");
        String fname = manda.nextLine();
        System.out.println("Enter your other name");
        String oname = manda.nextLine();
        System.out.println("Enter your surname");
        String sname = manda.nextLine();
        char ffname[] = fname.toCharArray();
        char ooname[] = oname.toCharArray();
        System.out.println(sname +  "." + ffname[0] + "." + ooname[0]);
        }
}