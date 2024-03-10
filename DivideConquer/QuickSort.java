package DivideConquer;

class QuickSort{
    public static void quickSort(int arr[],int si,int ei){
        if(si>=ei)
        return ;
        
        int index=sort(arr,si,ei);
        
        quickSort(arr,si,index-1);
        quickSort(arr,index+1,ei);
    }
    
    public static int sort(int arr[],int si,int ei){
        int pivot=arr[ei];
        int i=si-1;
        
        for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        
        i++;
        int temp=arr[ei];
        arr[ei]=arr[i];
        arr[i]=temp;
        
        return i;
    }
    
    public static void print(int arr[]){
        for(Integer i : arr)
        System.out.println(i);
    }
    
    public static void main(){
        int arr[]={5,6,-2,-4,2,1,0,77,67};
        
        quickSort(arr,0,arr.length-1);
        print(arr);
    }
}