package sanjiv.intermediate.psintro.bitmanupulation;

/*
* Number of 1 Bits:
* Problem Description:
        Write a function that takes an integer and returns the number of 1 bits it has.

* Example Input
Input1:
11


Example Output
Output1:
3
 * */
public class Question1 {
    public static void main(String[] args) {
        int n = 11;
        int no_of_set_bit = countNoOfSetBit(n);
        System.out.println("No of set bits are : "+no_of_set_bit);
    }

    private static int countNoOfSetBit(int n){
        int count =0;
        while(n>0){
            n = n&(n-1);
            count++;
        }
        return count;
    }
}
