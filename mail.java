import java.util.Scanner;


public class mail{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter mail id");
        String mailid = sc.nextLine();
        int i;
        int j,q;
        String out = "";
        if((!mailid.contains("@")&&!mailid.contains("."))|| mailid.contains(" ")){
                System.out.println("this is not a mail");
        }else
            {    
            for(i=0;i<mailid.length();i++){
                for(j=0;j<mailid.length();j++){
                    if(mailid.charAt(i)=='@'&&mailid.charAt(j)=='.'){
                        for(q=mailid.indexOf('@')+1;q<=mailid.indexOf('.')-1;q++){
                           // out+=mailid.charAt(q);
                           System.out.print(mailid.charAt(q));
                        }
                    }
                }
                //System.out.print(out);
            }
        }
        
    }
}