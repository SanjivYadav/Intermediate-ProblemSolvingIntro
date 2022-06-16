package sanjiv.intermediate.psintro;

import java.sql.SQLOutput;
import java.util.Scanner;

public class NaturalNumberSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = findSumOfNNaturalNumberUsingBruteForce(n);
        System.out.println("BruteForce, Sum of N natural numbers :"+sum);
        sum = findSumOfNNaturalNumberUsingOptimaation(n);
        System.out.println("Optimiaed code, Sum of N natural numbers :"+sum);
    }

    private static int findSumOfNNaturalNumberUsingBruteForce(int n){
        int sum =0;
        for(int i = 1;i <= n;i++){
            sum += i;
        }
        return sum;
    }

    private static int findSumOfNNaturalNumberUsingOptimaation(int n){
        return (n*(n+1))/2;
    }
}
