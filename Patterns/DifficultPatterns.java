package Patterns;

class DifficultPatterns{
    public static void main(){
        int k;
        for(int i=1;i<=5;i++){
            k=i;
            for(int j=4;j>=i;j--)
            System.out.print(" ");
            for(int j=3;j<=(2*i+1);j++){
                System.out.print(k);
                if(j<((3+(2*i+1))/2))
                k--;
                else
                k++;
            }
            System.out.println();
        }
    }
}