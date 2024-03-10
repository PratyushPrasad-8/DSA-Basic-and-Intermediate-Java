package Recursion;

class FriendsPairing{
    public static int singlePairing(int n){
        if(n==0 || n==1)
        return 1;
        
        return singlePairing(n-1)+((n-1)*singlePairing(n-2));
    }
    public static void main(){
        int n=3;
        
        System.out.println(singlePairing(n));
    }
}