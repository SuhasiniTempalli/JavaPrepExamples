package com.java.stream;

public class KsumPairs {
    public int maxOperations(int[] nums, int k) {
        int operations=0;
        int sum=0;
        int left=0;
        int right=nums.length-1;
        while(left<right){
            if(nums[left]+nums[right]<k){

                left++;

            }

            else if(nums[left]+nums[right]>k){

                right--;

            }
            operations++;
            left++;
            right--;

        }
        return operations;
    }

    public static void main(String[] args) {
        KsumPairs pairs=new KsumPairs();
        int[] nums={4,4,1,3,1,3,2,2,5,5,1,5,2,1,2,3,5,4};
       int pair= pairs.maxOperations(nums,2);
        System.out.println(pair);
    }
}
