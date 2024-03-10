package Strings;

public class ShortestPath{
    public static double shortestPath(String s){
        int x=0,y=0;
        for(int i=0;i<s.length();i++){
            switch (s.charAt(i)){
                case 'n': y++;break;
                case 's':y--;break;
                case 'e':x++;break;
                case 'w':x--;break;
            }
        }
        
        return (Math.sqrt((x*x)+(y*y)));
    }
    public static void main(){
        String s="wneenesennn";
        
        System.out.println(shortestPath(s));
    }
}