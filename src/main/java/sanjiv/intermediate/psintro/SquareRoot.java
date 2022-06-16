package sanjiv.intermediate.psintro;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = findSQRTUsingBruteForce(n);
        System.out.println("BruteForce, Sum of N natural numbers :"+sum);
        sum = findSQRTUsingBinarySearch(n);
        System.out.println("Binary Search code, Sum of N natural numbers :"+sum);
    }

    private static int findSQRTUsingBruteForce(int N){
        for(int i=1;i<=N;i++){
            if(i*i >N)
                return i-1;
        }
        return 0;
    }

    private static int findSQRTUsingBinarySearch(int N){
        int s=1;
        int e = N;
        int ans=0;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(mid*mid <= N){
                ans =mid;
                s = mid+1;
            }else
                e = mid-1;
        }
        return ans;
    }
}
