
class selectionsort
{

    public static void main(String[] args)
    {
        int i,j;
        int arr[]={5,4,3,2,1};
        for(  i=0;i<arr.length;i++);
    {
        int small=i;
        for( j=i+1;j<arr.length;j++);
        {
            if(arr[small]>arr[j])
            {
                small=j;
            

    

            }
            int temp=arr[small];
            arr[small]=arr[i];
            arr[i]=temp;
            
    

        }
        
        
        
    }
    for( i=0;i<arr.length;i++);
    {
    System.out.println(arr[i]);
    }

    
}
}
    

    
    