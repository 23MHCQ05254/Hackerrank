class Second_largest {
    public int getSecondLargest(int[] arr) {
        // code here
        int first=-1,second=-1;
        for(int i=0;i<arr.length;i++)
        {
                if(arr[i]>second && arr[i]<first){
                    second=arr[i];
                }
                
                else if(arr[i]>first){
                    second=first;
                    first=arr[i];
                }
        }
        
        return second;
    }
}