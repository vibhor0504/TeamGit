package leetCode;

public class FindMissingNumber {

    /*1. Find the missing number in the array
You are given an array of positive numbers from 1 to n, such that all numbers from 1 to n are present except one number x. You have to find x. The input array is not sorted. Look at the below array and give it a try before checking the solution.*/


    public static void main (String[] args) {

        int[] arr = {1, 2, 4, 6, 3, 7, 8};
        int n = arr.length+1;
        double expectedSum = (n*(n+1))/2;

        for(int i=0;i<arr.length;i++)
            expectedSum = expectedSum - arr[i];

        System.out.println("missing number is = "+ expectedSum);

    }

}
