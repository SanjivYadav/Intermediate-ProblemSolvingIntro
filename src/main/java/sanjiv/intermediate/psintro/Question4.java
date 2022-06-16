package sanjiv.intermediate.psintro;

import java.awt.image.SinglePixelPackedSampleModel;
import java.util.Arrays;

/*
* Pattern Printing
* Problem Description:

    Print a Pattern According to The Given Value of A.

    Example: For A = 3 pattern looks like:

    1 0 0

    1 2 0

    1 2 3
* */
public class Question4 {
    public static void main(String[] args) {
        int input = 3;
        int[][] res = printPattern(input);
        System.out.println("Print Pattern");
        for(int[] row : res){
            for(int ele : row){
                System.out.print(ele + " ");
            }
            System.out.println(" ");
        }
    }

    private static int[][] printPattern(int input){
        int[][] res = new int[input][input];
        for(int i=0;i<input;i++){
            Arrays.fill(res[i],0);
        }
        for(int i=0;i<input;i++){
            for(int j=i;j<input;j++){
                res[j][i]= i+1;
            }
        }
        return res;
    }
}
