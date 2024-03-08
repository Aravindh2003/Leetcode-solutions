class Solution {
    public int maxFrequencyElements(int[] nums) {
     int arr[] = new int[101];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]++;
        }
        Arrays.sort(arr);
        int size=arr.length;
        int j=2;
        int count=arr[size-1];
        while(size>=0 && arr[size-j] == arr[size-j+1]){
            count+=arr[size-j];
         
            j++;
    }
    if(count>arr[size-1]){
        return count;
    }else{
        return arr[size-1];
    }
    }
}


//Approaach 2

class Solution {
    public int maxFrequencyElements(int[] nums) {
        int arr[]=new int[101];
        int s=0;
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]++;
        }
        int count=0;
        for(int j=0;j<arr.length;j++){
           if(count<arr[j]){
               count=arr[j];
           }
        }
        for(int k=0;k<arr.length;k++){
            if(arr[k]==count){
                s+=count;
            }
        }
        return s;
    }
}
