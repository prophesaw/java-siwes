import java.util.*;

public class NeWork1{
    static String password,npassword;
    static int i=3;
   
     
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name");
        String fname = sc.nextLine();
        System.out.println("Enter last name");
        String lname = sc.nextLine();
        System.out.println("Enter mobile number");
        String number = sc.nextLine();
        String anonumber ="0987654321";
        char newnum = number.charAt(0);
        int a=0;
        int b=0;int count=0;
        do{
            if(number.length()==11 && newnum=='0'){
                for(a=0;a<number.length();a++){
                    for(b=0;b<anonumber.length();b++){
                        if(anonumber.charAt(b)==number.charAt(a)){
                            count++;
                        }
                    }
                }
              
               }
               if(count==11){
                   password = fname + lname;
              System.out.println("your password is " + password); 
             }else{
                 System.out.println("number not correct re enter number");
                 number = sc.nextLine();
               }
       }while(number.length()!=11 && newnum!='0');
        password = fname + lname;
        System.out.println("your password is " + password); 
        System.out.println("login with your generated password");
        npassword = sc.nextLine();
        int p;
        while(i<4){
            if(password.equals(npassword)){
               System.out.println("Login succesful");
               break;
            }else{
               System.out.println("password not correct try AGAIN");
               npassword = sc.nextLine();   

            }
            for(p=0;p<=5;p++){
                if(p==4){
                    System.out.println("account deactivated");
                    System.exit(0);
                }
            }
       }
        
    }
}       