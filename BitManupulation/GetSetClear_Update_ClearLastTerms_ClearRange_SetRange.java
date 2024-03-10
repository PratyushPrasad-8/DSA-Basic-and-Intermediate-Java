package BitManupulation;

public class GetSetClear_Update_ClearLastTerms_ClearRange_SetRange{
    public static int getBit(int m,int n){
        //1st method
        //return ((m>>n)&1);
        
        //2nd method
        int bitMask=(1<<n);
        if((m & bitMask)==0)
        return 0;
        else
        return 1;
    }
    
    public static int setBit(int m,int n){
        int bitMask=(1 << n);
        return (m|bitMask);
    }
    
    public static int clearBit(int m,int n){
        int bitMask=(~(1<<n));
        
        return (m&bitMask);
    }
    
    public static int updateBit(int m,int n,int bitValue){
        //1st method
        m=clearBit(m,n);
        
        int bitMask=(bitValue<<n);
        //return m|bitMask;
        
        //2nd method
        if(bitValue==0)
        m=clearBit(m,n);
        else
        m=setBit(m,n);
        
        return m;
    }
    
    public static int clearLastTerms(int m,int n){
        //1st method
        m=((m>>n)<<n);
        return m;
        
        //2nd method
        //int bitMask=((~0)<<n);
        //m=m&bitMask;
        //return m;
    }
    
    public static int clearRange(int m,int i,int j){
        int a=((~0)<<(j+1));
        int b=((1<<i)-1);
        int bitMask=(a|b);
        
        m=m&bitMask;
        return m;
    }
    
    public static int setRange(int m,int i,int j){
        int a=((~0)<<j+1);
        int b=((1<<i)-1);
        
        int bitMask=(~(a|b));
        m=m|bitMask;
        return m;
    }
    
    public static void main(){
        System.out.println(getBit(7,2));
        System.out.println(setBit(5,1));
        System.out.println(clearBit(7,1));
        System.out.println(updateBit(7,1,0));
        System.out.println(clearLastTerms(7,2));
        System.out.println(clearRange(53,1,3));
        System.out.println(setRange(53,1,3));
    }
}