package DivideConquer;

class MergeSort_Strings{
    public static void mergeSort(String s[],int si,int ei){
        if(si==ei)
        return;
        
        int mid=si+(ei-si)/2;
        
        mergeSort(s,si,mid);
        mergeSort(s,mid+1,ei);
        
        merge(s,si,mid,ei);
    }
    
    public static void merge(String s[],int si,int mid,int ei){
        String temp[]=new String[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        
        while(i<=mid && j<=ei){
            if(s[i].compareTo(s[j])<0)
            temp[k++]=s[i++];
            else
            temp[k++]=s[j++];
        }
        
        while(i<=mid)
        temp[k++]=s[i++];
        
        while(j<=ei)
        temp[k++]=s[j++];
        
        for(i=0,j=si;i<k;i++,j++){
            s[j]=temp[i];
        }
    }
    
    public static void print(String arr[]){
        for(String i : arr)
        System.out.println(i);
    }
    
    public static void main(){
        String s[]={"neptune","sun","moon","mars","earth","jupiter","saturn"};
        
        mergeSort(s,0,s.length-1);
        print(s);
    }
}