public class Arraytest{

    public static void main(String[] args){
        int[][] brody = {
            {1,2,3,4,5},
            {6,7,8,9,0}
        };
        for(int i=0;i<brody.length;i++){
            System.out.println("array at "+i);
            for(int p=0;p<brody[i].length;p++){
                System.out.println(brody[i][p]);
            }
        }
    }
}