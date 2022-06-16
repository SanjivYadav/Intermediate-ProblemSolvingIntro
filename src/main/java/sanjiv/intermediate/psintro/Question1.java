package sanjiv.intermediate.psintro;

import java.util.Arrays;

/*
* Q1. Smaller and Greater
You are given an Array A of size N.

Find for how many elements, there is a strictly smaller element and a strictly greater element.



Constraints

1 <= N <= 1e5
1 <= A[i] <= 1e6
For Example

Example Input:
    A = [1, 2, 3]

Example Output:
    1

Explanation:
    only 2 have a strictly smaller and strictly greater element, 1 and 3 respectively.
*
*
* */
public class Question1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int count_no_of_smaller_Greater = countNoOfSmallerAndGreaterApp1(arr);
        System.out.println("Using Approach 1 count is : "+ count_no_of_smaller_Greater);

        count_no_of_smaller_Greater = countNoOfSmallerAndGreaterApp2(arr);

        System.out.println("Using Approach 2 count is : "+ count_no_of_smaller_Greater);
    }

    /*
    * This approach needs Two traversal of the array where in the first loop I find min and max.
    * Then count the no of elements in array which are strictly greater and smaller than min and max respectively.
    * */
    private static int countNoOfSmallerAndGreaterApp1(int[] arr){
        //find min and max
        int min = Integer.MAX_VALUE;
        int max =Integer.MIN_VALUE;
        int count =0;
        for (int element : arr) {
            if (min > element)
                min = element;
            if (max < element)
                max = element;
        }
        //count nos which are strictly smaller and greater than min and max respectively
        for (int element : arr) {
            if (element > min && element < max)
                count++;
        }
        return count;
    }

    /*
     * This approach needs only one traversal of the array where first we sort the array.
     * Then count the no of elements in array which are strictly greater and smaller than min and max respectively.
     * TC : O(nlogn)
     * */
    private static int countNoOfSmallerAndGreaterApp2(int[] arr){
        //sort the arrays
        Arrays.sort(arr);
        int lesser = 0;
        int greater = 0;
        int count=0;
        //count nos which are strictly smaller and greater than min and max respectively
        for (int element : arr) {
            lesser =0;
            greater =0;
            if(element>arr[0])
                lesser++;
            if(element<arr[arr.length-1])
                greater++;
            if(lesser > 0 && greater > 0)
                count++;
        }
        return count;
    }

}
