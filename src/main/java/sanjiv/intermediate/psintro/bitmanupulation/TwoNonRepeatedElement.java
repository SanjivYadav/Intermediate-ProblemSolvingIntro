package sanjiv.intermediate.psintro.bitmanupulation;
/*
* Single Number
* Problem Description:
    Given an array of positive integers A, two integers appear only once, and all the other integers appear twice.
    Find the two integers that appear only once.
 *
 * Example Input
Input 1:
A = [1, 2, 3, 1, 2, 4]
Input 2:

A = [1, 2]


Example Output
Output 1:
[3, 4]
Output 2:

[1, 2]
* */
public class TwoNonRepeatedElement {
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 1, 2, 4};
        int[] result = findTwoNonRepeatedElement(input);
        System.out.println("Non repeated numbers are : "+ result[0] + " , "+ result[1]);
    }

    private static int[] findTwoNonRepeatedElement(int[] input){
        int xor_input =0;
        for(int element : input){
            xor_input ^= element;
        }
        int ith_set_bit=0;
        while(xor_input >0){
            if((xor_input & 1) !=0)
                break;
            xor_input = xor_input >>1;
        }
        int xor1 =0;
        int xor2=0;
        for(int ele : input){
            if(((1<<ith_set_bit)&ele) !=0)
                xor1 ^= ele;
            else
                xor2 ^= ele;
        }
        int[] res = new int[2];
        if(xor1 < xor2){
            res[0]=xor1;
            res[1]=xor2;
        }
        else{
            res[0]= xor2;
            res[1]= xor1;
        }
        return res;

    }
}
