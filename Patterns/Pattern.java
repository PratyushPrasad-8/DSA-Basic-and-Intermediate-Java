package Patterns;

class Pattern{
    public static void main(){
        char ch='A';
        for(int i=0;i<4;i++){
            for(int j=0;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}