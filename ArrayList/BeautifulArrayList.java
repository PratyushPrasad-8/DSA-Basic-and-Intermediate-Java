package ArrayList;

import java.util.ArrayList;
class BeautifulArrayList{
    public static void beautifulArrayList(ArrayList<Integer> list,ArrayList<Integer> ans){
        if(list.size()==0){
            if(isBeautiful(ans))
            System.out.println(ans);
            return ;
        }
        
        for(int i=0;i<list.size();i++){
            int curr=list.get(i);
            list.remove(i);
            ans.add(curr);
            beautifulArrayList(list,ans);
            list.add(i,curr);
            ans.remove(ans.size()-1);
        }
    }
    
    public static boolean isBeautiful(ArrayList<Integer> ans){
        int n=ans.size();
        for(int i=1;i<n-1;i++){
            if(2*ans.get(i)==(ans.get(i-1)+ans.get(i+1)))
            return false;
        }
        
        return true;
    }
    
    public static void main(){
        int n=5;
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<=n;i++){
            list.add(i);
        }
        
        beautifulArrayList(list,new ArrayList<>());
    }
}
