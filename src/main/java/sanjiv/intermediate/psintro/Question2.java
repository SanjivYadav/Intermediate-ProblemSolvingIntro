package sanjiv.intermediate.psintro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
* Elements which have at-least two greater elements
*
* Problem Description :
    You are given an array of distinct integers A, you have to find and return all elements in array which have at-least two greater elements than themselves.

    NOTE: The result should have the order in which they are present in the original array.

* Example Input

Input 1:

 A = [1, 2, 3, 4, 5]
Input 2:

 A = [11, 17, 100, 5]


Example Output

Output 1:

 [1, 2, 3]
Output 2:

 [11, 5]
* */
public class Question2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr1 = {11,17,100,5};
        int[] res = countNoOfElementsHavingTwoGreaterApp1(arr1);
        System.out.print("result is : ");
        for(int element : res){
            System.out.print(element + " ");
        }
        System.out.println(" ");

        res = countNoOfElementsHavingTwoGreaterApp2(arr);
        System.out.print("Approach 2 result is : ");
        for(int element : res){
            System.out.print(element + " ");
        }
        System.out.println(" ");

    }

    /*
     * This approach needs Two traversal of the array where in the first loop I find two max.
     * Then count the no of elements in array which are less than atleast these two max.
     * */
    private static int[] countNoOfElementsHavingTwoGreaterApp1(int[] arr){
        //find max1 and max2
        int max1 =Integer.MIN_VALUE;
        int max2 =Integer.MIN_VALUE;
        List<Integer> ls = new ArrayList<Integer>();
        for (int element : arr) {
            if (max1 < element){
                max2 = max1;
                max1 = element;
            }
        }
        //count nos which are strictly smaller and greater than min and max respectively
        for (int element : arr) {
            if (element < max1 && element < max2)
                ls.add(element);
        }
        int[] res = new int[ls.size()];
        for(int i=0;i<ls.size();i++){
            res[i] = ls.get(i);
        }
        return res;
    }

    /*
     * This approach needs only one traversal of the array where we sort the array.
     * Then count the no of elements in array which are less than at least these two max.
     * */
    private static int[] countNoOfElementsHavingTwoGreaterApp2(int[] arr){
        //sort the array
        int[] temp=Arrays.copyOf(arr,arr.length);
        Arrays.sort(temp);
        List<Integer> ls = new ArrayList<Integer>();
        //count nos which are strictly smaller and greater than min and max respectively
        for (int element : arr) {
            if (element < temp[temp.length-1] && element < temp[temp.length-2])
                ls.add(element);
        }
        int[] res = new int[ls.size()];
        for(int i=0;i<ls.size();i++){
            res[i] = ls.get(i);
        }
        return res;
    }


}
