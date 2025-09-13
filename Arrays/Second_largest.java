class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int first=0,second=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>first){
                second=first;
                first=arr[i];
            }
        }
        
        return second;
    }
}