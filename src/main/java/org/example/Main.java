package org.example;




public class Main {
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5};
        int target=2;
        int result=binarySearch(nums,target);
        if(result!=-1){
            System.out.println("Element found at index: "+result);
        }else{
            System.out.println("Element not found");
        }
    }

    private static int binarySearch(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;

        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }

        return -1;
    }
}