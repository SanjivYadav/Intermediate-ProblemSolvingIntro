package sanjiv.intermediate.psintro.bitmanupulation;
/*
* Smallest XOR
* Problem Description :
        Given two integers A and B, find a number X such that A xor X is minimum possible, and the number of set bits in X equals B.

* Example Input
Input 1:

 A = 3
 B = 3
Input 2:

 A = 15
 B = 2


Example Output
Output 1:

 7
Output 2:

 12
* */
public class SmallestXor {
    public static void main(String[] args) {
        int input = 15;
        int b = 2;
        int result = findSmallestXor(input, b);
        System.out.println("Smallest xor is : "+result);
    }

    private static int findSmallestXor(int input, int b){
        int no_of_set_bit = countSetBit(input);
        int diff = b-no_of_set_bit;
        int setbit = 1;
        if(diff >0){
            while(diff >0){
                if((input&setbit) == 0){
                    input |= setbit;
                    diff--;
                }
                setbit <<= 1;
            }
        }
        else{

            while(diff <0) {
                input &= (input - 1);
                diff++;
            }
        }
        return input;
    }

    private static int countSetBit(int input){
        int count =0;
        while(input >0){
            input &= (input -1);
            count++;
        }
        return count;
    }
}
