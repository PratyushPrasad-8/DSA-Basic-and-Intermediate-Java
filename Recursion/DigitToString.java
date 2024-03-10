package Recursion;

class DigitToString{
    public static void convert(int n,String stored[]){
        if(n==0)
        return;
        
        convert(n/10,stored);
        int r=n%10;
        System.out.print(stored[r]);
    }
    
    public static void main(){
        int n=5098;
        String stored[]={"ZERO ","ONE ","TWO ","THREE ","FOUR ","FIVE ","SIX ","SEVEN "," EIGHT ","NINE "};
        
        convert(n,stored);
    }
}