class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
     int a=nums1.length  ;
     int b=nums2.length;
     int t=a+b;
     int c[]=new int[t];
     for(int i=0;i<a;i++){
         c[i]=nums1[i];
     }
     for(int i=0;i<b;i++){
         c[a+i]=nums2[i];
     }
     Arrays.sort(c);
     for(int i=0;i<t;i++){
         System.out.print(c[i]);
     }
        //if (t% 2 != 0)
        //    return (double)c[t / 2];
 
        return (double)(c[(t - 1) / 2] + c[t / 2]) / 2.0;

    }
}
