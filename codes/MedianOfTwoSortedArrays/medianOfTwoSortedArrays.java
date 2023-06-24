class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int arr1Size = nums1.length;
        int arr2Size = nums2.length;
        int arr1ptr = 0;
        int arr2ptr = 0;
        int[] merge = new int[arr1Size + arr2Size];
        for (int i = 0; i < merge.length; i++) {
            if(arr1ptr < arr1Size && arr2ptr < arr2Size) {
                if(nums1[arr1ptr] < nums2[arr2ptr]) {
                    merge[i] = nums1[arr1ptr];
                    arr1ptr++;
                } else {
                    merge[i] = nums2[arr2ptr];
                    arr2ptr++;
                }
            } else if(arr1ptr < arr1Size) {
                merge[i] = nums1[arr1ptr];
                arr1ptr++;
            } else {
                merge[i] = nums2[arr2ptr];
                arr2ptr++;
            }
        }
        int middle = merge.length/2;
        if(merge.length % 2 == 0) {
            return (merge[middle] + merge[middle-1])/2.0;
        } else {
            return merge[middle];
        }
    }
}
