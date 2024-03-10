package OOPS;

class TryCatch{
    public static void main(){
        int arr[]=new int[3];
        try{
            for(int i=0;i<3;i++){
                arr[i]=3;
                System.out.println(arr[i]);
                System.out.println(5/0);
            }
        }
        catch(Exception e){
            System.out.println("SOME THING WENT WRONG");
        }
        finally{
            System.out.println("HELLO");
        }
        
    }
}