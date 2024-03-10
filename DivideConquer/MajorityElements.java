package DivideConquer;

class MajorityElements{
    public static int majority(int arr[],int pos,int help[],int key){
        if(pos==arr.length)
        return -1;
        
        help[arr[pos]]++;
        if(help[arr[pos]]>key)
        return arr[pos];
        
        return majority(arr,pos+1,help,key);
    }
    
    public static void main(){
        //int arr[]={2,2,1,1,1,2,2};
        int arr[]={3,2,3};
        int key=arr.length/2;
        
        int max=0;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }
        int help[]=new int[max+1];
        
        System.out.print(majority(arr,0,help,key));
    }
}