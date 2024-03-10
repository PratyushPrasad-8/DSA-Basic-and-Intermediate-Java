package DivideConquer;

class InversionCount{
    public static int mergeSort(int arr[],int si,int ei){
        if(si==ei)
        return 0;
        
        int count=0;
        int temp=0;
        int mid=si+((ei-si)/2);
        
        temp+=mergeSort(arr,si,mid);
        temp+=mergeSort(arr,mid+1,ei);
        
        int i=si;
        int j=mid+1;
        while(i<=mid && j<=ei){
            if(arr[j]<arr[i]){
                count+=mid+1-i;
                j++;
            }
            else i++;
        }
        
        
        merge(arr,si,mid,ei);
        
        return temp+count;
    }
    
    public static void merge(int arr[],int si,int mid,int ei){
        int temp[]=new int [ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        
        while(i<=mid)
        temp[k++]=arr[i++];
        
        while(j<=ei)
        temp[k++]=arr[j++];
        
        for(k=0,i=si;k<temp.length;k++,i++)
        arr[i]=temp[k];
    }
    
    public static void print(int arr[]){
        for(Integer i : arr)
        System.out.println(i);
    }
    
    public static void main(){
        int arr[]={1,10,3,5,9,6};
        
        System.out.println(mergeSort(arr,0,arr.length-1));
        //print(arr);
    }
}