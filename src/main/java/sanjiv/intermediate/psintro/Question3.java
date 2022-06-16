package sanjiv.intermediate.psintro;
/*
*  MINIMUM PICKS
* Problem Description:
        You are given an array of integers A of size N.
        Return the difference between the maximum among all even numbers of A and the minimum among all odd numbers in A.
 *
 *
 * Example Input
Input 1:

 A = [0, 2, 9]
Input 2:

 A = [5, 17, 100, 1]


Example Output
Output 1:

-7
Output 2:

99
* */
public class Question3 {
    public static void main(String[] args) {
        int[] arr = {5, 17, 100, 1};
        int res = findDiffOfEvenMaxOddMin(arr);
        System.out.println("Result : "+res);
    }

    private static int findDiffOfEvenMaxOddMin(int[] arr){
        int evenMax = Integer.MIN_VALUE;
        int oddMin = Integer.MAX_VALUE;
        for(int element : arr){
            if(element%2==0 && evenMax < element)
                evenMax = element;
            if(element%2 !=0 && oddMin > element)
                oddMin = element;
        }
        return evenMax-oddMin;
    }
}
