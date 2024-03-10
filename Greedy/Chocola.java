package Greedy;
import java.util.Arrays;

class Chocola{
    public static void main(){
        int m[]={4,1,2};
        int n[]={2,1,3,1,4};
        
        Arrays.sort(m);
        Arrays.sort(n);
        
        int hp=m.length-1;
        int vp=n.length-1;
        
        int ans=0;
        int horMul=1,verMul=1;
        while(hp>=0 && vp>=0){
            if(m[hp]>=n[vp]){
                ans+=m[hp]*horMul;
                verMul++;
                hp--;
            }else{
                ans+=n[vp]*verMul;
                horMul++;
                vp--;
            }
        }
        
        while(hp>=0){
            ans+=m[hp]*horMul;
            hp--;
        }
        
        while(vp>=0){
            ans+=n[vp]*verMul;
            vp--;
        }
        
        System.out.println(ans);
    }
}