package Arrays;

public class Dublicates_BruteForce{
    public static boolean test(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j])
                return true;
            }
        }
        
        return false;
    }
    public static void main(){
        int arr[]={1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        
        System.out.println(test(arr));
    }
}