class bubblesort
{
    public static void main(String[] args)
    {
        int i,j;
int arr[]={4,65,76,34,6};
for(i=0;i<arr.length-1;i++);
{
    for(j=0;j<arr.length-i-1;j++);
    {
        if(arr[j]>arr[j+1])
        {
        int temp=arr[j];
        arr[j]=arr[j+1];
        arr[j+1]=temp;
        }
        
    }

}
for( i=0;i<arr.length;i++)
{
    System.out.println(arr[i]);
}
    
    }
}
