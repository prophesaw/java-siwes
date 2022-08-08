import java.util.*;

public class BadmanPro{
    static String password;
   
     
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name");
        String fname = sc.nextLine();
        System.out.println("Enter last name");
        String lname = sc.nextLine();
        System.out.println("Enter mobile number");
        String number = sc.nextLine();
        if(number.length()==11){
            password = fname + lname;
            System.out.println("your password is " + password); 
        }else{
            System.out.println("re enter your number");
        }

        System.out.println("login with you generated password");
        String npassword = sc.nextLine();
        if(password.equals (npassword)){
            System.out.println("login succesful");
        }else{
            System.out.println("error");
        }
        
        
    }
}