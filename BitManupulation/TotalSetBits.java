package BitManupulation;

public class TotalSetBits{
    public static int totalSetBits(int m){
        int count=0;
        while(m!=0){
            if((m&1)==1)
            count++;
            m=m>>1;
        }
        return count;
    }
    
    public static void main(){
        System.out.println("TOTAL SET BITS : "+totalSetBits(10));
    }
}