// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class SearchingInUnsortedArray{
     static int findelement(int arr[],int n,int key) {
       for(int i=0;i<n;i++)
       {
       if(arr[i]==key)
       {
       return i;
       }
      
       }
        return -1;
    }
    public static void main(String[] args){
        int arr[]={12,34,10,6,40};
        int n=arr.length;
        int key=40;
        int position = findelement(arr,n,key);
        if(position==-1)
        System.out.println("element not found");
        else
        System.out.println("element found at positin :" +(position+1));
    }
}
